package teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test1 {
public static void main(String[] args) {
	Teacher teacher= new Teacher();
	teacher.setEmail("Email done");
	teacher.setName("mummy");
	teacher.setSubject("life");
	teacher.setPassword(" some lesson");
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist( teacher);
	entityTransaction.commit();
	entityManager.close();
	
}
}
