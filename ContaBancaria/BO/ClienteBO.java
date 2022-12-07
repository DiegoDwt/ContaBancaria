package BO;

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
    
    
    public boolean existe(Cliente cliente){
        ClienteDAO clientesDAO = new ClienteDAO();
        return clientesDAO.existe(cliente);
    }
    
    
 }
