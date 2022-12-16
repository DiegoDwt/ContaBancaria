package DTO;


public class Conta {

	private int numero;
	protected int agencia;
	protected PessoaFisica pessoaFisica;
	protected PessoaJurid pessoaJurid;
	protected boolean empresa;
	
	
	public Conta() {
		
	}
	
	public Conta(int numero) {
		setNumero(numero);
	}
	
	public Conta(String nome) {
		if(isEmpresa()) {
			pessoaJurid.setNome(nome);
		} else {
			pessoaFisica.setNome(nome);
		}
	}
	
	public Conta(String cnpj, String nome) {
		pessoaJurid.setCnpj(cnpj);
		pessoaJurid.setNome(nome);
	}
	
	public Conta(int numero, int agencia, PessoaFisica pessoaFisica, boolean empresa) {
		setPessoaFisica(pessoaFisica);
		setNumero(numero);
		setAgencia(agencia);
		setEmpresa(empresa);
	}
	
	
	
	public Conta(int numero, int agencia, PessoaJurid pessoaJurid, boolean empresa) {
		setPessoaJurid(pessoaJurid);
		setNumero(numero);
		setAgencia(agencia);
		setEmpresa(empresa);
	}
	
	public String nomePessoaFisica() {
		return pessoaFisica.getNome();
	}
	
	public void setNomePessoaFisica(String nome) {
		pessoaFisica.setNome(nome);
	}
	
	
	public String cpfPessoaFisica() {
		return pessoaFisica.getCpf();
	}
	
	public void setCpfPessoaFisica(String cpf) {
		pessoaFisica.setCpf(cpf);
	}
		
	public String nomePessoaJurid() {
		return pessoaJurid.getNome();
	}
	
	public void SetNomePessoaJurid(String nome) {
		pessoaJurid.setNome(nome);
	}
	
	public String cnpjPessoaJurid() {
		return pessoaJurid.getCnpj();
	}
	
	public void SetCnpjPessoaJurid(String cnpj) {
		pessoaJurid.setCnpj(cnpj);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public PessoaJurid getPessoaJurid() {
		return pessoaJurid;
	}

	public void setPessoaJurid(PessoaJurid pessoaJurid) {
		this.pessoaJurid = pessoaJurid;
	}

	public boolean isEmpresa() {
		return empresa;
	}

	public void setEmpresa(boolean empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [numero=");
		builder.append(numero);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", pessoaFisica=");
		builder.append(pessoaFisica);
		builder.append(", pessoaJurid=");
		builder.append(pessoaJurid);
		builder.append(", empresa=");
		builder.append(empresa);
		builder.append("]");
		return builder.toString();
	}

		
}
