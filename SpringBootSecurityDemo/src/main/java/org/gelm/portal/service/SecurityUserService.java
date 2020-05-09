package org.gelm.portal.service;

import java.util.ArrayList;

import org.gelm.portal.entity.LiferayUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityUserService implements UserDetailsService{

	@Autowired
	private LiferayUserService liferayUserService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		LiferayUser liferayUser=liferayUserService.getLiferayLoginUser(username);
		return new User(liferayUser.getId(), liferayUser.getPassword(), new ArrayList<>());
	
	}
	
}
