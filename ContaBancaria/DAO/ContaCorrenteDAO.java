package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Conexao.Conexao;
import DTO.ContaCorrente;


public class ContaCorrenteDAO {

		
	 final String NOMEDATABELA = "contacorrente";

	    public boolean inserir(ContaCorrente contaCorrente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "INSERT INTO " + NOMEDATABELA + " (numero, agencia, saldoCC, nome, cpf_cnpj, empresa) VALUES (?,?,?,?,?,?);";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setLong(1, contaCorrente.getNumero());
	            ps.setLong(2, contaCorrente.getAgencia());
	            ps.setDouble(3, contaCorrente.getSaldoCC());
	            if (contaCorrente.isEmpresa()) {
	            	ps.setString(4, contaCorrente.nomePessoaJurid());
	 	            ps.setString(5, contaCorrente.cnpjPessoaJurid());
	            } else {
	            	ps.setString(4, contaCorrente.nomePessoaFisica());
	            	ps.setString(5, contaCorrente.cpfPessoaFisica()); 
	            }      
	            ps.setBoolean(6,  contaCorrente.isEmpresa());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
	    
	    
	    
	    public boolean existe(ContaCorrente contaCorrente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numero = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setLong(1, contaCorrente.getNumero());
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
	    
	    public boolean excluir(ContaCorrente contaCorrente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE numero = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, contaCorrente.getNumero());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    
	    public boolean alterar(ContaCorrente contaCorrente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "UPDATE " + NOMEDATABELA + " SET saldoCC = ? WHERE numero = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setDouble(1, contaCorrente.getSaldoCC());
	            ps.setInt(2, contaCorrente.getNumero());
	            ps.executeUpdate();
	            ps.close();
	            conn.close();
	            return true;
	        } catch (Exception e) {
	        	 e.printStackTrace();
	             return false;
	        }
	    }
	    
	 
	    
	    public ContaCorrente procurarPorCodigo(ContaCorrente contaCorrente) {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE numero = ?;";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ps.setInt(1, contaCorrente.getNumero());
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	            	ContaCorrente obj = new ContaCorrente();
	                obj.setNumero(rs.getInt(1));
	                obj.setAgencia(rs.getInt(2));
	                obj.setSaldoCC(rs.getDouble(3));
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
    
	     
	    public List<ContaCorrente> pesquisarTodos() {
	        try {
	            Connection conn = Conexao.conectar();
	            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
	            PreparedStatement ps = conn.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            List<ContaCorrente> listObj = montarLista(rs);
	            return listObj;
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    
	    
	    public List<ContaCorrente> montarLista(ResultSet rs) {
	        List<ContaCorrente> listObj = new ArrayList<ContaCorrente>();
	        try {
	            while (rs.next()) {
	            	ContaCorrente obj = new ContaCorrente();
	            	 obj.setNumero(rs.getInt(1));
		             obj.setAgencia(rs.getInt(2));
		             obj.setSaldoCC(rs.getDouble(3));
	                 listObj.add(obj);
	            }
	            return listObj;
	        } catch (Exception e) {
	            return null;
	        }
	    }
	    
}
