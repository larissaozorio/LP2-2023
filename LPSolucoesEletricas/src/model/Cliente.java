package model;

import java.util.List;

public class Cliente {
	
	    private String nome;
	    private String endereco;
	    private String contato;

	    // Construtores, getters e setters
	    

	    // Método para adicionar um novo cliente
	    public static void adicionarCliente(Cliente cliente) {
	        // Lógica para adicionar o cliente ao banco de dados ou outra fonte de dados
	        // ...
	    }

	    // Método para atualizar os dados de um cliente existente
	    public void atualizarCliente() {
	        // Lógica para atualizar o cliente no banco de dados ou outra fonte de dados
	        // ...
	    }

	    // Método para excluir um cliente existente
	    public void excluirCliente() {
	        // Lógica para excluir o cliente do banco de dados ou outra fonte de dados
	        // ...
	    }

	    // Método para buscar um cliente por ID
	    public static Cliente buscarClientePorId(int id) {
			return null;
	        // Lógica para buscar o cliente pelo ID no banco de dados ou outra fonte de dados
	        // ...
	    }

	    // Método para buscar todos os clientes
	    public static List<Cliente> buscarTodosClientes() {
			return null;
	        // Lógica para buscar todos os clientes no banco de dados ou outra fonte de dados
	        // ...
	    }

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEndereco() {
			return endereco;
		}

		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		public String getContato() {
			return contato;
		}

		public void setContato(String contato) {
			this.contato = contato;
		}
	
	}

