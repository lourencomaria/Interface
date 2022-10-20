package view;

import dao.ClienteDao;
import dao.FornecedorDao;
import dao.ProdutoDao;
import model.Cliente;
import model.Fornecedor;
import model.Produto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class AdmListar extends JFrame {

    JLabel lblClientes = new JLabel("Ao Clientes Cadastrados são");
    JLabel lblFornecedores = new JLabel("Ao Fornecedores Cadastrados são");

    JLabel lblProdutos = new JLabel("Ao Fornecedores Cadastrados são");



    final DefaultTableModel modelo = new
            DefaultTableModel();

    final DefaultTableModel modelo2 = new
            DefaultTableModel();

    final DefaultTableModel modelo3 = new
            DefaultTableModel();

    JTable tabela = new JTable(modelo);

    JTable tabela2 = new JTable(modelo2);

    JTable tabela3 = new JTable(modelo3);


    JScrollPane barraDeRolagem = new JScrollPane(tabela);
    JScrollPane barraDeRolagem2 = new JScrollPane(tabela2);

    JScrollPane barraDeRolagem3 = new JScrollPane(tabela3);


    JButton btnCadastrar = new JButton("Cadastrar novo");
    JButton btnVoltar = new JButton("Voltar");

    public AdmListar() throws SQLException, ClassNotFoundException {

        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Container c = getContentPane();
        setLayout(new GridLayout(0,1));
        setTitle("Clientes cadastrados");
        c.add(lblClientes);

        modelo.addColumn("Id");
        modelo.addColumn("Nome");
            modelo.addColumn("Email");
        tabela.getColumnModel().getColumn(0)
                .setPreferredWidth(10);
        tabela.getColumnModel().getColumn(1)
                .setPreferredWidth(120);
        tabela.getColumnModel().getColumn(1)
                .setPreferredWidth(80);
        tabela.getColumnModel().getColumn(1)
                .setPreferredWidth(120);
        pesquisarClientes(modelo);
        c.add(barraDeRolagem);



        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        setLayout(new GridLayout(0,1));
        setTitle("Fornecedores cadastrados");
        c.add(lblFornecedores);

        modelo2.addColumn("Id");
        modelo2.addColumn("Nome");
        modelo2.addColumn("Email");
        tabela2.getColumnModel().getColumn(0)
                .setPreferredWidth(10);
        tabela2.getColumnModel().getColumn(1)
                .setPreferredWidth(120);
        tabela2.getColumnModel().getColumn(1)
                .setPreferredWidth(80);
        tabela2.getColumnModel().getColumn(1)
                .setPreferredWidth(120);
        pesquisarFornecedor(modelo2);
        c.add(barraDeRolagem2);



        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        setLayout(new GridLayout(0,1));
        setTitle("Produtos cadastrados");
        c.add(lblProdutos);

        modelo3.addColumn("Id");
        modelo3.addColumn("Nome");
        modelo3.addColumn("Email");
        tabela3.getColumnModel().getColumn(0)
                .setPreferredWidth(10);
        tabela3.getColumnModel().getColumn(1)
                .setPreferredWidth(120);
        tabela3.getColumnModel().getColumn(1)
                .setPreferredWidth(80);
        tabela3.getColumnModel().getColumn(1)
                .setPreferredWidth(120);
        pesquisarProduto(modelo3);
        c.add(barraDeRolagem3);

        setVisible(false);

        c.add(btnCadastrar);
        c.add(btnVoltar);

        btnVoltar.addActionListener(this::btnVoltar);
        btnCadastrar.addActionListener(this::btnCadastrar);

        //lblListar.setText(List<Aeronaves>);

    }

    private void pesquisarProduto(DefaultTableModel modelo3) throws SQLException, ClassNotFoundException {
        modelo3.setNumRows(0);
        ProdutoDao produtoDao = new ProdutoDao();


        for(Produto produto : ProdutoDao.ListarProduto()){

            modelo3.addRow(new Object[]{produto.getIdProduto(), produto.getNome(), produto.getPreco()});


        }

    }

    private void pesquisarFornecedor(DefaultTableModel modelo2) throws SQLException, ClassNotFoundException {
        modelo2.setNumRows(0);
        FornecedorDao fornecedorDao = new FornecedorDao();


        for(Fornecedor fornecedor : FornecedorDao.ListarFornecedor()){

            modelo2.addRow(new Object[]{fornecedor.getIdFornecedor(), fornecedor.getNome(), fornecedor.getEmail()});


        }

    }

    private void pesquisarClientes(DefaultTableModel modelo) throws SQLException, ClassNotFoundException {
        modelo.setNumRows(0);
        ClienteDao clienteDao = new ClienteDao();


        for(Cliente cliente : ClienteDao.ListarClientes() ){

            modelo.addRow(new Object[]{cliente.getIdCliente(), cliente.getNome(), cliente.getEmail()});


        }


    }

    private void btnCadastrar(ActionEvent actionEvent) {

        TelaCadastros telaCadastros = new TelaCadastros();
        telaCadastros.setVisible(true);
        setVisible(false);

    }

    private void btnVoltar(ActionEvent actionEvent) {

        indeAdm indeAdm = new indeAdm();
        indeAdm.setVisible(true);
        setVisible(false);

    }




}
