package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
class TelaCadastros extends JFrame{ 
	JLabel lblProduto = new JLabel ("Cadastrar:"); 
	JLabel lblCliente = new JLabel ("Cadastrar:"); 
	JLabel lblFornecedor = new JLabel ("Cadastrar:");
	JLabel lblEspaco = new  JLabel ("");
	JLabel lblEspaco2 = new  JLabel ("");
	JLabel lblEspaco3 = new  JLabel ("");
	JLabel lblEspaco4 = new  JLabel ("");
	JLabel lblEspaco5 = new  JLabel ("");
	JLabel lblEspaco6 = new  JLabel ("");
	JButton btnCadastroCliente = new JButton ("Cliente"); 
	JButton btnCadastroFornecedor = new JButton ("Fornecedor");
	JButton btnCadastroProduto = new JButton ("Produto");
	JButton btnVoltar = new JButton ("Voltar");
	
	
	public TelaCadastros () {
		Container c = getContentPane();
		 setLayout(new GridLayout (0,3));
		 setTitle("Opções de Cadastro");
		  
		 c.add(lblCliente).setFont(new Font("ROCKWELL", Font.BOLD, 14)); 
		 c.add(lblEspaco);
		 c.add(btnCadastroCliente).setBackground(new Color(18, 10, 143)); 
		 c.add(btnCadastroCliente).setForeground(new Color(237, 241, 238)); 
		 c.add(btnCadastroCliente).setFont(new Font("ROCKWELL", Font.BOLD, 14)); 
		 
		
		 
		 c.add(lblFornecedor).setFont(new Font("ROCKWELL", Font.BOLD, 14)); 
		 c.add(lblEspaco2);
		 c.add(btnCadastroFornecedor).setBackground(new Color(18, 10, 143)); 
		 c.add(btnCadastroFornecedor).setForeground(new Color(237, 241, 238)); 
		 c.add(btnCadastroFornecedor).setFont(new Font("ROCKWELL", Font.BOLD, 14));  
		 
		 
		 
		 c.add(lblProduto).setFont(new Font("ROCKWELL", Font.BOLD, 14)); 
		 c.add(lblEspaco3);
		 c.add(btnCadastroProduto).setBackground(new Color(18, 10, 143)); 
		 c.add(btnCadastroProduto).setForeground(new Color(237, 241, 238)); 
		 c.add(btnCadastroProduto).setFont(new Font("ROCKWELL", Font.BOLD, 14)); 
		 
		 
		 c.add(lblEspaco6);
		 c.add(lblEspaco5);
		 c.add(lblEspaco4);
		 
		 //VOLTAR
		 c.add(btnVoltar).setBackground(new Color(139, 0, 0)); 
		 c.add(btnVoltar).setForeground(new Color(237, 241, 238)); 
		 c.add(btnVoltar).setFont(new Font("ROCKWELL", Font.BOLD, 14)); 
		 
		 getContentPane().setBackground(new Color(173,216,230)); //cor de fundo da lbl
		 setSize(800,500);
		 setDefaultCloseOperation(EXIT_ON_CLOSE); //encerrar o programa
		 //setResizable(false); // n�o poder diminuir
		 setLocationRelativeTo(null); //ficar no meio da tela
		 setVisible(false); // vis�vel
		 pack();

		 btnCadastroCliente.addActionListener(this::btnCadastroCliente);
		 btnCadastroFornecedor.addActionListener(this::btnCadastroFornecedor);
		 btnCadastroProduto.addActionListener(this::btnCadastroProduto);
		 btnVoltar.addActionListener(this::btnVoltar);

	}

	private void btnVoltar(ActionEvent actionEvent) {
		try{
		AdmListar AdmListar = new AdmListar();
		AdmListar.setVisible(true);
		setVisible(false);
	}catch (Exception ERROR){
			JOptionPane.showMessageDialog(null,"Erro");
		}
	}

	private void btnCadastroProduto(ActionEvent actionEvent) {
		CadastroProduto CadastroProduto = new CadastroProduto();
		CadastroProduto.setVisible(true);
		setVisible(false);
	}

	private void btnCadastroFornecedor(ActionEvent actionEvent) {
		AdmCadastraFornecedor AdmCadastraFornecedor= new AdmCadastraFornecedor();
		AdmCadastraFornecedor.setVisible(true);
		setVisible(false);
	}

	private void btnCadastroCliente(ActionEvent actionEvent) {
		AdmCadastraCliente AdmCadastraCliente = new AdmCadastraCliente();
		AdmCadastraCliente.setVisible(true);
		setVisible(false);
	}



}
