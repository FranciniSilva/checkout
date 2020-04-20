package br.com.confitec.ecommerce.model;

public class ItemDoPedido {

	private Long id;
	private Integer quantidade;
	private Produto produto;

	public ItemDoPedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemDoPedido(Long id, Integer quantidade, Produto produto) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
