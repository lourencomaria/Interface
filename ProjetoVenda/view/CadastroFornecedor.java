package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
class CadastroFornecedor extends JFrame{
	JLabel lblNome = new JLabel ("Nome:");
	JLabel lblCPF = new JLabel ("CPF:");
	JLabel lblSexo = new JLabel ("Sexo:");
	JLabel lblTel1 = new JLabel ("Telefone 1:");
	JLabel lblTel2 = new JLabel ("Telefone 2:");
	JLabel lblEmail = new JLabel ("Email:");
	JLabel lblCargo = new JLabel ("Cargo:");
	JLabel lblEstado = new JLabel ("Estado:");
	JLabel lblCidade = new JLabel ("Cidade:");
	JLabel lblBairro = new JLabel ("Bairro:");
	JLabel lblRua = new JLabel ("Rua:");
	JLabel lblComp = new JLabel ("Complemento:");
	JLabel lblRede = new JLabel ("Rede Social:");
	JLabel lblEspaco = new  JLabel ("");
	JLabel lblEspaco2 = new  JLabel ("");
	String [] estados = {"AC", "AL","AP","AM" ,"BA" ,"CE" ,"DF" ,"ES" ,"GO" ,"MA" ,"MT" ,"MS" ,"MG" ,"PA" ,"PB" ,"PR" ,"PE" ,"PI" ,"RJ" ,"RN" ,"RS" ,"RO" ,"RR" ,"SC" ,"SP" ,"SE" ,"TO"};
	JComboBox cboEstados = new JComboBox (estados);
	String [] sexos = {"Masculino", "Feminino"};
	JComboBox cboSexo = new JComboBox (sexos);
	
	JTextField txtNome = new JTextField(null, 20);
	JTextField txtCPF = new JTextField(null, 20);
	JTextField txtTel1 = new JTextField(null, 20);
	JTextField txtTel2 = new JTextField(null, 20);
	JTextField txtCargo = new JTextField(null, 20);
	JTextField txtEmail = new JTextField(null, 20);
	JTextField txtQTD = new JTextField(null, 20);
	JTextField txtRua = new JTextField(null, 20);
	JTextField txtCidade = new JTextField(null, 20);
	JTextField txtBairro = new JTextField(null, 20);
	JTextField txtCEP = new JTextField(null, 20);
	JTextField txtComp = new JTextField(null, 20);
	JTextField txtRede = new JTextField(null, 20);

	JButton btnSalvar = new JButton ("Salvar");
	JButton btnVoltar = new JButton ("Voltar");
	
	public CadastroFornecedor() {
		Container c = getContentPane();
		 setLayout(new GridLayout (0,2));
		 setTitle("Cadastro De Fornecedor");
		 
		 //NOME
		 c.add(lblNome).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtNome).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtNome).setBackground(new Color(173,216,230));
		 
		 //CPF
		 c.add(lblCPF).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtCPF).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtCPF).setBackground(new Color(173,216,230));
		 
		 //SEXO
		 c.add(lblSexo).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(cboSexo).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(cboSexo).setBackground(Color.WHITE);
		 
		 //TEL 1
		 c.add(lblTel1).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtTel1).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtTel1).setBackground(new Color(173,216,230));
		 
		 //TEL 2
		 c.add(lblTel2).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtTel2).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtTel2).setBackground(new Color(173,216,230));
		 
		 //EMAIL
		 c.add(lblEmail).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtEmail).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtEmail).setBackground(new Color(173,216,230));
		 
		 //CARGO
		 c.add(lblCargo).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtCargo).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtCargo).setBackground(new Color(173,216,230));
		
		 
		 //ESTADO
		 c.add(lblEstado).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(cboEstados).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(cboEstados).setBackground(Color.WHITE);
		 
		 //CIDADE
		 c.add(lblCidade).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtCidade).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtCidade).setBackground(new Color(173,216,230));
		 
		 //BAIRRO
		 c.add(lblBairro).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtBairro).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtBairro).setBackground(new Color(173,216,230));
		 
		 //RUA
		 c.add(lblRua).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtRua).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtRua).setBackground(new Color(173,216,230));
		 
		 //COMP
		 c.add(lblComp).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtComp).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtComp).setBackground(new Color(173,216,230));
		 
		 //REDE SOIAL
		 c.add(lblRede).setFont(new Font("ROCKWELL", Font.BOLD, 14));
		 c.add(txtRede).setFont(new Font("ROCKWELL", Font.BOLD, 12));
		 c.add(txtRede).setBackground(new Color(173,216,230));
		 
		 //ESPAÇO
		 c.add(lblEspaco);
		 c.add(lblEspaco2);
		 
		 
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
		 setVisible(false); // visível
		 pack();

		 btnSalvar.addActionListener(this::btnSalvar);
		 btnVoltar.addActionListener(this::btnVoltar);
	}

	private void btnVoltar(ActionEvent actionEvent) {
		TelaCadastros telaCadastros = new TelaCadastros();
		telaCadastros.setVisible(true);
		setVisible(false);
	}

	private void btnSalvar(ActionEvent actionEvent) {
		if(txtBairro.getText().isEmpty() || txtCargo.getText().isEmpty() || txtCEP.getText().isEmpty() || txtComp.getText().isEmpty() || txtEmail.getText().isEmpty() || txtCidade.getText().isEmpty() || txtCPF.getText().isEmpty() || txtEstado.getText().isEmpty() || txtNome.getText().isEmpty() || txtQTD.getText().isEmpty() || txtRede.getText().isEmpty() || txtRua.getText().isEmpty() || txtTel1.getText().isEmpty() || txtTel2.getText().isEmpty()){
			JOptionPane.showMessageDialog(null," Todos os campos são Obrigatorios!! ","Atencao",JOptionPane.WARNING_MESSAGE);

		}
	}
}
