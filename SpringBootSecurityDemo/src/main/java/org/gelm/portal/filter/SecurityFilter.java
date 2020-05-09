package org.gelm.portal.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gelm.portal.service.SecurityUserService;
import org.gelm.portal.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
@Component
public class SecurityFilter extends OncePerRequestFilter{

	@Autowired
	private JwtUtil jwt;
	
	@Autowired
	private SecurityUserService userSecurityService;
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String token="";
		String userName="";
		String authorizationHeader=request.getHeader("Authorization");
		
		if(authorizationHeader!=null&&authorizationHeader.startsWith("Bearer")) {
			token=authorizationHeader.substring(7);
			userName=jwt.extractUsername(token);
		}
		if(userName!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
			UserDetails userDetails=userSecurityService.loadUserByUsername(userName);
			
			if(jwt.validateToken(token, userDetails)) {
				
				UsernamePasswordAuthenticationToken userNamePasswordToken=
				new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
				userNamePasswordToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request)); 
				SecurityContextHolder.getContext().setAuthentication(userNamePasswordToken); 
 				
			}
		}
		filterChain.doFilter(request, response);
	}

}
