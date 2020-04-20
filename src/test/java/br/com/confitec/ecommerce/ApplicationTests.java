package br.com.confitec.ecommerce;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.confitec.ecommerce.model.ItemDoPedido;
import br.com.confitec.ecommerce.model.Pedido;
import br.com.confitec.ecommerce.model.Produto;
import br.com.confitec.ecommerce.service.CalculaService;

@SpringBootTest
class ApplicationTests {

	@Autowired
	CalculaService descontoService;

	@Test
	void contextLoads() {

	}

	@Test
	public void quandoQuantidadeDeParcelaForUm_retornarDezPorCentoDeDesconto() {

		ItemDoPedido item1 = new ItemDoPedido(1L, 2, new Produto(1, "Caneta", 0.50));
		ItemDoPedido item2 = new ItemDoPedido(2L, 2, new Produto(2, "Papel", 2.00));
		ItemDoPedido item3 = new ItemDoPedido(3L, 1, new Produto(3, "Tesoura", 1.50));

		List<ItemDoPedido> itens = Arrays.asList(item1, item2, item3);

		Double valorTotal = descontoService.somaValorTotal(itens);

		Double descontoAplicado = descontoService.descontoAplicado(1, valorTotal);

		assertThat(descontoAplicado).isEqualTo(3.6);

	}

	@Test
	public void quandoQuantidadeDeParcelaForDois_retornarOitoPorCentoDeDesconto() {

		ItemDoPedido item1 = new ItemDoPedido(1L, 2, new Produto(1, "Caneta", 0.50));
		ItemDoPedido item2 = new ItemDoPedido(2L, 2, new Produto(2, "Papel", 2.00));
		ItemDoPedido item3 = new ItemDoPedido(3L, 1, new Produto(3, "Tesoura", 1.50));

		List<ItemDoPedido> itens = Arrays.asList(item1, item2, item3);

		Double valorTotal = descontoService.somaValorTotal(itens);

		Double descontoAplicado = descontoService.descontoAplicado(2, valorTotal);

		assertThat(descontoAplicado).isEqualTo(3.68);

	}

	@Test
	public void quandoQuantidadeDeParcelaForTres_retornarSeisPorCentoDeDesconto() {

		ItemDoPedido item1 = new ItemDoPedido(1L, 2, new Produto(1, "Caneta", 0.50));
		ItemDoPedido item2 = new ItemDoPedido(2L, 2, new Produto(2, "Papel", 2.00));
		ItemDoPedido item3 = new ItemDoPedido(3L, 1, new Produto(3, "Tesoura", 1.50));

		List<ItemDoPedido> itens = Arrays.asList(item1, item2, item3);

		Double valorTotal = descontoService.somaValorTotal(itens);

		Double descontoAplicado = descontoService.descontoAplicado(3, valorTotal);

		assertThat(descontoAplicado).isEqualTo(3.76);

	}

	@Test
	public void quandoQuantidadeDeParcelaForQuatro_retornarQuatroPorCentoDeDesconto() {

		ItemDoPedido item1 = new ItemDoPedido(1L, 2, new Produto(1, "Caneta", 0.50));
		ItemDoPedido item2 = new ItemDoPedido(2L, 2, new Produto(2, "Papel", 2.00));
		ItemDoPedido item3 = new ItemDoPedido(3L, 1, new Produto(3, "Tesoura", 1.50));

		List<ItemDoPedido> itens = Arrays.asList(item1, item2, item3);

		Double valorTotal = descontoService.somaValorTotal(itens);

		Double descontoAplicado = descontoService.descontoAplicado(4, valorTotal);

		assertThat(descontoAplicado).isEqualTo(3.84);

	}

	@Test
	public void quandoQuantidadeDeParcelaForCinco_retornarDoisPorCentoDeDesconto() {

		ItemDoPedido item1 = new ItemDoPedido(1L, 2, new Produto(1, "Caneta", 0.50));
		ItemDoPedido item2 = new ItemDoPedido(2L, 2, new Produto(2, "Papel", 2.00));
		ItemDoPedido item3 = new ItemDoPedido(3L, 1, new Produto(3, "Tesoura", 1.50));

		List<ItemDoPedido> itens = Arrays.asList(item1, item2, item3);

		Double valorTotal = descontoService.somaValorTotal(itens);

		Double descontoAplicado = descontoService.descontoAplicado(5, valorTotal);

		assertThat(descontoAplicado).isEqualTo(3.92);

	}

	@Test
	public void quandoQuantidadeDeParcelaForMaiorQueCinco_retornarZeroPorCentoDeDesconto() {

		ItemDoPedido item1 = new ItemDoPedido(1L, 2, new Produto(1, "Caneta", 0.50));
		ItemDoPedido item2 = new ItemDoPedido(2L, 2, new Produto(2, "Papel", 2.00));
		ItemDoPedido item3 = new ItemDoPedido(3L, 1, new Produto(3, "Tesoura", 1.50));

		List<ItemDoPedido> itens = Arrays.asList(item1, item2, item3);

		Double valorTotal = descontoService.somaValorTotal(itens);

		Double descontoAplicado = descontoService.descontoAplicado(6, valorTotal);

		assertThat(descontoAplicado).isEqualTo(4.0);

	}

	@Test
	public void quandoQuantidadeDeParcelaForUm_retornarOValorTotalDoPedido() {
		ItemDoPedido item1 = new ItemDoPedido(1L, 2, new Produto(1, "Caneta", 0.50));
		ItemDoPedido item2 = new ItemDoPedido(2L, 2, new Produto(2, "Papel", 2.00));
		ItemDoPedido item3 = new ItemDoPedido(3L, 1, new Produto(3, "Tesoura", 1.50));

		List<ItemDoPedido> itens = Arrays.asList(item1, item2, item3);

		Double valorTotal = descontoService.somaValorTotal(itens);

		Pedido pedido = new Pedido(1L, itens, 1, valorTotal);

		Double descontoAplicado = descontoService.descontoAplicado(pedido.getQuantidadeParcelas(), valorTotal);

		pedido.setValorTotal(descontoAplicado);

		assertThat(pedido.getValorTotal()).isEqualTo(3.6);
	}

}
