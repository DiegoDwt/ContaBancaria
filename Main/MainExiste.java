package Main;

import BO.ClienteBO;
import DTO.Cliente;

public class MainExiste {

	public static void main(String[] args) {

	
		ClienteBO marcaBO = new ClienteBO();
		Cliente marca = new Cliente("LG");
		if (marcaBO.existe(marca))
			System.out.println("Marca Encontrada");
		else
			System.out.println("Nao Encontrada");

	}
}