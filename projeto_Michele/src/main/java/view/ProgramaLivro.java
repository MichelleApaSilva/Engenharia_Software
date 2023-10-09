package view;
import java.util.Iterator;
import java.util.List;
import control.LivroControle;
import model.Livro;

public class ProgramaLivro {
	public static void main(String[] args) {
		//inserindo
		Livro novo = new Livro(null, null, null, null, null);		
		LivroControle controle = new LivroControle();	
		controle.inserir(novo);
		
		//buscando
		novo = controle.buscarPorId(3); //o id 3 precisa existir no banco, modifique o valor
		System.out.println(novo.getTitulo()); // substitua por um método get do seu projeto
		
		//modificando
		novo.setTitulo(null); // no seu caso utilize um método set do seu projeto
		controle.alterar(novo);
		
		//buscar todos
		List<Livro> objetos = controle.buscarTodos();
		for (Iterator iterator = objetos.iterator(); iterator.hasNext();) {
			Livro obj = (Livro) iterator.next();
			System.out.println(obj.getTitulo());
		}
		
		//excluir
		controle.excluir(objetos.get(0));
		
		//excluir por id
		controle.excluirPorId(3); //o id 3 precisa existir no banco, modifique o valor	
	}
}
