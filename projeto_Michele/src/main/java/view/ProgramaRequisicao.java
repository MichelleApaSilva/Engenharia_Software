package view;

import java.util.Iterator;
import java.util.List;
import control.RequisicaoControle;
import model.Requisicao;

public class ProgramaRequisicao {
	public static void main(String[] args) {
		//inserindo
		Requisicao novo = new Requisicao(null, null, null); //avaliar como inserir as ocorrencias de data com base no que foi feito em "Programa"
		RequisicaoControle controle = new RequisicaoControle();	
		controle.inserir(novo);
		
		//buscando
		novo = controle.buscarPorId(1); //o id 3 precisa existir no banco, modifique o valor
		if (novo!=null) {
			System.out.println(novo.getEstadoRequisicao()); // substitua por um método get do seu projeto
		}
		
		//modificando
		if (novo!=null) {
			novo.setEstadoRequisicao("Aguardando Compra"); // no seu caso utilize um método set do seu projeto
			controle.alterar(novo);
		}

		//buscar todos
		System.out.println("Listando todos: ");
		List<Requisicao> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Requisicao obj = (Requisicao) iterator.next();
			System.out.println(obj.getEstadoRequisicao());
		}
		
		//excluir
		controle.excluir(objetos.get(0));
		
		//excluir por id
		controle.excluirPorId(3); //o id 3 precisa existir no banco, modifique o valor	
	}
}
