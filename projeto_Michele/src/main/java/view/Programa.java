package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Livro;
import model.Reserva;
import model.Usuario;
import model.Requisicao;

public class Programa {
	public static void main(String[] args) throws ParseException{
		Livro l1 = new Livro(null, "SQL Seus met�dos", "Ana Maria Silva", "SQL Editor Independente", 34957239486L);
		Livro l2 = new Livro(null, "Romance Seus met�dos", "Pedro Henrique Silva", "RomanceEditor Independente", 62963152879L);
		Livro l3 = new Livro(null, "Auto-Ajuda Seus met�dos", "Jos� Batista Ferreira", "Auto-Ajuda Editor Independente", 32658412987L);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		String dataReservaString1 = "2022/01/01";
        String dataExpiracaoString1 = "2022/05/01";
        
        String dataReservaString2 = "2022/15/02";
        String dataExpiracaoString2 = "2022/20/02";
        
        Date dataReserva1 = sdf.parse(dataReservaString1);
        Date dataExpiracao1 = sdf.parse(dataExpiracaoString1);
        
        Date dataReserva2 = sdf.parse(dataReservaString2);
        Date dataExpiracao2 = sdf.parse(dataExpiracaoString2);
		
        Reserva r1 = new Reserva(null, dataReserva1, dataExpiracao1);
        Reserva r2 = new Reserva(null, dataReserva2, dataExpiracao2);
		
		Usuario u1 = new Usuario(null, "Ana Maria Rosa da Silva", "anamariarosasilva@iftm.edu.br", "94622835555", "Av Liberdade, 200,Pampulha, Uberlândia, MG", "34957239455");
		Usuario u2 = new Usuario(null, "Maria Eduarda Sousa Martins", "mariaeduardasousamartins@iftm.edu.br", "94645628955", "Rua Ribeirão, 2200,Centro, Uberlândia, MG", "34985695896");
		
		String dataRequisicaoString1 = "2022/09/25";
		String dataRequisicaoString2 = "2022/08/15";
		
		Date dataRequisicao1 = sdf.parse(dataRequisicaoString1);
		Date dataRequisicao2 = sdf.parse(dataRequisicaoString2);
		
		Requisicao req1 = new Requisicao(null, dataRequisicao1, "Indeferido");
		Requisicao req2 = new Requisicao(null, dataRequisicao2, "Aguardando Compra");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(l1); // chama o gerenciador de tabelas(em) para fazer o comando insert relacionado ao presente livro (l1)
		em.persist(l2);
		em.persist(l3);
		
		em.persist(r1);
		em.persist(r2);
		
		em.persist(u1);
		em.persist(u2);
		
		em.persist(req1);
		em.persist(req2);

		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
