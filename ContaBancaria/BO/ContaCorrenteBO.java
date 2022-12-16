package BO;

import java.util.List;
import DAO.ContaCorrenteDAO;
import DTO.ContaCorrente;

public class ContaCorrenteBO {
	
		public boolean inserir(ContaCorrente contaCorrente){
		        if (existe(contaCorrente) != true) {
		        	ContaCorrenteDAO ContaCorrentesDAO = new ContaCorrenteDAO();
		            return ContaCorrentesDAO.inserir(contaCorrente);
		        }
		        return false;
		    }
	    
	    
	    public boolean existe(ContaCorrente contaCorrente){
	    	ContaCorrenteDAO contaCorrentesDAO = new ContaCorrenteDAO();
	        return contaCorrentesDAO.existe(contaCorrente);
	    }
	

	    public boolean alterar(ContaCorrente contaCorrente){
	    	ContaCorrenteDAO contaCorrentesDAO = new ContaCorrenteDAO();
	        return contaCorrentesDAO.alterar(contaCorrente);
	    }
	    
	    
	    public boolean excluir(ContaCorrente contaCorrente){
	    	ContaCorrenteDAO contaCorrentesDAO = new ContaCorrenteDAO();
	        return contaCorrentesDAO.excluir(contaCorrente);
	    }
	   
	    public ContaCorrente procurarPorCodigo(ContaCorrente contaCorrente){
	    	ContaCorrenteDAO contaCorrentesDAO = new ContaCorrenteDAO();
	        return contaCorrentesDAO.procurarPorCodigo(contaCorrente);
	    }
	    
	    
	    public List<ContaCorrente> pesquisarTodos(){
	    	ContaCorrenteDAO contaCorrentesDAO = new ContaCorrenteDAO();
	        return contaCorrentesDAO.pesquisarTodos();
	    }
}
