package br.com.confitec.ecommerce.model;

public class Produto {

	private int idProduto;
	private String nomeProduto;
	private double preco;

	public Produto() {
	}

	public Produto(int idProduto, String nomeProduto, double preco) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
	}

	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", nomeProduto=" + nomeProduto + ", preco=" + preco + "]";
	}

}
