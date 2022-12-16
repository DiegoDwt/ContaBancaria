package Main;

import java.util.ArrayList;
import java.util.List;

import BO.ContaBO;
import DTO.Conta;
import DTO.PessoaFisica;
import DTO.PessoaJurid;

public class MainConta {

	public static void main(String[] args) {
		
		PessoaFisica p = new PessoaFisica("Alessandro Santos", "454.534.345/01", "alesantos@gmail.com", "(47) 3865-6743");
		Conta nova = new Conta(101,2002,p,false);
		ContaBO contaBO = new ContaBO();
		if (contaBO.inserir(nova))                             // Inserção conta
			System.out.println("Conta criada com sucesso");
		else
			System.out.println("Erro ao criar conta"); 
		
		PessoaFisica p2 = new PessoaFisica("João da Silva","453.543.765/05", "joaosilva@gmail.com", "(47) 3344-6743");
		Conta nova2 = new Conta(102,2002,p2,false);
		ContaBO contaBO2 = new ContaBO();
		if (contaBO.inserir(nova2))                             // Inserção conta
			System.out.println("Conta criada com sucesso");
		else
			System.out.println("Erro ao criar conta"); 
		
				
		PessoaJurid j = new PessoaJurid("Sadia", "45.674.348/0001-55", "contato@sadia.com", "(47) 3542-5423");
		Conta cj = new Conta(103,2002,j,true);
		ContaBO contaBO3 = new ContaBO();
		if (contaBO3.inserir(cj))                             // Inserção conta
			System.out.println("Conta criada com sucesso");
		else
			System.out.println("Erro ao criar conta"); 
		
		
		PessoaJurid j2 = new PessoaJurid("Perdigão","75.754.765/0001-67","contato@perdigao.com", "(47) 3542-4644");
		Conta cj2 = new Conta(104,2002,j2,true);
		ContaBO contaBO4 = new ContaBO();
		if (contaBO4.inserir(cj2))                             // Inserção conta
			System.out.println("Conta criada com sucesso");
		else
			System.out.println("Erro ao criar conta");     
		
	
  /*		ContaBO contaBO = new ContaBO();      // Busca se existe conta pelo numero
 		Conta conta = new Conta(101); 
		if (contaBO.existe(conta))
			System.out.println("Conta encontrada");
		else
			System.out.println("Conta não encontrada");  */
	
		
	/*	ContaBO contaBO = new ContaBO();       // Excluir conta
		Conta conta = new Conta(104);
		if (contaBO.excluir(conta))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");    */
		
		                                         
	}

}
