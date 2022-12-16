package BO;

import java.util.List;

import DAO.ClienteDAO;
import DTO.Cliente;

public class ClienteBO {

    public boolean inserir(Cliente cliente){
        if (existe(cliente) != true) {
            ClienteDAO clientesDAO = new ClienteDAO();
            return clientesDAO.inserir(cliente);
        }
        return false;
    }
    
    public boolean alterar(Cliente cliente){
    	ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.alterar(cliente);
    }
    
    public boolean existe(Cliente cliente){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.existe(cliente);
    }
    
    
    public boolean excluir(Cliente cliente){
    	ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.excluir(cliente);
    }
    
    public Cliente procurarPorCodigo(Cliente cliente){
    	ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.procurarPorCodigo(cliente);
    }
  
    public Cliente procurarPorNome(Cliente cliente){
    	ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.procurarPorNome(cliente);
    
    }
    
    public List<Cliente> pesquisarTodos(){
    	ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.pesquisarTodos();
    }
}
