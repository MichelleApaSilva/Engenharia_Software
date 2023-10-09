package control;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Livro;

public class LivroControle {
	private EntityManager em;
	
	public LivroControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
	}
	
	public void inserir(Livro objeto) {
		try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	
	public void alterar(Livro objeto) {
		 try {
	            em.getTransaction().begin();
	            em.merge(objeto);
	            em.getTransaction().commit();
	         } catch (Exception ex) {
	            ex.printStackTrace();
	            em.getTransaction().rollback();
	         }
	}
	
	public void excluir(Livro objeto) {
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
            Livro objeto = buscarPorId(id);
            excluir(objeto);
         } catch (Exception ex) {
            ex.printStackTrace();
         }
	}
	
	public Livro buscarPorId(Integer id) {
		return em.find(Livro.class, id);
	}
	
	public List<Livro> buscarTodos() {
		String nomeClasse = Livro.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();
	}

}
