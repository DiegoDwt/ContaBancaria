package Main;

import BO.ClienteBO;
import DTO.Cliente;

public class MainInsercaoCliente {
	
	public static void main(String[] args) {
		
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente("João da Silva","joaodasilva@gmail.com", "8644-3532");
		if (clienteBO.inserir(cliente))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		
	
		
	}

}