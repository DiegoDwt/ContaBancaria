package DTO;

public class PessoaJurid extends Cliente {
	
private String cnpj;
	
	
	public PessoaJurid() {
		
	}
	
	public PessoaJurid(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public PessoaJurid (String nome, String cnpj, String email, String telefone) {
		super(nome, email, telefone);
		setCnpj(cnpj);
	}
	
	public PessoaJurid(int codigo, String nome, String cnpj, String email, String telefone) {
		super(nome, email, telefone);
		setCnpj(cnpj);
		setCodigo(codigo);
	}
	
	public PessoaJurid (String nome, String cnpj) {
		super(nome, cnpj);
		setCnpj(cnpj);
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJurid [cnpj=");
		builder.append(cnpj);
		builder.append(", Codigo=");
		builder.append(getCodigo());
		builder.append(", Nome=");
		builder.append(getNome());
		builder.append(", Email=");
		builder.append(getEmail());
		builder.append(", Telefone=");
		builder.append(getTelefone());
		builder.append("]");
		return builder.toString();
	}
	
	

}
