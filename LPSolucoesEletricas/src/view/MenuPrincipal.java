package view;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuPrincipal extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Componentes do menu principal
    private JButton cadastroVendasButton;
    private JButton relatorioVendasButton;
    private JButton suporteAjudaButton;

    public MenuPrincipal() {
    	
    	JButton relatorioVendasButton = new JButton("Relatório de Vendas");
    	getContentPane().add(relatorioVendasButton, BorderLayout.CENTER);
    	
    	JButton cadastroVendasButton = new JButton("Cadastrar novas vendas");
    	getContentPane().add(cadastroVendasButton, BorderLayout.EAST);
    	
    	JButton suporteAjudaButton = new JButton("Ajuda");
    	suporteAjudaButton.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    		}
    	});
    	getContentPane().add(suporteAjudaButton, BorderLayout.EAST);
        // Configuração do menu principal
        // ...

        // Inicialização dos componentes
        cadastroVendasButton = new JButton("Cadastro de Vendas");
        relatorioVendasButton = new JButton("Relatório de Vendas");
        suporteAjudaButton = new JButton("Suporte e Ajuda");

        // Adicionar ação ao botão de cadastro de vendas
        cadastroVendasButton.addActionListener(e -> {
            // Abrir a tela de cadastro de vendas
            // ...
        });

        // Adicionar ação ao botão de relatório de vendas
        relatorioVendasButton.addActionListener(e -> {
            // Abrir a tela de relatório de vendas
            // ...
        });

        // Adicionar ação ao botão de suporte e ajuda
        suporteAjudaButton.addActionListener(e -> {
            // Exibir informações de suporte e ajuda
            // ...
        });

        // Adicionar os componentes ao menu principal
        // ...
    }
}
