package org.gelm.portal.service;

import org.gelm.portal.entity.LiferayUser;
import org.gelm.portal.repository.LiferayUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiferayUserService {

	@Autowired(required = true)
	private LiferayUserRepository liferayUserRepository;
	
	public LiferayUser getLiferayLoginUser(String userName) {
		return liferayUserRepository.getUserById(userName);
	}
}
