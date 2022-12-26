package com.xworkz.spring.server.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.server.dto.TempleDTO;

@Component
public class TempleRepoImpl implements TempleRepo {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean Save(TempleDTO dto) {

		System.out.println("Save method in TempleRepoImpl");
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			EntityTransaction transaction = createEntityManager.getTransaction();
			transaction.begin();
			createEntityManager.persist(dto);
			transaction.commit();
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			createEntityManager.close();
		}

		return true;
	}
	
	@Override
	public Optional<List<TempleDTO>> findByGod(String god) {
		System.out.println("running findByGod in repo " + god);
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			Query query = createEntityManager.createNamedQuery("findByGod");
			query.setParameter("gd", god);
			return Optional.ofNullable(query.getResultList());
		} 
		finally {
			createEntityManager.close();
			System.out.println("Closing entity manager");
		}
	}

}
