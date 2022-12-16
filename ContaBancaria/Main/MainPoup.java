package Main;


import java.util.ArrayList;
import java.util.List;
import BO.ContaPoupBO;
import DTO.ContaPoup;
import DTO.PessoaFisica;
import DTO.PessoaJurid;

public class MainPoup {

	public static void main(String[] args) {
		
		PessoaFisica p = new PessoaFisica("Luiz Araujo","234.644.4554/34","luizaraujo@gmail.com","5443-7654");
		ContaPoup nova = new ContaPoup(201,2002,3000,p, false);
		ContaPoupBO contaPoupBO = new ContaPoupBO();      // Criar conta poupança
	    if (contaPoupBO.inserir(nova))
			System.out.println("Conta criada com sucesso");
		else
			System.out.println("Erro ao criar conta");
		
		PessoaFisica p2 = new PessoaFisica("Guilherme de Sá","456.567.346/35","guilhermedesa@gmail.com","4353-3433");
		ContaPoup nova2 = new ContaPoup(202,2002,60000,p2, false);
		ContaPoupBO contaPoupBO2 = new ContaPoupBO();      // Criar conta poupança
	    if (contaPoupBO.inserir(nova2))
			System.out.println("Conta criada com sucesso");
		else
			System.out.println("Erro ao criar conta");
	    
	    
				
		PessoaJurid j = new PessoaJurid("Perdigão","74.345.646/0001-75");
		ContaPoup cj = new ContaPoup(203,2203,30000,j,true);
		ContaPoupBO contaPoupBO3 = new ContaPoupBO();      // Criar conta poupança
	    if (contaPoupBO3.inserir(cj))
			System.out.println("Conta criada com sucesso");
		else
			System.out.println("Erro ao criar conta");
		
		PessoaJurid j2 = new PessoaJurid("Sadia","65.464.456/0001-45");
		ContaPoup cj2 = new ContaPoup(204,2203,34400,j2,true);
		ContaPoupBO contaPoupBO4 = new ContaPoupBO();      // Criar conta poupança
	    if (contaPoupBO4.inserir(cj2))
			System.out.println("Conta criada com sucesso");
		else
			System.out.println("Erro ao criar conta");   

		
		
 /*    	ContaPoup poup = new ContaPoup();
		poup.saque(201, 10);                           // Saque(numeroDaConta, valor)
		System.out.println(poup.Extrato(201));     */
	    
	    
/*		ContaPoup poup2 = new ContaPoup();
		poup2.deposito(202, 500);               // Deposito(numeroDaConta, valor)
		System.out.println(poup2.Extrato(202));       // Extrato(numeroConta)    */
		
		
 /*		ContaPoup poup2 = new ContaPoup();
		poup2.atualizacaoMensal(201, 1.006);               // AtualizacaoMensal(numeroDaConta, taxa)
		System.out.println(poup2.Extrato(201));     */    // Extrato(numeroConta)   
		
		
		
	/*    ContaPoupBO contaPoupBO = new ContaPoupBO();   // Busca se existe pelo numero da conta
	    ContaPoup cc = new ContaPoup(202);
	    if (contaPoupBO.existe(cc))
	    	System.out.println("Conta Corrente encontrada");
	    else
	    	System.out.println("Conta Corrente não encontrada");   */
	    
  		
	    
	/*	ContaPoupBO contaPoupBO = new ContaPoupBO();   // Busca se existe pelo numero da conta
	    ContaPoup cc = new ContaPoup(201, 4000);  // (numeroConta, novo saldo);
	    if (contaPoupBO.alterar(cc))
	    	System.out.println("Alterada com sucesso");
	    else
	    	System.out.println("Erro ao alterar");    */

  		
	   
  /*  	 ContaPoupBO contaPoupBO = new ContaPoupBO();       // Excluir 
		 ContaPoup cc = new ContaPoup(191);
		 if (contaPoupBO.excluir(cc))
			System.out.println("Excluido com Sucesso");
		 else
			System.out.println("Erro ao Excluir");     */
	    
		                   
	    
     
  		
  		
   }

}


