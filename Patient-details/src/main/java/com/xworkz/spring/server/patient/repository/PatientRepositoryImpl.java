package com.xworkz.spring.server.patient.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.server.patient.entity.PatientEntity;

@Component
public class PatientRepositoryImpl implements PatientRepository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(PatientEntity entity) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(entity);
			transaction.commit();
		} catch (PersistenceException e) {
			e.getMessage();
		}

		finally {
			entityManager.close();

		}
		return true;
	}

	@Override
	public Optional<List<PatientEntity>> findByName(String name, int greaterThanAge, int lesserThanAge) {
		EntityManager entityManager = factory.createEntityManager();

		try {
			Query namedQuery = entityManager.createNamedQuery("findByNameOrAgeGreatherThanOrAgeLesserThan");
			namedQuery.setParameter("nm", name);
			namedQuery.setParameter("ag", greaterThanAge);
			namedQuery.setParameter("al", lesserThanAge);
			return Optional.ofNullable(namedQuery.getResultList());
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			entityManager.close();
		}
		return PatientRepository.super.findByName(name, greaterThanAge, lesserThanAge);

	}

	@Override
	public Optional<List<PatientEntity>> findByQuery(String query) {
		EntityManager entityManager = factory.createEntityManager();

		try {
			Query createQuery = entityManager.createQuery(query);
			return Optional.ofNullable(createQuery.getResultList());

		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			entityManager.close();
		}

		return PatientRepository.super.findByQuery(query);
	}

	@Override
	public List<PatientEntity> findByEmail(String email) {
		EntityManager entityManager = factory.createEntityManager();
		Query namedQuery = entityManager.createNamedQuery("findByEmail");
		namedQuery.setParameter("em", email);
		List list = namedQuery.getResultList();
		if (list.isEmpty()) {
			System.out.println("Email Id Is Valid and Saved:" + email);
			return null;
		} else if (!list.isEmpty()) {
			System.out.println("email-Id is already in use Change email-Id" + email);
			return list;
		}

		return null;
	}

	@Override
	public List<PatientEntity> findByMobileNo(long mobileNo) {

		EntityManager entityManager = factory.createEntityManager();
		Query namedQuery = entityManager.createNamedQuery("findByMobileNo");
		namedQuery.setParameter("mn", mobileNo);
		List resultList = namedQuery.getResultList();
		if (resultList.isEmpty()) {
			System.out.println("mobileNo result ist is empty" + mobileNo);

			return null;
		} else if (!resultList.isEmpty()) {
			System.out.println("mobileNo is present" + mobileNo);
			return resultList;
		}

		return null;
	}

}
