package br.com.fiap.projetolivros.projetolivros.model;

public class Livros {
	private Long id;
	private String nome;
	private String descricao;
	private int ano;
	private String autor;
	private String genero;
	
	public Livros(Long id, String nome, String descricao, int ano, String autor, String genero) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.ano = ano;
		this.autor = autor;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
