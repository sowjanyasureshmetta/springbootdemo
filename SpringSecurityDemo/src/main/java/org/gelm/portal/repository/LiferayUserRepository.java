package org.gelm.portal.repository;

import org.gelm.portal.entity.LiferayUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiferayUserRepository extends JpaRepository<LiferayUser, String>{
	
	public LiferayUser getLiferayUser(String userName);
}
