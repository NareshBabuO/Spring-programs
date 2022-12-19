package com.xworkz.spring.server.busstand.repo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.server.busstand.dto.BusStandDTO;

@Component
public class BusStandRepoImpl implements BusStandRepo {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean Save(BusStandDTO dto) {
		System.out.println("Save method in BusStandRepoImpl");
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
	public Optional<List<BusStandDTO>> findByLocation(String location) {
		EntityManager entityManager = factory.createEntityManager();

		try {
			Query createNamedQuery = entityManager.createNamedQuery("findByLocation");
			createNamedQuery.setParameter("lc", location);
			return Optional.ofNullable(createNamedQuery.getResultList());
		} finally {
			entityManager.close();
			System.out.println("Closing entity manager");
		}

	}

}
