package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		em.close();
		emf.close();
	}
}
