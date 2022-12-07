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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


}
