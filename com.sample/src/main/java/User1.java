import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import school_app_hibernate_dto.User;

public class User1 {
public static void main(String[] args) {
	User user= new User();
	user.setName("Narendra modi");
	user.setEmail("modimama@mail.com");
EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vikas");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction= entityManager.getTransaction();
entityManager.persist(user);
}
}