package Main;

import BO.ClienteBO;
import DTO.Cliente;

public class MainExisteCliente {

	public static void main(String[] args) {

	
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente("abcd");
		if (clienteBO.existe(cliente))
			System.out.println("Cliente encontrado");
		else
			System.out.println("Não Encontrado");

	}
}