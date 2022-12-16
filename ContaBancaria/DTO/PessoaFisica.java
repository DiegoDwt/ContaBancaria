package DTO;

public class PessoaFisica extends Cliente {
	
	private String cpf;
	
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	public PessoaFisica(String nome, String cpf) {
		super(nome, cpf);
	}
	
	public PessoaFisica(String nome, String cpf, String email, String telefone) {
		super(nome, email, telefone);
		setCpf(cpf);
	}
	
	public PessoaFisica(int codigo, String nome, String cpf, String email, String telefone) {
		super(nome, email, telefone);
		setCpf(cpf);
		setCodigo(codigo);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", Nome()=");
		builder.append(getNome());
		builder.append(", Email()=");
		builder.append(getEmail());
		builder.append(", Telefone()=");
		builder.append(getTelefone());
		builder.append("]");
		return builder.toString();
	}
	
	

}
