package control;

import java.util.List;
import model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//Autor : Ramiro

public class UsuarioControle {
	private EntityManager em;
	
	public UsuarioControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
			em = emf.createEntityManager();
	}
	
	public void inserir(Usuario objeto) {
        try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	
	public void alterar(Usuario objeto) {
        try {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	
	public void excluir(Usuario objeto) {
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
        	Usuario objeto = buscarPorId(id);
            excluir(objeto);
         } catch (Exception ex) {
            ex.printStackTrace();
         }
	}
	
	public Usuario buscarPorId(Integer id) {
		return em.find(Usuario.class, id);
	}
	
	public List<Usuario> buscarTodos() {
		String nomeClasse = Usuario.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();
	}

}
