package control;

import model.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class UsuarioControle {
    private EntityManager em;

    public UsuarioControle() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
        em = emf.createEntityManager();
    }

    public void inserir(Usuario objeto) {
        executarTransacao(em -> em.persist(objeto));
    }

    public void alterar(Usuario objeto) {
        executarTransacao(em -> em.merge(objeto));
    }

    public void excluir(Usuario objeto) {
        executarTransacao(em -> em.remove(objeto));
    }

    public void excluirPorId(Integer id) {
        Usuario objeto = buscarPorId(id);
        if (objeto != null) {
            excluir(objeto);
        }
    }

    public Usuario buscarPorId(Integer id) {
        return em.find(Usuario.class, id);
    }

    public List<Usuario> buscarTodos() {
        return criarConsulta("FROM Usuario").getResultList();
    }

    public List<Usuario> buscarPorNome(String nome) {
        return criarConsulta("FROM Usuario WHERE nome LIKE :nome", "nome", "%" + nome + "%").getResultList();
    }

    public List<Usuario> buscarPorCpf(String cpf) {
        return criarConsulta("FROM Usuario WHERE cpf LIKE :cpf", "cpf", "%" + cpf + "%").getResultList();
    }

    // Método auxiliar para criar consultas com parâmetros
    private TypedQuery<Usuario> criarConsulta(String jpql, String parametro, String valor) {
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
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
