package DTO;

public class PessoaFisica extends Cliente {
	
	private String cpf;
	
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String cpf) {
		this.cpf = cpf;
	}
	
	public PessoaFisica(String nome, String cpf, String email, String telefone) {
		super(nome, email, telefone);
		setCpf(cpf);
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
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getEmail()=");
		builder.append(getEmail());
		builder.append(", getTelefone()=");
		builder.append(getTelefone());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}
	
	

}
