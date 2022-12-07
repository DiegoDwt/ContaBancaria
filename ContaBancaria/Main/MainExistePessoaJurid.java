package Main;

import BO.PessoaJuridBO;
import DTO.PessoaJurid;

public class MainExistePessoaJurid {

	public static void main(String[] args) {
		
		PessoaJuridBO pessoaJuridBO = new PessoaJuridBO();
		PessoaJurid pessoaJurid = new PessoaJurid("32.354.256/0001-34");
		if (pessoaJuridBO.existe(pessoaJurid))
			System.out.println("Cnpj encontrado");
		else
			System.out.println("Cnpj não Encontrado");
		
	}

}
