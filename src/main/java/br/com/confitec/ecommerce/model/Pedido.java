package br.com.confitec.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private Long id;
	private List<ItemDoPedido> itens = new ArrayList<>();
	private Integer quantidadeParcelas;
	private Double valorTotal;

	public Pedido(Long id, List<ItemDoPedido> itens, Integer quantidadeParcelas, Double valorTotal) {
		super();
		this.id = id;
		this.itens = itens;
		this.quantidadeParcelas = quantidadeParcelas;
		this.valorTotal = valorTotal;
	}

	public Pedido() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ItemDoPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemDoPedido> itens) {
		this.itens = itens;
	}

	public Integer getQuantidadeParcelas() {
		return quantidadeParcelas;
	}

	public void setQuantidadeParcelas(Integer quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", itens=" + itens + ", quantidadeParcelas=" + quantidadeParcelas + ", valorTotal="
				+ valorTotal + "]";
	}

}
