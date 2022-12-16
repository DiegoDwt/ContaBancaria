package BO;

import java.util.List;

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
	 
	    
	    public boolean alterar(PessoaJurid pessoaJurid){
	    	PessoaJuridDAO pessoaJuridsDAO = new PessoaJuridDAO();
	        return pessoaJuridsDAO.alterar(pessoaJurid);
	    }
	    
	    	    
	    
	    public boolean excluir(PessoaJurid pessoaJurid){
	    	PessoaJuridDAO pessoaJuridsDAO = new PessoaJuridDAO();
	        return pessoaJuridsDAO.excluir(pessoaJurid);
	    }
	    
	    public PessoaJurid procurarPorCodigo(PessoaJurid pessoaJurid){
	    	PessoaJuridDAO pessoaJuridsDAO = new PessoaJuridDAO();
	        return pessoaJuridsDAO.procurarPorCodigo(pessoaJurid);
	    }
	  
	    public PessoaJurid procurarPorNome(PessoaJurid pessoaJurid){
	    	PessoaJuridDAO pessoaJuridsDAO = new PessoaJuridDAO();
	        return pessoaJuridsDAO.procurarPorCnpj(pessoaJurid);
	    
	    }
	    
	    public List<PessoaJurid> pesquisarTodos(){
	    	PessoaJuridDAO pessoaJuridsDAO = new PessoaJuridDAO();
	        return pessoaJuridsDAO.pesquisarTodos();
	    }
}
