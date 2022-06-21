package one.digitalinnovation.gof.listacontatos;

public class Contato {
	
	private String id;
	
	private String nome;
	
	private String telefone;
	
	private String cnpj;
	
	private String email;
	
	private String data;
	
	
	

	public Contato() {
		
	}
	
	public Contato(String id, String nome, String telefone) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public boolean isNovo() {
		return id == null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;	
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	
	
	
	

}
