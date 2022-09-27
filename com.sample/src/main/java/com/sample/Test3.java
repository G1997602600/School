package com.sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test3 {
	public static void main(String[] args) {
		Student student= new Student();
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		if (student!=null) {
			entityManager.find(Student.class,1);
			entityManager.remove(student);;	
			entityTransaction.commit();
		}
		

	}
}
