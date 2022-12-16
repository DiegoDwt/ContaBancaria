package Main;


import java.util.ArrayList;
import java.util.List;
import BO.ClienteBO;
import DTO.Cliente;

public class MainCliente {

	public static void main(String[] args) {
		
		
		ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente("Alessandro Santos","alesantos@gmail.com", "(47) 3865-6743");
		if (clienteBO.inserir(cliente))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");    
		
		ClienteBO clienteBO2 = new ClienteBO();
		Cliente cliente2 = new Cliente("João da Silva","joaosilva@gmail.com", "(47) 3344-6743");
		if (clienteBO2.inserir(cliente2))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");    
		
		ClienteBO clienteBO3 = new ClienteBO();
		Cliente cliente3 = new Cliente("Sadia","contato@sadia.com", "(47) 3542-5423");
		if (clienteBO3.inserir(cliente3))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");   

		ClienteBO clienteBO4 = new ClienteBO();
		Cliente cliente4 = new Cliente("Perdigão","contato@perdigao.com", "(47) 3542-4644");
		if (clienteBO4.inserir(cliente4))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");   

  /*    ClienteBO clienteBO = new ClienteBO();                   // alterar nome cliente
	    Cliente cliente = new Cliente(1,"Alessandro dos Santos");
	    clienteBO.alterar(cliente);
		System.out.println(cliente);         */
		
		
   /*  	ClienteBO clienteBO = new ClienteBO();
		Cliente cliente = new Cliente("Sadia");    // Busca por nome do cliente
		if (clienteBO.existe(cliente))
			System.out.println("Cliente encontrado");
		else
			System.out.println("Não Encontrado");    */
		
		
	/*	ClienteBO clienteBO = new ClienteBO();       // Procurar cliente por código
		Cliente cliente = new Cliente(1);
		cliente = clienteBO.procurarPorCodigo(cliente);
		System.out.println(cliente.getNome());     */
		
		
	/*	ClienteBO clienteBO = new ClienteBO();       // Excluir cliente
		Cliente cliente = new Cliente(4);
		if (clienteBO.excluir(cliente))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");  */
		
		
	/*	ClienteBO clienteBO = new ClienteBO();                // procurar por nome
		Cliente cliente = new Cliente("Sadia");
		cliente = clienteBO.procurarPorNome(cliente);
		System.out.println(cliente);    */
		
		
		// Teste Pesquisar Todos (Retorna a Lista de clientes)
	/*	ClienteBO clienteBO = new ClienteBO();
		List<Cliente> lista = new ArrayList<Cliente>();
		lista = clienteBO.pesquisarTodos();	
		for (Cliente cliente : lista) {
			System.out.println(cliente.toString());   
		}                                                      */
	}

}
