package DTO;

import BO.ContaCorrenteBO;

public class ContaCorrente extends Conta {
	
	private double saldoCC;
	private boolean empresa;
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(int numero) {
		setNumero(numero);
	}
	
	public ContaCorrente(String nome) {
		if(empresa) {
			setPessoaJurid(pessoaJurid);
		} else {
			setPessoaFisica(pessoaFisica);
		}
	}
	
	public ContaCorrente(int numero, double saldoCC) {
		setNumero(numero);
		setSaldoCC(saldoCC);
	}
	
	
	public ContaCorrente(int numero, int agencia, double saldoCC, PessoaFisica pessoaFisica, boolean empresa) {
		setPessoaFisica(pessoaFisica);
		setNumero(numero);
		setAgencia(agencia);
		setSaldoCC(saldoCC);
		setEmpresa(empresa);
	}
	
	
	public ContaCorrente(int numero, int agencia, double saldoCC,  PessoaJurid pessoaJurid, boolean empresa) {
		setPessoaJurid(pessoaJurid);
		setNumero(numero);
		setAgencia(agencia);
		setSaldoCC(saldoCC);
		setEmpresa(empresa);
	}

	public double getSaldoCC() {
		return saldoCC;
	}

	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}
	
	public String getNome() {
		String nome = null;
		if(empresa) {
			nome = pessoaJurid.getNome();
		} else {
			nome = pessoaFisica.getNome();
		}
		return nome;
	}
	
	public void setNome() {
		String nome = null;
		if(empresa) {
			pessoaJurid.setNome(nome);
		} else {
			pessoaJurid.setNome(nome);
		}
	}
	
	public String getDoc() {
		String nome = null;
		if(empresa) {
			nome = pessoaJurid.getCnpj();
		} else {
			nome = pessoaFisica.getCpf();
		}
		return nome;
	}
	
	public void setDoc() {
		String doc = null;
		if(empresa) {
			pessoaJurid.setCnpj(doc);
		} else {
			pessoaFisica.setCpf(doc);
		}
	}
	
	
	public boolean isEmpresa() {
		return empresa;
	}

	public void setEmpresa(boolean empresa) {
		this.empresa = empresa;
	}

	public void deposito(int numero, double valor) {
		ContaCorrenteBO contaCorrenteBO = new ContaCorrenteBO();
		ContaCorrente contaCorrente = new ContaCorrente(numero);
		contaCorrente = contaCorrenteBO.procurarPorCodigo(contaCorrente);
		double CC = contaCorrente.getSaldoCC();
		double respostaCC = CC + valor;
		setSaldoCC(respostaCC);
		ContaCorrente contaCorrente2 = new ContaCorrente(numero, respostaCC);
		contaCorrenteBO.alterar(contaCorrente2);
		}
	
	public void saque(int numero, double valor) {
		ContaCorrenteBO contaCorrenteBO = new ContaCorrenteBO();
		ContaCorrente contaCorrente = new ContaCorrente(numero);
		contaCorrente = contaCorrenteBO.procurarPorCodigo(contaCorrente);
		double CC = contaCorrente.getSaldoCC();
		double respostaCC = CC - valor;
		setSaldoCC(respostaCC);
		ContaCorrente contaCorrente2 = new ContaCorrente(numero, respostaCC);
		contaCorrenteBO.alterar(contaCorrente2);
		}
	
	public String Extrato(int numero) {
		ContaCorrenteBO contaCorrenteBO = new ContaCorrenteBO();
		ContaCorrente contaCorrente = new ContaCorrente(numero);
		contaCorrente = contaCorrenteBO.procurarPorCodigo(contaCorrente);
		int ag = contaCorrente.getAgencia();
		double ECC = contaCorrente.getSaldoCC();
		String respostaSaldo = String.format("%.2f", ECC);
		
		StringBuilder builder = new StringBuilder();
		builder.append("Extrato - ContaCorrente [Conta Corrente=");
		builder.append(numero);
		builder.append(", agencia=");
		builder.append(ag);
		builder.append(", saldoCC=R$");
		builder.append(respostaSaldo);
		builder.append("]");
		return builder.toString();
	}
			
	
}
