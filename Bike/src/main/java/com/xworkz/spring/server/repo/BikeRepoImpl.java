package com.xworkz.spring.server.repo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.server.dto.BikeDTO;

@Component
public class BikeRepoImpl implements BikeRepo {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean Save(BikeDTO dto) {
		System.out.println("Save method in BikeRepoImpl");
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
	public Optional<List<BikeDTO>> findByBrand(String brand) {
		System.out.println("Running findByBrand in repo" + brand);
		EntityManager entityManager = factory.createEntityManager();
		try {
			Query namedQuery = entityManager.createNamedQuery("findByBrand");
			namedQuery.setParameter("bd", brand);
			return Optional.ofNullable(namedQuery.getResultList());

		} finally {
			entityManager.close();
			System.out.println("Closing entity manager");

		}
	}
}
