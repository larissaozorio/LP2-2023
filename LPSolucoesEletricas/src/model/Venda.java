package model;

import java.util.Date;
import java.util.List;

public class Venda {
	
	private Cliente cliente;
    private String produto;
    private double valor;
    private Date data;

    // Construtores, getters e setters
    // Método para adicionar uma nova venda
    public static void adicionarVenda(Venda venda) {
        // Lógica para adicionar a venda ao banco de dados ou outra fonte de dados
        // ...
    }

    // Método para atualizar os dados de uma venda existente
    public void atualizarVenda() {
        // Lógica para atualizar a venda no banco de dados ou outra fonte de dados
        // ...
    }

    // Método para excluir uma venda existente
    public void excluirVenda() {
        // Lógica para excluir a venda do banco de dados ou outra fonte de dados
        // ...
    }

    // Método para buscar uma venda por ID
    public static Venda buscarVendaPorId(int id) {
		return null;
        // Lógica para buscar a venda pelo ID no banco de dados ou outra fonte de dados
        // ...
    }

    // Método para buscar todas as vendas
    public static List<Venda> buscarTodasVendas() {
		return null;
        // Lógica para buscar todas as vendas no banco de dados ou outra fonte de dados
        // ...
    }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}

