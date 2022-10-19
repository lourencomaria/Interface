package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
class Login extends JFrame{
	JLabel lblEmail = new JLabel ("Email:");
	JLabel lblSenha = new JLabel ("Senha:");
	JLabel lblEspaco = new  JLabel ("");
	JLabel lblEspaco2 = new  JLabel ("");
	JTextField txtEmail = new JTextField(null, 20);
	JTextField txtSenha = new JTextField(null, 20);
	JButton btnEntrar = new JButton ("Entrar");
	JButton btnCadastrar = new JButton ("Tela de Cadastro");


	public Login () {
		Container c = getContentPane();
		 setLayout(new GridLayout (0,2));
		 setTitle("Login");
		 
		//EMAIL
		 c.add(lblEmail).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtEmail).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtEmail).setBackground(new Color(173,216,230));
		 
		 //CPF
		 c.add(lblSenha).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtSenha).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtSenha).setBackground(new Color(173,216,230));
		 
		 //ESPA�O
		 c.add(lblEspaco);
		 c.add(lblEspaco2);
		 
		 // BOT�O TELA CADASTROS
		 c.add(btnCadastrar).setBackground(new Color(0, 100, 0)); 
		 c.add(btnCadastrar).setForeground(new Color(237, 241, 238)); 
		 c.add(btnCadastrar).setFont(new Font("ROCKWELL", Font.BOLD, 14)); 
		 
		 //BOT�O ENTRAR
		 c.add(btnEntrar).setBackground(new Color(18, 10, 143)); 
		 c.add(btnEntrar).setForeground(new Color(237, 241, 238)); 
		 c.add(btnEntrar).setFont(new Font("ROCKWELL", Font.BOLD, 14)); 
		  
		 

		  
		 getContentPane().setBackground(new Color(173,216,230)); //cor de fundo da lbl
		 setSize(500,400);
		 setDefaultCloseOperation(EXIT_ON_CLOSE); //encerrar o programa
		 setResizable(false); // n�o poder diminuir
		 setLocationRelativeTo(null); //ficar no meio da tela
		 setVisible(true); // vis�vel
		 pack();

		 btnCadastrar.addActionListener(this::btnCadastrar);
		 btnEntrar.addActionListener(this::btnEntrar);

	}

	private void btnEntrar(ActionEvent actionEvent) {

		if(txtEmail.getText().isEmpty() || txtSenha.getText().isEmpty()){
			JOptionPane.showMessageDialog(null," Todos os campos são Obrigatorios!! ","Atencao",JOptionPane.WARNING_MESSAGE);

		}
		if(txtEmail.getText().equals("adm@gmail.com")&&txtSenha.getText().equals("12345")){

			JOptionPane.showMessageDialog(null," Entrando na Area do Admin ","REDIRECIONANDO...",JOptionPane.INFORMATION_MESSAGE);
		}
	}

	private void btnCadastrar(ActionEvent actionEvent) {
		TelaCadastros telaCadastros = new TelaCadastros();
		telaCadastros.setVisible(true);
		setVisible(false);
	}


}
