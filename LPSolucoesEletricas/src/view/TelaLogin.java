package view;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaLogin extends JFrame {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		// Componentes da tela de login
	    private JTextField usernameField;
	    private JPasswordField passwordField;
	    private JButton loginButton;
	    private JButton cadastrarButton;
	    private JTextField txtUsename;
	    private JPasswordField passwordField_1;

	    public TelaLogin() {
	    	getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
	    	
	    	JLabel lblNewLabel = new JLabel("Digite seus dados");
	    	getContentPane().add(lblNewLabel);
	    	
	    	txtUsename = new JTextField();
	    	txtUsename.setText("username");
	    	getContentPane().add(txtUsename);
	    	txtUsename.setColumns(10);
	    	
	    	passwordField_1 = new JPasswordField();
	    	passwordField_1.setToolTipText("");
	    	getContentPane().add(passwordField_1);
	    	
	    	JButton btnNewButton = new JButton("Login");
	    	btnNewButton.addActionListener(new ActionListener() {
	    		public void actionPerformed(ActionEvent e) {
	    		}
	    	});
	    	getContentPane().add(btnNewButton);
	    	
	    	JButton btnNewButton_1 = new JButton("Cadastrar");
	    	getContentPane().add(btnNewButton_1);
	    	//getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
	        // Configuração da tela de login
	        // ...

	        // Inicialização dos componentes
	        usernameField = new JTextField(20);
	        passwordField = new JPasswordField(20);
	        loginButton = new JButton("Login");
	        cadastrarButton = new JButton("Cadastrar");

	        // Adicionar ação ao botão de login
	        loginButton.addActionListener(e -> {
	            String username = usernameField.getText();
	            char[] password = passwordField.getPassword();
	            // Verificar as credenciais de login
	            // ...
	        });

	        // Adicionar ação ao botão de cadastro
	        cadastrarButton.addActionListener(e -> {
	            // Abrir a tela de cadastro de novos usuários
	            // ...
	        });

	        // Adicionar os componentes à tela
	        // ...
	    }
	}


