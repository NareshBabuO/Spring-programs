package com.xworkz.spring.server.oyo.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.server.oyo.entity.OyoRoomEntity;

@Component
public class OyoRoomRepoImpl implements OyoRoomRepo {

	public OyoRoomRepoImpl() {
		System.out.println("OyoRoomRepoImpl default constr...");
	}

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean Save(OyoRoomEntity entity) {
		System.out.println("Save method in OyoRoomRepoImpl");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			createEntityManager.persist(entity);
			transaction.commit();
		} catch (PersistenceException e) {
			e.getStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();

		}
		return true;
	}

}
