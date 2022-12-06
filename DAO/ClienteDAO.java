package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Conexao.Conexao;
import DTO.Cliente;

public class ClienteDAO {

    final String NOMEDATABELA = "cliente";

    public boolean inserir(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome, email, telefone) VALUES (?,?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getEmail());
            ps.setString(3, cliente.getTelefone());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
           
    public boolean existe(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                ps.close();
                rs.close();
                conn.close();
                return true;
            }
        } catch (Exception e) {
            System.err.println("Erro: " + e.toString());
            e.printStackTrace();
            return false;
        }
        return false;
    }
    
    
}
    
    
  