package Main;

import BO.PessoaFisicaBO;
import DTO.PessoaFisica;


public class MainInsercaoPessoaFisica {

	public static void main(String[] args) {

		PessoaFisicaBO pessoaFisicaBO = new PessoaFisicaBO();
		PessoaFisica pessoaFisica = new PessoaFisica("Kate Perry","999.999.999-99","katep@gmail.com","4357-6545");
		if (pessoaFisicaBO.inserir(pessoaFisica))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");

	}

}


