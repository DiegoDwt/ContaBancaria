package BO;

import java.util.List;

import DAO.ContaPoupDAO;
import DTO.ContaPoup;

public class ContaPoupBO {
	

	public boolean inserir(ContaPoup contaPoup){
	        if (existe(contaPoup) != true) {
	        	ContaPoupDAO ContaPoupsDAO = new ContaPoupDAO();
	            return ContaPoupsDAO.inserir(contaPoup);
	        }
	        return false;
	    }
    
    
    public boolean existe(ContaPoup contaPoup){
    	ContaPoupDAO contaPoupsDAO = new ContaPoupDAO();
        return contaPoupsDAO.existe(contaPoup);
    }


    public boolean alterar(ContaPoup contaPoup){
    	ContaPoupDAO contaPoupsDAO = new ContaPoupDAO();
        return contaPoupsDAO.alterar(contaPoup);
    }
    
   
    public ContaPoup procurarPorCodigo(ContaPoup contaPoup){
    	ContaPoupDAO contaPoupsDAO = new ContaPoupDAO();
        return contaPoupsDAO.procurarPorCodigo(contaPoup);
    }

    
    public boolean excluir(ContaPoup contaPoup){
    	ContaPoupDAO contaPoupsDAO = new ContaPoupDAO();
        return contaPoupsDAO.excluir(contaPoup);
    }
    
    public List<ContaPoup> pesquisarTodos(){
    	ContaPoupDAO contaPoupsDAO = new ContaPoupDAO();
        return contaPoupsDAO.pesquisarTodos();
    }
    
}

