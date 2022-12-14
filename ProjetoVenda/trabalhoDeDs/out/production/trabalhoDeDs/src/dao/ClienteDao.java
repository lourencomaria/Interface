package dao;

import model.Cliente;
import model.Conexao;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao {

    public void Cadastro (Cliente cliente) throws SQLException, ClassNotFoundException {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;


        try {
            stmt = con.prepareStatement("INSERT INTO `tbcliente` (`nome`, `Email`, `endereco`, `telefone1`, `cpf`, `cidade`, `estado`, `bairro`, `cep`, `sexo`, `senha`) " +
                    "VALUES(?,?,?,?,?,?,?,?,?,?,?) ");

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getEndereco());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getCpf());
            stmt.setString(6, cliente.getCidade());
            stmt.setString(7, cliente.getEstado());
            stmt.setString(8, cliente.getBairro());
            stmt.setString(9, cliente.getCep());
            stmt.setString(10, cliente.getSexo());
            stmt.setString(11, cliente.getSenha());


            stmt.executeLargeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Salvou", JOptionPane.INFORMATION_MESSAGE);

        }catch (Exception error){
            JOptionPane.showMessageDialog(null,"Houve um erro ao salvar. ERRO: "+error,"ERRO",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }





    }

    public static List<Cliente> ListarClientes() throws SQLException, ClassNotFoundException {


        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from tbCliente");
            ResultSet list = stmt.executeQuery();

            while (list.next()){
                Cliente cliente = new Cliente();

                cliente.setIdCliente(list.getInt("idCliente"));
                cliente.setNome(list.getString("nome"));
                cliente.setEmail(list.getString("Email"));
                clientes.add(cliente);

            }

        }catch (Exception error){
            JOptionPane.showMessageDialog(null,"Houve um erro ao listar os dados. ERRO: "+error,"ERRO",JOptionPane.ERROR_MESSAGE);
        }


        return clientes;

    }

}
