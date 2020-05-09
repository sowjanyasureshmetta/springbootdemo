package org.gelm.portal.controller;

import org.gelm.portal.dto.AuthRequest;
import org.gelm.portal.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@Autowired
	private JwtUtil jwt;
	@Autowired
	private AuthenticationManager authManager;
	
	@GetMapping(value = {"/welcome"})
	public String welcome() {
		return "Hello , Welcome to Security Demo";
	}
	@PostMapping(value = {"/authenticate"})
	public String generateToken(@RequestBody AuthRequest authRequest)
	{
		try {
		authManager.authenticate
		(new UsernamePasswordAuthenticationToken
		(authRequest.getUserName(), authRequest.getPassword()));
		}catch (Exception e) {
			e.printStackTrace();
		}
		return jwt.generateToken(authRequest.getUserName());
	}
	
}
