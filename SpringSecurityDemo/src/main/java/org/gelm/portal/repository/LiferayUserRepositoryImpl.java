package org.gelm.portal.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.gelm.portal.entity.LiferayUser;
import org.springframework.stereotype.Component;

@Component
public class LiferayUserRepositoryImpl{

	@PersistenceContext
    private EntityManager entityManager;

    public LiferayUser getLiferayUser(String userName) {
        String hql = "SELECT e FROM LiferayUser e WHERE e.userName = :username";
        TypedQuery<LiferayUser> query = entityManager.createQuery(hql, LiferayUser.class);
        query.setParameter("username", userName);
        return query.getSingleResult();
    }
	
}
