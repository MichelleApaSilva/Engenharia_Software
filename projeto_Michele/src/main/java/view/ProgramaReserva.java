package view;

import java.time.Instant;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import control.ReservaControle;
import model.Reserva;

public class ProgramaReserva {
	public static void main(String[] args) {
		//inserindo
		Reserva novo = new Reserva(null, null, null, null);		
		ReservaControle controle = new ReservaControle();	
		controle.inserir(novo);
		Integer idnovo = novo.getCodReserva();
		
		//buscando
		novo = controle.buscarPorId(idnovo); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(novo.getCodReserva()); // substitua por um método get do seu projeto
		
		//modificando
		novo.setDataExpiracao(Date.from(Instant.now())); // no seu caso utilize um método set do seu projeto
		controle.alterar(novo);
		
		//buscar todos
		List<Reserva> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Reserva obj = (Reserva) iterator.next();
			System.out.println(obj.getCodReserva());
		}
		
		//excluir
		//controle.excluir(objetos.get(0));
		
		//excluir por id
		//controle.excluirPorId(7); //o id 3 precisa existir no banco, modifique o valor	
	}
}

