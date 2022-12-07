package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Conexao.Conexao;
import DTO.PessoaJurid;

public class PessoaJuridDAO {
	
	 final String NOMEDATABELA = "pessoajuridica";

	    public boolean inserir(PessoaJurid pessoaJurid) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " (nome, cnpj, email, telefone) VALUES (?,?,?,?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, pessoaJurid.getNome());
	            ps.setString(2, pessoaJurid.getCnpj());
	            ps.setString(3, pessoaJurid.getEmail());
	            ps.setString(4, pessoaJurid.getTelefone());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    
	           
	    public boolean existe(PessoaJurid pessoaJurid) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cnpj= ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, pessoaJurid.getCnpj());
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
