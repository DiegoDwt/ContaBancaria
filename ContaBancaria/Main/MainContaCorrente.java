package Main;

import BO.ContaCorrenteBO;
import DTO.ContaCorrente;
import DTO.PessoaFisica;
import DTO.PessoaJurid;

public class MainContaCorrente {

	public static void main(String[] args) {
		
		PessoaFisica p = new PessoaFisica("Alessandro Santos","454.534.345/01","alesantos@gmail.com", "(47) 6543-6545");  // (nome, cpf)
		ContaCorrente nova = new ContaCorrente(101,2002,3400,p,false);   //(conta, agencia, saldo, pessoaFisica, isEmpresa)
		ContaCorrenteBO contaCorrenteBO = new ContaCorrenteBO();   // inserir contaCorrente
	    if (contaCorrenteBO.inserir(nova))
			System.out.println("Conta criada com sucesso");
		else
			System.out.println("Erro ao criar conta");    
		
	    
		
		PessoaFisica p2 = new PessoaFisica("João da Silva","453.543.765/05", "joaosilva@gmail.com", "(47) 3344-6743");  // (nome, cpf)
		ContaCorrente nova2 = new ContaCorrente(102,2002,5500,p2,false);   //(conta, agencia, saldo, pessoaFisica, isEmpresa)
		ContaCorrenteBO contaCorrenteBO2 = new ContaCorrenteBO();   // inserir contaCorrente
	    if (contaCorrenteBO2.inserir(nova2))
			System.out.println("Conta criada com sucesso");
		else
			System.out.println("Erro ao criar conta");    
		
				
		PessoaJurid j = new PessoaJurid("Sadia", "45.674.348/0001-56");   // (nome, cnpj)
		ContaCorrente cj = new ContaCorrente(103,2002,55000,j,true);
		ContaCorrenteBO contaCorrenteBO3 = new ContaCorrenteBO();   // inserir contaCorrente
	    if (contaCorrenteBO3.inserir(cj))
			System.out.println("Conta criada com sucesso");
		else
			System.out.println("Erro ao criar conta");  
		
		
		PessoaJurid j2 = new PessoaJurid("Perdigão","75.754.765/0001-67");   // (nome, cnpj)
		ContaCorrente cj2 = new ContaCorrente(104,2002,66000,j2,true);
		ContaCorrenteBO contaCorrenteBO4 = new ContaCorrenteBO();   // inserir contaCorrente
	    if (contaCorrenteBO4.inserir(cj2))
			System.out.println("Conta criada com sucesso");
		else
			System.out.println("Erro ao criar conta");     
	    
 /*    ContaCorrenteBO contaCorrenteBO = new ContaCorrenteBO();   // Busca se existe pelo numero da conta
	    ContaCorrente cc = new ContaCorrente(102);
	    if (contaCorrenteBO.existe(cc))
	    	System.out.println("Conta Corrente encontrada");
	    else
	    	System.out.println("Conta Corrente não encontrada");   */
	    
	    
	/*	ContaCorrenteBO contaCorrenteBO = new ContaCorrenteBO();   // Busca se existe pelo numero da conta
	    ContaCorrente cc = new ContaCorrente(101, 3500);  // (numeroConta, novo saldo);
	    if (contaCorrenteBO.alterar(cc))
	    	System.out.println("Alterada com sucesso");
	    else
	    	System.out.println("Erro ao alterar");     */
	   
		
	/*	ContaCorrente c = new ContaCorrente();
		c.deposito(101, 100.50);               // Depósito(numeroDaConta, valor)
		System.out.println(c.Extrato(101));      */
		
		
	/*	ContaCorrente cc = new ContaCorrente();
		cc.saque(102, 10);                           // Saque(numeroDaConta, valor)
		System.out.println(cc.Extrato(102));   */  // Extrato(numeroConta)  
	    
		
	/*	 ContaCorrenteBO contaCorrenteBO = new ContaCorrenteBO();       // Excluir 
		 ContaCorrente cc = new ContaCorrente(104);
		 if (contaCorrenteBO.excluir(cc))
			System.out.println("Excluido com Sucesso");
		 else
			System.out.println("Erro ao Excluir");    */
	    
		                         

	}
}

