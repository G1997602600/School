package com.sample;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test1 {
public static void main(String[] args) {
	Student stu= new Student();
	stu.setId(3);
	stu.setName("deepu");
	stu.setPercentage(65.94);
	Student stu1= new Student();
	stu1.setId(2);
	stu1.setName("baby");
	stu1.setPercentage(99.98);
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
EntityManager entityManager= entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction= entityManager.getTransaction();
entityTransaction.begin();
entityManager.persist(stu);
entityManager.persist(stu1);
entityTransaction.commit();
	
}
}
