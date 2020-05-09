package org.gelm.portal.controller;

import java.util.Optional;

import org.gelm.portal.entity.LiferayUser;
import org.gelm.portal.service.LiferayUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {

	@Autowired
	private LiferayUserService liferayUserService;
	
	@GetMapping(value = {"/welcome"})
	public String welcome() {
		return "Welcome ";
	}
	@GetMapping(value = {"/getUser/{gelappuserid}"})
	public Optional<LiferayUser> getLiferayUser(@PathVariable("gelappuserid") String userName) {
		return liferayUserService.getLiferayUser(userName);
	}
	@GetMapping(value = {"/getUserBean/{gelappuserid}"})
	public LiferayUser getLiferayUserBean(@PathVariable("gelappuserid") String userName) {
		return liferayUserService.getLiferayUserBean(userName);
	}
	
}
