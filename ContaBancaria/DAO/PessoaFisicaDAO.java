package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
	    
	    public boolean excluir(PessoaFisica pessoaFisica) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, pessoaFisica.getCodigo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }

	    
	    public boolean alterar(PessoaFisica pessoaFisica) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, cpf = ?, email = ?, telefone = ? WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, pessoaFisica.getNome());
	            ps.setString(2, pessoaFisica.getCpf());
	            ps.setString(3, pessoaFisica.getEmail());
	            ps.setString(4, pessoaFisica.getTelefone());
	            ps.setInt(5, pessoaFisica.getCodigo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	
	    
	    public PessoaFisica procurarPorCodigo(PessoaFisica pessoaFisica) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, pessoaFisica.getCodigo());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                PessoaFisica obj = new PessoaFisica();
	                obj.setCodigo(rs.getInt(1));
	                obj.setNome(rs.getString(2));
	                obj.setCpf(rs.getString(3));
	                obj.setEmail(rs.getString(4));
	                obj.setTelefone(rs.getString(5));
	                ps.close();
	                rs.close();
	                conn.close();
	                return obj;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                return null;
	            }
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return null;
	        }
	    }
	    
	    public PessoaFisica procurarPorCpf(PessoaFisica pessoaFisica) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cpf = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, pessoaFisica.getCpf());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                PessoaFisica obj = new PessoaFisica();
	                obj.setCodigo(rs.getInt(1));
	                obj.setNome(rs.getString(2));
	                obj.setCpf(rs.getString(3));
	                obj.setEmail(rs.getString(4));
	                obj.setTelefone(rs.getString(5));
	                ps.close();
	                rs.close();
	                conn.close();
	                return obj;
	            } else {
	                ps.close();
	                rs.close();
	                conn.close();
	                return null;
	            }
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    
	     
	    public List<PessoaFisica> pesquisarTodos() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<PessoaFisica> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    
	    
	    public List<PessoaFisica> montarLista(ResultSet rs) {
	        List<PessoaFisica> listObj = new ArrayList<PessoaFisica>();
	        try {
	            while (rs.next()) {
	                PessoaFisica obj = new PessoaFisica();
	                obj.setCodigo(rs.getInt(1));
	                obj.setNome(rs.getString(2));
	                obj.setCpf(rs.getString(3));
	                obj.setEmail(rs.getString(4));
	                obj.setTelefone(rs.getString(5));
	                listObj.add(obj);
	            }
	            return listObj;
	        } catch (Exception e) {
	            return null;
	        }
	    }
}
