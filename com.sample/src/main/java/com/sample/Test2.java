package com.sample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test2 {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	
	Student stu =entityManager.find(Student.class,0);
	if (stu!=null) {
		System.out.println("Student id is"+stu.getId());
		System.out.println("Student name is "+stu.getName());
		System.out.println("Student percentage is "+stu.getPercentage());
	}
	else {
		System.out.println("Enter proper Student id /Student not found");
	}
	
}
}
