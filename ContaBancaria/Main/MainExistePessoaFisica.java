package Main;

import BO.PessoaFisicaBO;
import DTO.PessoaFisica;

public class MainExistePessoaFisica {

	public static void main(String[] args) {
		
		PessoaFisicaBO pessoaFisicaBO = new PessoaFisicaBO();
		PessoaFisica pessoaFisica = new PessoaFisica("999.999.999-99");
		if (pessoaFisicaBO.existe(pessoaFisica))
			System.out.println("Cpf encontrado");
		else
			System.out.println("Cpf não Encontrado");
		
	}

}
