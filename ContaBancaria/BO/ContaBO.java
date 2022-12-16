package BO;


import DAO.ContaDAO;
import DTO.Conta;


public class ContaBO {
	
	  public boolean inserir(Conta conta){
	        if (existe(conta) != true) {
	        	ContaDAO contasDAO = new ContaDAO();
	            return contasDAO.inserir(conta);
	        }
	        return false;
	    }
	    
	    
	    public boolean existe(Conta conta){
	    	ContaDAO contasDAO = new ContaDAO();
	        return contasDAO.existe(conta);
	    }
	    
	    public boolean alterar(Conta conta){
	    	ContaDAO contasDAO = new ContaDAO();
	        return contasDAO.alterar(conta);
	    }
	    	    
	    
	    public boolean excluir(Conta conta){
	    	ContaDAO contasDAO = new ContaDAO();
	        return contasDAO.excluir(conta);
	    }
	    
	    public Conta procurarPorNumero(Conta conta){
	    	ContaDAO contasDAO = new ContaDAO();
	        return contasDAO.procurarPorNumero(conta);
	    }
	  
		    
	
}
