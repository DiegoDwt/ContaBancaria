package Main;

import java.util.ArrayList;
import java.util.List;
import BO.PessoaFisicaBO;
import DTO.PessoaFisica;


public class MainPessoaFisica {

	public static void main(String[] args) {
		
		PessoaFisicaBO pessoaFisicaBO = new PessoaFisicaBO();
		PessoaFisica pessoaFisica = new PessoaFisica("Alessandro Santos", "454.534.345/01", "alesantos@gmail.com", "(47) 3865-6743");
		if (pessoaFisicaBO.inserir(pessoaFisica))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");    
		
		PessoaFisicaBO pessoaFisicaBO2 = new PessoaFisicaBO();
		PessoaFisica pessoaFisica2 = new PessoaFisica("João da Silva","453.543.765/05", "joaosilva@gmail.com", "(47) 3344-6743");
		if (pessoaFisicaBO2.inserir(pessoaFisica2))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");    
		
		
	/*	PessoaFisicaBO pessoaFisicaBO = new PessoaFisicaBO();
		PessoaFisica pessoaFisica = new PessoaFisica("453.543.765/05");   // Busca por cpf pessoa fisica
		if (pessoaFisicaBO.existe(pessoaFisica))
			System.out.println("Cpf encontrado");
		else
			System.out.println("Cpf não Encontrado");    */
		
		
		 // alterar pessoaFisica
	/*	 PessoaFisicaBO pessoaFisicaBO = new PessoaFisicaBO();
		 PessoaFisica pessoaFisica = new PessoaFisica(2,"João Silva","453.543.765/05", "joaosilva@gmail.com", "(47) 3344-6743");
		 pessoaFisicaBO.alterar(pessoaFisica);
		 System.out.println(pessoaFisica);       */
		
		
	/*	PessoaFisicaBO pessoaFisicaBO = new PessoaFisicaBO();
		PessoaFisica pessoaFisica = new PessoaFisica("453.543.765/05");    // Busca por cpf do pessoaFisica
		if (pessoaFisicaBO.existe(pessoaFisica))
			System.out.println("PessoaFisica encontrada");
		else
			System.out.println("Não Encontrada");  */
		
		
		// Teste Pesquisar Todos (Retorna a Lista de pessoaFisicas)
	/*	PessoaFisicaBO pessoaFisicaBO = new PessoaFisicaBO();
		List<PessoaFisica> lista = new ArrayList<PessoaFisica>();
		lista = pessoaFisicaBO.pesquisarTodos();	
		for (PessoaFisica pessoaFisica : lista) {
			System.out.println(pessoaFisica.toString());   
		}                                                      */
		

	}

}
