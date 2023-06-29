package com.Estudo.LucasNunes25;

public class Contato {

	private String email;
	private String telefone;
	private String nome;
	
	

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String obterInfo() {
		
		return "Nome" + nome + ";" +
				"telfone" +telefone + ";"+
					"email" + email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
