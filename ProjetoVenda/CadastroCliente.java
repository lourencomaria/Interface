package ProjetoVenda;

import java.awt.*;
import javax.swing.*;
class CadastroCliente extends JFrame{
	JLabel lblNome = new JLabel ("Nome:");
	JLabel lblEndereco = new JLabel ("Endereço:");
	JLabel lblEmail = new JLabel ("Email:");
	JLabel lblTelefone = new JLabel ("Telefone:");
	JLabel lblCidade = new JLabel ("Cidade:");
	JLabel lblEstado = new JLabel ("Estado:");
	JLabel lblBairro = new JLabel ("Bairro:");
	JLabel lblCEP = new JLabel ("CEP:");
	JLabel lblCPF = new JLabel ("CPF:");
	JLabel lblSexo = new  JLabel ("Sexo:");
	JLabel lblEspaco = new  JLabel ("");
	JLabel lblEspaco2 = new  JLabel ("");
	JTextField txtNome = new JTextField(null, 20);
	JTextField txtEmail = new JTextField(null, 20);
	JTextField txtEndereco = new JTextField(null, 20);
	JTextField txtTelefone = new JTextField(null, 20);
	JTextField txtCidade = new JTextField(null, 20);
	JTextField txtEstado = new JTextField(null, 20);
	JTextField txtBairro = new JTextField(null, 20);
	JTextField txtCEP = new JTextField(null, 20);
	JTextField txtCPF = new JTextField(null, 20);
	String [] sexos = {"Masculino", "Feminino"};
	JComboBox cboSexo = new JComboBox (sexos);
	JButton btnNovo = new JButton ("Novo"); // criando objetos da classe 
	//JButton btnAlterar = new JButton ("Alterar");
	//JButton btnExcluir = new JButton ("Excluir");
	JButton btnSalvar = new JButton ("Salvar");
	JButton btnVoltar = new JButton ("Voltar");
	
	
	public CadastroCliente () {
		Container c = getContentPane();
		 setLayout(new GridLayout (0,2));
		 setTitle("Cadastro De Cliente");
		 
		 
		 //NOME
		 c.add(lblNome).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtNome).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtNome).setBackground(new Color(173,216,230));
		 
		//EMAIL
		 c.add(lblEmail).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtEmail).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtEmail).setBackground(new Color(173,216,230));
		 
		 //ENDEREÇO
		 c.add(lblEndereco).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtEndereco).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtEndereco).setBackground(new Color(173,216,230));
		 
		 //TELEFONE
		 c.add(lblTelefone).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtTelefone).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtTelefone).setBackground(new Color(173,216,230));
		 
		 //CPF
		 c.add(lblCPF).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtCPF).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtCPF).setBackground(new Color(173,216,230));
		 
		 //CIDADE
		 c.add(lblCidade).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtCidade).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtCidade).setBackground(new Color(173,216,230));
		 
		 //ESTADO
		 c.add(lblEstado).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtEstado).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtEstado).setBackground(new Color(173,216,230));
		 
		 //BAIRRO
		 c.add(lblBairro).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtBairro).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtBairro).setBackground(new Color(173,216,230));
		 
		 
		 //CEP
		 c.add(lblCEP).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtCEP).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtCEP).setBackground(new Color(173,216,230));
		 
		 //SEXO
		 c.add(lblSexo).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(cboSexo).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(cboSexo).setBackground(Color.WHITE);
		 
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
		 c.add(btnSalvar).setBackground(new Color(18, 10, 143)); 
		 c.add(btnSalvar).setForeground(new Color(237, 241, 238)); 
		 c.add(btnSalvar).setFont(new Font("ROCKWELL", Font.BOLD, 14)); 
		 
		 
		 
		 getContentPane().setBackground(new Color(173,216,230)); //cor de fundo da lbl
		 setSize(500,400);
		 setDefaultCloseOperation(EXIT_ON_CLOSE); //encerrar o programa
		 setResizable(false); // não poder diminuir
		 setLocationRelativeTo(null); //ficar no meio da tela
		 setVisible(true); // visível
		 pack();
	}
}








