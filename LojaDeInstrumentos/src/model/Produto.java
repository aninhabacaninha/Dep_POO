package model;

public class Produto {
	private String nome;
	private String descricao;
	private long id;
	private double preco;
	private int estoque;
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public String getDescricao() { return descricao; }
	public void setDescricao(String descricao) { this.descricao = descricao; }
	
	public long getId() { return id; }
	public void setId(long id) { this.id = id; }
	
	public double getPreco() { return preco; }
	public void setPreco(double preco) { this.preco = preco; }
	
	public int getEstoque() { return estoque; }
	public void setEstoque(int estoque) { this.estoque = estoque; }
}