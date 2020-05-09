package org.gelm.portal.service;

import java.util.Optional;

import org.gelm.portal.entity.LiferayUser;
import org.gelm.portal.repository.LiferayUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LiferayUserService {

	@Autowired
	private LiferayUserRepository liferayUserRepo;
	
	public Optional<LiferayUser> getLiferayUser(String userName) {
		return liferayUserRepo.findById(userName);
	}
	
	public LiferayUser getLiferayUserBean(String userName) {
		return liferayUserRepo.getLiferayUser(userName);
	}
}
