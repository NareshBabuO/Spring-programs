package com.xworkz.spring.criminal.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.criminal.entity.CriminalEntity;

@Component
public class CriminalRepoImpl implements CriminalRepo {

	public CriminalRepoImpl() {
		System.out.println("CriminalRepoImpl Default Const...");
	}

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean Save(CriminalEntity entity) {
		System.out.println("Save method in Criminal RepoImpl");
		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(entity);
			transaction.commit();
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			entityManager.close();
		}

		return true;
	}

	@Override
	public Optional<List<CriminalEntity>> findByNameAndJailName(String name, String jailName) {

		System.out.println("find by name and find by jail name method is running in Criminal");
		EntityManager entityManager = factory.createEntityManager();
		Query namedQuery = entityManager.createNamedQuery("findByNameAndJailName");
		namedQuery.setParameter("nm", name);
		namedQuery.setParameter("jn", jailName);
		List list = namedQuery.getResultList();
		if (list != null) {
			System.out.println("data is present");
			return Optional.ofNullable(list);
		} else {
			System.out.println("data is not present");
			return Optional.empty();
		}

	}

}
