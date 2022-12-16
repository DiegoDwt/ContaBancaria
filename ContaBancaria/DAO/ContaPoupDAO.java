package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Conexao.Conexao;
import DTO.ContaPoup;


public class ContaPoupDAO {

	 final String NOMEDATABELA = "contapoup";

	    public boolean inserir(ContaPoup contaPoup) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " (numero, agencia, saldoPoup, nome, cpf_cnpj,empresa) VALUES (?,?,?,?,?,?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setLong(1, contaPoup.getNumero());
	            ps.setLong(2, contaPoup.getAgencia());
	            ps.setDouble(3, contaPoup.getSaldoPoup());
	            if (contaPoup.isEmpresa()) {
	            	ps.setString(4, contaPoup.nomePessoaJurid());
	 	            ps.setString(5, contaPoup.cnpjPessoaJurid());
	            } else {
	            	ps.setString(4, contaPoup.nomePessoaFisica());
	            	ps.setString(5, contaPoup.cpfPessoaFisica());
	            }      
	            ps.setBoolean(6,  contaPoup.isEmpresa());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    	    
	    
	    public boolean existe(ContaPoup contaPoup) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numero = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setLong(1, contaPoup.getNumero());
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
	    
	    
	    public boolean alterar(ContaPoup contaPoup) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET saldoPoup = ? WHERE numero = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setDouble(1, contaPoup.getSaldoPoup());
	            ps.setInt(2, contaPoup.getNumero());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    	 
	    
	    public ContaPoup procurarPorCodigo(ContaPoup contaPoup) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numero = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, contaPoup.getNumero());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	ContaPoup obj = new ContaPoup();
	                obj.setNumero(rs.getInt(1));
	                obj.setAgencia(rs.getInt(2));
	                obj.setSaldoPoup(rs.getDouble(3));
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
	    
	    
	    public boolean excluir(ContaPoup contaPoup) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE numero = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, contaPoup.getNumero());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    
	    public List<ContaPoup> pesquisarTodos() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<ContaPoup> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    
	    
	    public List<ContaPoup> montarLista(ResultSet rs) {
	        List<ContaPoup> listObj = new ArrayList<ContaPoup>();
	        try {
	            while (rs.next()) {
	            	ContaPoup obj = new ContaPoup();
	            	 obj.setNumero(rs.getInt(1));
		             obj.setAgencia(rs.getInt(2));
		             obj.setSaldoPoup(rs.getDouble(3));
	                 listObj.add(obj);
	            }
	            return listObj;
	        } catch (Exception e) {
	            return null;
	        }
	    }
}
