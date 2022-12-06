package Main;

import BO.ClienteBO;
import DTO.Cliente;

public class MainInsercao {
	
	public static void main(String[] args) {
		
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente("João da Silva","joaodasilva@gmail.com", "8644-3532");
		if (clienteBO.inserir(cliente))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
		Cliente cliente2 = new Cliente("Roberto Carvalho","robertocarvalho@gmail.com", "2347-3432");
		if (clienteBO.inserir(cliente2))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
	}

}