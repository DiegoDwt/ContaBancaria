package Main;

import BO.PessoaJuridBO;
import DTO.PessoaJurid;

public class MainInsercaoPessoaJurid {

	public static void main(String[] args) {
		
		PessoaJuridBO pessoaJuridBO = new PessoaJuridBO();
		PessoaJurid pessoaJurid = new PessoaJurid("Nestle","32.354.256/0001-34","nescau@gmail.com","4357-6545");
		if (pessoaJuridBO.inserir(pessoaJurid))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");

	}

}
