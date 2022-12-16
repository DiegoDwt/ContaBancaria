package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Conexao.Conexao;
import DTO.Conta;

public class ContaDAO {
	
	 final String NOMEDATABELA = "conta";

	    public boolean inserir(Conta conta) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " (numero, agencia,nome, cpf_cnpj,empresa) VALUES (?,?,?,?,?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setLong(1, conta.getNumero());
	            ps.setLong(2, conta.getAgencia());
	            if (conta.isEmpresa()) {
	            	ps.setString(3, conta.nomePessoaJurid());
	 	            ps.setString(4, conta.cnpjPessoaJurid());
	            } else {
	            	ps.setString(3, conta.nomePessoaFisica());
	            	ps.setString(4, conta.cpfPessoaFisica()); 
	            }      
	            ps.setBoolean(5,  conta.isEmpresa());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    
	           
	    public boolean existe(Conta conta) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numero = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setLong(1, conta.getNumero());
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
	    
	    
	    public boolean alterar(Conta conta) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ? WHERE numero = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            if(conta.isEmpresa()) {
	            	 ps.setString(1, conta.nomePessoaJurid());
	            } else {
	            	 ps.setString(1, conta.nomePessoaFisica());
	            }	           
	            ps.setInt(2, conta.getNumero());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    
	    public boolean excluir(Conta conta) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE numero = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, conta.getNumero());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    
	    public Conta procurarPorNumero(Conta conta) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numero = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, conta.getNumero());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                Conta obj = new Conta();
	                ps.setLong(1, conta.getNumero());
		            ps.setLong(2, conta.getAgencia());
		            if (conta.isEmpresa()) {
		            	ps.setString(3, conta.nomePessoaJurid());
		 	            ps.setString(4, conta.cnpjPessoaJurid());
		            } else {
		            	ps.setString(3, conta.nomePessoaFisica());
		            	ps.setString(4, conta.cpfPessoaFisica()); 
		            }      
		            ps.setBoolean(5,  conta.isEmpresa());
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
	    
	    

}
