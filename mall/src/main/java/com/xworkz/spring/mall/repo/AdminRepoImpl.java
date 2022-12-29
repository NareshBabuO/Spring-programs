package com.xworkz.spring.mall.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.mall.dto.AdminDTO;

@Component
public class AdminRepoImpl implements AdminRepo {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(AdminDTO dto) {
		System.out.println("save method in Admin ");
		
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			entityManager.close();
		}

		return true;
	}

}
