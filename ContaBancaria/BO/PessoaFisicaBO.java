package BO;

import java.util.List;

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
	
		 
		 public boolean alterar(PessoaFisica pessoaFisica){
		    	PessoaFisicaDAO pessoaFisicasDAO = new PessoaFisicaDAO();
		        return pessoaFisicasDAO.alterar(pessoaFisica);
		    }
		    
	    
	    public boolean excluir(PessoaFisica pessoaFisica){
	    	PessoaFisicaDAO pessoaFisicasDAO = new PessoaFisicaDAO();
	        return pessoaFisicasDAO.excluir(pessoaFisica);
	    }
	    
	    public PessoaFisica procurarPorCodigo(PessoaFisica pessoaFisica){
	    	PessoaFisicaDAO pessoaFisicasDAO = new PessoaFisicaDAO();
	        return pessoaFisicasDAO.procurarPorCodigo(pessoaFisica);
	    }
	  
	    public PessoaFisica procurarPorCpf(PessoaFisica pessoaFisica){
	    	PessoaFisicaDAO pessoaFisicasDAO = new PessoaFisicaDAO();
	        return pessoaFisicasDAO.procurarPorCpf(pessoaFisica);
	    
	    }
	    
	    public List<PessoaFisica> pesquisarTodos(){
	    	PessoaFisicaDAO pessoaFisicasDAO = new PessoaFisicaDAO();
	        return pessoaFisicasDAO.pesquisarTodos();
	    }
}











