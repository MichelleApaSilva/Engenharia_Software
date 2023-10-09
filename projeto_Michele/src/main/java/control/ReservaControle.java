package control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Reserva;

public class ReservaControle {
	private EntityManager em;
	
	public ReservaControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
	}
	
	public void inserir(Reserva objeto) {
		try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	
	public void alterar(Reserva objeto) {
		 try {
	            em.getTransaction().begin();
	            em.merge(objeto);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }
	}
	
	public void excluir(Reserva objeto) {
		try {
            em.getTransaction().begin();
            em.remove(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	
	public void excluirPorId(Integer id) {
		try {
            Reserva objeto = buscarPorId(id);
            excluir(objeto);
         } catch (Exception ex) {
            ex.printStackTrace();
         }
	}
	
	public Reserva buscarPorId(Integer id) {
		return em.find(Reserva.class, id);
	}
	
	public List<Reserva> buscarTodos() {
		String nomeClasse = Reserva.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();
	}

}
