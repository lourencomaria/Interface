package view;

import java.awt.*;
import javax.swing.*;
class CadastroProduto extends JFrame{
	JLabel lblNome = new JLabel ("Nome:");
	JLabel lblQTD = new JLabel ("Quantidade:");
	JLabel lblDesc = new JLabel ("Descrição:");
	JLabel lblPreco = new JLabel ("Preço:");
	JLabel lblCategoria = new JLabel ("Categoria:");
	
	JLabel lblEspaco = new  JLabel ("");
	JLabel lblEspaco2 = new  JLabel ("");
	JTextField txtNome = new JTextField(null, 20);
	JTextField txtQTD = new JTextField(null, 20);
	JTextField txtDesc = new JTextField(null, 20);
	JTextField txtPreco = new JTextField(null, 20);
	String [] categoria = {"Celular", "Notebook", "Tablet"};
	JComboBox cboCategoria = new JComboBox (categoria);
	
	JButton btnNovo = new JButton ("Novo"); // criando objetos da classe 
	//JButton btnAlterar = new JButton ("Alterar");
	//JButton btnExcluir = new JButton ("Excluir");
	JButton btnSalvar = new JButton ("Salvar");
	JButton btnVoltar = new JButton ("Voltar");
	
	
	public CadastroProduto () {
		Container c = getContentPane();
		 setLayout(new GridLayout (0,2));
		 setTitle("Cadastro De Produto");
		 
		 
		 //NOME
		 c.add(lblNome).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtNome).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtNome).setBackground(new Color(173,216,230));
		 
		//qtd
		 c.add(lblQTD).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtQTD).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtQTD).setBackground(new Color(173,216,230));
		 
		 
		 
			//preco
		 c.add(lblPreco).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtPreco).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtPreco).setBackground(new Color(173,216,230));
		 
		 
		 //SEXO
		 c.add(lblCategoria).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(cboCategoria).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(cboCategoria).setBackground(Color.WHITE);
		 
		 
		//desc
		 c.add(lblDesc).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtDesc).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtDesc).setBackground(new Color(173,216,230));
		

		
		 
		 //ESPAÇO
		 c.add(lblEspaco);
		 c.add(lblEspaco2);
		 
		 
		 //BOTÕES
		 //NOVO
		 //c.add(btnNovo).setBackground(new Color(18, 10, 143)); 
		 //c.add(btnNovo).setForeground(new Color(237, 241, 238));
		// c.add(btnNovo).setFont(new Font("ROCKWELL", Font.BOLD, 14)); 
		 
		 //ALTERAR
		// c.add(btnAlterar).setBackground(Color.BLUE); 
		// c.add(btnAlterar).setForeground(new Color(237, 241, 238)); 
		// c.add(btnAlterar).setFont(new Font("Arial", Font.BOLD, 14));
		 //EXCLUIR
		 //c.add(btnExcluir).setBackground(new Color(139, 0, 0));
		 //c.add(btnExcluir).setForeground(new Color(237, 241, 238)); 
		 //c.add(btnExcluir).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 
		 //VOLTAR
		 c.add(btnVoltar).setBackground(new Color(139, 0, 0)); 
		 c.add(btnVoltar).setForeground(new Color(237, 241, 238)); 
		 c.add(btnVoltar).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 
		 //SALVAR
		 c.add(btnSalvar).setBackground(new Color(18, 10, 143)); //cor de fundo
		 c.add(btnSalvar).setForeground(new Color(237, 241, 238)); //cor da letra
		 c.add(btnSalvar).setFont(new Font("ROCKWELL", Font.BOLD, 14)); 
		 
		 
		 
		 getContentPane().setBackground(new Color(173,216,230)); //cor de fundo de todas as lbl
		 setSize(500,400);
		 setDefaultCloseOperation(EXIT_ON_CLOSE); //encerrar o programa
		 setResizable(false); // não poder diminuir
		 setLocationRelativeTo(null); //ficar no meio da tela
		 setVisible(true); // visível
		 pack();
	}
}


