package Main;

import java.util.ArrayList;
import java.util.List;
import BO.PessoaJuridBO;
import DTO.PessoaJurid;

public class MainPessoaJurid {

	public static void main(String[] args) {
		
		PessoaJuridBO pessoaJuridBO = new PessoaJuridBO();
		PessoaJurid pessoaJurid = new PessoaJurid("Sadia", "45.674.348/0001-56", "contato@sadia.com", "(47) 3542-5423");
		if (pessoaJuridBO.inserir(pessoaJurid))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");  
		
		PessoaJuridBO pessoaJuridBO2 = new PessoaJuridBO();
		PessoaJurid pessoaJurid2 = new PessoaJurid("Perdigão","75.754.765/0001-67","contato@perdigao.com", "(47) 3542-4644");
		if (pessoaJuridBO2.inserir(pessoaJurid2))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");     
		
	/*	PessoaJuridBO pessoaJuridBO = new PessoaJuridBO();
		PessoaJurid pessoaJurid = new PessoaJurid("45.674.348/0001-56");  // Busca por cnpj pessoa juridica
		if (pessoaJuridBO.existe(pessoaJurid))
			System.out.println("Cnpj encontrado");
		else
			System.out.println("Cnpj não Encontrado");   */
		
		
		 // alterar pessoaJurid
     /*  PessoaJuridBO pessoaJuridBO = new PessoaJuridBO();
		 PessoaJurid pessoaJurid = new PessoaJurid(1,"Sadia", "45.674.348/0001-55", "contato@sadia.com", "(47) 3542-5423");
		 pessoaJuridBO.alterar(pessoaJurid);
		 System.out.println(pessoaJurid);        */
		 
		
	/*	PessoaJuridBO pessoaJuridBO = new PessoaJuridBO();
		PessoaJurid pessoaJurid = new PessoaJurid("75.754.765/0001-67");    // Busca por cnpj do pessoaJurid
		if (pessoaJuridBO.existe(pessoaJurid))
			System.out.println("PessoaJurid encontrada");
		else
			System.out.println("Não Encontrada");       */
		
		
		// Teste Pesquisar Todos (Retorna a Lista de pessoaJurids)
/*		PessoaJuridBO pessoaJuridBO = new PessoaJuridBO();
		List<PessoaJurid> lista = new ArrayList<PessoaJurid>();
		lista = pessoaJuridBO.pesquisarTodos();	
		for (PessoaJurid pessoaJurid : lista) {
			System.out.println(pessoaJurid.toString());    
		}                                                   */            
		


	}

}
