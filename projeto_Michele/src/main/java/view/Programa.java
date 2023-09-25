package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Livro;
import model.Reserva;

public class Programa {
	public static void main(String[] args) throws ParseException{
		Livro l1 = new Livro(null, "SQL Seus metódos", "Ana Maria Silva", "SQL Editor Independente", 34957239486L);
		Livro l2 = new Livro(null, "Romance Seus metódos", "Pedro Henrique Silva", "RomanceEditor Independente", 62963152879L);
		Livro l3 = new Livro(null, "Auto-Ajuda Seus metódos", "José Batista Ferreira", "Auto-Ajuda Editor Independente", 32658412987L);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String dataReservaString1 = "01/01/2022";
        String dataExpiracaoString1 = "05/01/2022";
        
        String dataReservaString2 = "15/02/2022";
        String dataExpiracaoString2 = "20/02/2022";
        
        Date dataReserva1 = sdf.parse(dataReservaString1);
        Date dataExpiracao1 = sdf.parse(dataExpiracaoString1);
        
        Date dataReserva2 = sdf.parse(dataReservaString2);
        Date dataExpiracao2 = sdf.parse(dataExpiracaoString2);
		
        Reserva r1 = new Reserva(null, dataReserva1, dataExpiracao1);
        Reserva r2 = new Reserva(null, dataReserva2, dataExpiracao2);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(l1); // chama o gerenciador de tabelas(em) para fazer o comando insert relacionado ao presente livro (l1)
		em.persist(l2);
		em.persist(l3);
		
		em.persist(r1);
		em.persist(r2);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
