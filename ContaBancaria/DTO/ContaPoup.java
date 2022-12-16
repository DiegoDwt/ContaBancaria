package DTO;

import BO.ContaPoupBO;

public class ContaPoup extends Conta {
	
	private double saldoPoup;
	
	public ContaPoup() {
		
	}
	
	public ContaPoup(int numero) {
		setNumero(numero);
	}
	
	public ContaPoup(int numero, double saldoPoup) {
		setNumero(numero);
		setSaldoPoup(saldoPoup);
	}
	
	
	public ContaPoup(int numero, int agencia, double saldoPoup, PessoaFisica pessoaFisica, boolean empresa) {
		setPessoaFisica(pessoaFisica);
		setNumero(numero);
		setAgencia(agencia);
		setSaldoPoup(saldoPoup);
		setEmpresa(empresa);
	}
	
	
	public ContaPoup(int numero, int agencia, double saldoPoup, PessoaJurid pessoaJurid, boolean empresa) {
		setPessoaJurid(pessoaJurid);
		setNumero(numero);
		setAgencia(agencia);
		setSaldoPoup(saldoPoup);
		setEmpresa(empresa);
	}

	public double getSaldoPoup() {
		return saldoPoup;
	}

	public void setSaldoPoup(double saldoPoup) {
		this.saldoPoup = saldoPoup;
	}
	

	public void deposito(int numero, double valor) {
		ContaPoupBO contaPoupBO = new ContaPoupBO();
		ContaPoup contaPoup = new ContaPoup(numero);
		contaPoup = contaPoupBO.procurarPorCodigo(contaPoup);
		double Poup = contaPoup.getSaldoPoup();
		double respostaPoup = Poup + valor;
		setSaldoPoup(respostaPoup);
		ContaPoup contaPoup2 = new ContaPoup(numero, respostaPoup);
		contaPoupBO.alterar(contaPoup2);
		}
	
	public void saque(int numero, double valor) {
		ContaPoupBO contaPoupBO = new ContaPoupBO();
		ContaPoup contaPoup = new ContaPoup(numero);
		contaPoup = contaPoupBO.procurarPorCodigo(contaPoup);
		double Poup = contaPoup.getSaldoPoup();
		double respostaPoup = Poup - valor;
		setSaldoPoup(respostaPoup);
		ContaPoup contaPoup2 = new ContaPoup(numero, respostaPoup);
		contaPoupBO.alterar(contaPoup2);
		}
	
	
	public void atualizacaoMensal(int numero, double taxa) {       //taxa 0,6% = 1.006
		ContaPoupBO contaPoupBO = new ContaPoupBO();
		ContaPoup contaPoup = new ContaPoup(numero);
		contaPoup = contaPoupBO.procurarPorCodigo(contaPoup);
		double poup = contaPoup.getSaldoPoup();
		double respostaPoup = poup * taxa;
		setSaldoPoup(respostaPoup);
		ContaPoup contaPoup2 = new ContaPoup(numero, respostaPoup);
		contaPoupBO.alterar(contaPoup2);
		}
	
	public String Extrato(int numero) {
		ContaPoupBO contaPoupBO = new ContaPoupBO();
		ContaPoup contaPoup = new ContaPoup(numero);
		contaPoup = contaPoupBO.procurarPorCodigo(contaPoup);
		int ag = contaPoup.getAgencia();
		double EPoup = contaPoup.getSaldoPoup();
		String saldoPoup = String.format("%.2f",EPoup);
		
		StringBuilder builder = new StringBuilder();
		builder.append("Extrato - ContaPoup [Conta=");
		builder.append(numero);
		builder.append(", agencia=");
		builder.append(ag);
		builder.append(", saldoPoup=R$");
		builder.append(saldoPoup);
		builder.append("]");
		return builder.toString();
	}
			


}
