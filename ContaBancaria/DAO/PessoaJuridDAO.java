package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
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
	    
	    public boolean excluir(PessoaJurid pessoaJurid) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, pessoaJurid.getCodigo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }

	    
	    public boolean alterar(PessoaJurid pessoaJurid) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, cnpj = ?, email = ?, telefone = ? WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, pessoaJurid.getNome());
	            ps.setString(2, pessoaJurid.getCnpj());
	            ps.setString(3, pessoaJurid.getEmail());
	            ps.setString(4, pessoaJurid.getTelefone());
	            ps.setInt(5, pessoaJurid.getCodigo());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	
	    
	    public PessoaJurid procurarPorCodigo(PessoaJurid pessoaJurid) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, pessoaJurid.getCodigo());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                PessoaJurid obj = new PessoaJurid();
	                obj.setCodigo(rs.getInt(1));
	                obj.setNome(rs.getString(2));
	                obj.setCnpj(rs.getString(3));
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
	    
	    public PessoaJurid procurarPorCnpj(PessoaJurid pessoaJurid) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE cnpj = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setString(1, pessoaJurid.getCnpj());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                PessoaJurid obj = new PessoaJurid();
	                obj.setCodigo(rs.getInt(1));
	                obj.setNome(rs.getString(2));
	                obj.setCnpj(rs.getString(3));
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
	    
	     
	    public List<PessoaJurid> pesquisarTodos() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<PessoaJurid> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    
	    
	    public List<PessoaJurid> montarLista(ResultSet rs) {
	        List<PessoaJurid> listObj = new ArrayList<PessoaJurid>();
	        try {
	            while (rs.next()) {
	                PessoaJurid obj = new PessoaJurid();
	                obj.setCodigo(rs.getInt(1));
	                obj.setNome(rs.getString(2));
	                obj.setCnpj(rs.getString(3));
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
