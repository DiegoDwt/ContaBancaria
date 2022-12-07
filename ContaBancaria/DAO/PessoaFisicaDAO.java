package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Conexao.Conexao;
import DTO.PessoaFisica;


public class PessoaFisicaDAO {
	
	 final String NOMEDATABELA = "pessoafisica";

	    public boolean inserir(PessoaFisica pessoaFisica) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " (nome, cpf, email, telefone) VALUES (?,?,?,?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, pessoaFisica.getNome());
	            ps.setString(2, pessoaFisica.getCpf());
	            ps.setString(3, pessoaFisica.getEmail());
	            ps.setString(4, pessoaFisica.getTelefone());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    
	           
	    public boolean existe(PessoaFisica pessoaFisica) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpf = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, pessoaFisica.getCpf());
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
