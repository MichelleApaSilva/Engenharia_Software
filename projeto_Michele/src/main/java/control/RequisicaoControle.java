package control;

import java.util.List;
import model.Requisicao;
import model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//Autor : Ramiro

public class RequisicaoControle {
	private EntityManager em;
	
	public RequisicaoControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
	}
	
	public void inserir(Requisicao objeto) {
        try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	
	public void alterar(Requisicao objeto) {
        try {
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
         }
	}
	
	public void excluir(Requisicao objeto) {
        try {
            em.getTransaction().begin();
            em.remove(objeto);
            em.getTransaction().commit();
         } catch (Exception ex) {
            //ex.printStackTrace();
            System.out.println("Não foi possível excluir.");
            em.getTransaction().rollback();
         }
	}
	
	public void excluirPorId(Integer id) {
        try {
        	Requisicao objeto = buscarPorId(id);
            excluir(objeto);
         } catch (Exception ex) {
            //ex.printStackTrace();
        	System.out.println("Não foi possível excluir.");
         }
	}
	
	public Requisicao buscarPorId(Integer id) {
		return em.find(Requisicao.class, id);
	}
	
	public List<Requisicao> buscarTodos() {
		String nomeClasse = Requisicao.class.getName();
		return em.createQuery("FROM " + nomeClasse).getResultList();
	}
	
}
