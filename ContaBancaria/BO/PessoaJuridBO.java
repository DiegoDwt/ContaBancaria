package BO;

import DAO.PessoaJuridDAO;
import DTO.PessoaJurid;


public class PessoaJuridBO {

	
	 public boolean inserir(PessoaJurid pessoaJurid){
	        if (existe(pessoaJurid) != true) {
	            PessoaJuridDAO pessoaJuridsDAO = new PessoaJuridDAO();
	            return pessoaJuridsDAO.inserir(pessoaJurid);
	        }
	        return false;
	    }
	    
	 
	 public boolean existe(PessoaJurid pessoaJurid){
	        PessoaJuridDAO pessoaJuridDAO = new PessoaJuridDAO();
	        return pessoaJuridDAO.existe(pessoaJurid);
	    }
}
