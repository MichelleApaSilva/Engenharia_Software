package control;

import model.Reserva;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ReservaControle {
    private EntityManager em;

    public ReservaControle() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
        em = emf.createEntityManager();
    }

    public void inserir(Reserva objeto) {
        executarTransacao(em -> em.persist(objeto));
    }

    public void alterar(Reserva objeto) {
        executarTransacao(em -> em.merge(objeto));
    }

    public void excluir(Reserva objeto) {
        executarTransacao(em -> em.remove(objeto));
    }

    public void excluirPorId(Integer id) {
        Reserva objeto = buscarPorId(id);
        if (objeto != null) {
            excluir(objeto);
        }
    }

    public Reserva buscarPorId(Integer id) {
        return em.find(Reserva.class, id);
    }

    public List<Reserva> buscarTodos() {
        return criarConsulta("FROM Reserva").getResultList();
    }

    // Método auxiliar para criar consultas com parâmetros
    private TypedQuery<Reserva> criarConsulta(String jpql, String parametro, String valor) {
        TypedQuery<Reserva> query = em.createQuery(jpql, Reserva.class);
        if (parametro != null && valor != null) {
            query.setParameter(parametro, valor);
        }
        return query;
    }

    // Método auxiliar para executar transações
    private void executarTransacao(TransacaoExecutor executor) {
        try {
            em.getTransaction().begin();
            executor.executar(em);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            em.getTransaction().rollback();
        }
    }

    // Interface funcional para o Executor de transações
    @FunctionalInterface
    private interface TransacaoExecutor {
        void executar(EntityManager em);
    }
}
