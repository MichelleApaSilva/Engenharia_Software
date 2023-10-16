package view;

import java.util.Iterator;
import java.util.List;
import control.UsuarioControle;
import model.Usuario;

public class ProgramaUsuario {
	public static void main(String[] args) {
		//inserindo
		Usuario novo = new Usuario(null, "Ana Maria Rosa da Silva", "anamariarosasilva@iftm.edu.br", "94622835555", "Av Liberdade, 200,Pampulha, Uberlândia, MG", "34957239455");
		UsuarioControle controle = new UsuarioControle();	
		controle.inserir(novo);
		
		//buscando
		novo = controle.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		if (novo!=null) {
			System.out.println(novo.getNome()); // substitua por um método get do seu projeto
		}
		
		//modificando
		if (novo!=null) {
			novo.setNome("bruno queiroz"); // no seu caso utilize um método set do seu projeto
			controle.alterar(novo);
		}

		//buscar todos
		System.out.println("Listando todos: ");
		List<Usuario> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Usuario obj = (Usuario) iterator.next();
			System.out.println(obj.getNome());
		}
		
		//buscar por nome
		System.out.println("Listando todos: ");
		objetos = controle.buscarPorNome("");
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Usuario obj = (Usuario) iterator.next();
			System.out.println(obj.getNome());
		}
		
		//buscar por nome
		System.out.println("Listando todos: ");
		objetos = controle.buscarPorCpf("");
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Usuario obj = (Usuario) iterator.next();
			System.out.println(obj.getCpf());
		}
		
		//excluir
		//controle.excluir(objetos.get(0));
		
		//excluir por id
		//controle.excluirPorId(3); //o id 3 precisa existir no banco, modifique o valor	
	}
}
