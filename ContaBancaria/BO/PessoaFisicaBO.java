package BO;

import DAO.PessoaFisicaDAO;
import DTO.PessoaFisica;

public class PessoaFisicaBO {

	 public boolean inserir(PessoaFisica pessoaFisica){
	        if (existe(pessoaFisica) != true) {
	            PessoaFisicaDAO pessoaFisicasDAO = new PessoaFisicaDAO();
	            return pessoaFisicasDAO.inserir(pessoaFisica);
	        }
	        return false;
	    }
	    
	 
	 public boolean existe(PessoaFisica pessoaFisica){
	        PessoaFisicaDAO pessoaFisicasDAO = new PessoaFisicaDAO();
	        return pessoaFisicasDAO.existe(pessoaFisica);
	    }

}











