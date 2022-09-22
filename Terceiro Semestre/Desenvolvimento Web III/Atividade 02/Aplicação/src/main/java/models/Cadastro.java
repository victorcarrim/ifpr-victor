package models;

import java.time.LocalDate;

public class Cadastro {
	private String nome;
	private String idioma;
	private String [] habilidades;
	private LocalDate data;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null || nome.equals("") || nome.startsWith("") || nome.matches("[0-9]")) {
			throw new IllegalArgumentException("O nome não está adequado! ");
		}
		this.nome = nome;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String[] getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(String[] habilidades) {
		if(habilidades == null || habilidades.length == 0) {
			throw new IllegalArgumentException("Deve ter ao menos uma habilidade!");
		}
		this.habilidades = habilidades;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		
		if(data == null || data.equals(LocalDate.now()) || data.isAfter(LocalDate.now())) {
			throw new IllegalArgumentException("A data não está adequada!");
		}
		
		this.data = data;
	}
	
	
	
	
}
