package br.com.confitec.ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.confitec.ecommerce.model.ItemDoPedido;

@Service
public class CalculaService {

	public Double somaValorTotal(List<ItemDoPedido> itens) {
		Double valorTotal = itens.stream().map(x -> x.getProduto().getPreco())
				.collect(Collectors.summingDouble(Double::doubleValue));

		return valorTotal;
	}

	public Double descontoAplicado(Integer quantidadeDeParcelas, Double valorTotal) {

		Double valorFinal = 0.0;

		if (quantidadeDeParcelas == 1) {
			valorFinal = valorTotal -= ((valorTotal * 10) / 100);
			return valorFinal;
		} else if (quantidadeDeParcelas == 2) {
			valorFinal = valorTotal -= (valorTotal * 8) / 100;
			return valorFinal;
		} else if (quantidadeDeParcelas == 3) {
			valorFinal = valorTotal -= (valorTotal * 6) / 100;
			return valorFinal;
		} else if (quantidadeDeParcelas == 4) {
			valorFinal = valorTotal -= (valorTotal * 4) / 100;
			return valorFinal;
		} else if (quantidadeDeParcelas == 5) {
			valorFinal = valorTotal -= (valorTotal * 2) / 100;
			return valorFinal;
		} else {
			return valorTotal;
		}
	}

}
