package dao;

import model.Conexao;
import model.Fornecedor;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDao {

    public void Cadastro (Fornecedor fornecedor) throws SQLException, ClassNotFoundException {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;


        try {
            stmt = con.prepareStatement("INSERT INTO `tbfornecedor` (`Nome`, `cpf`, `sexo`, `telefone1`, `telefone2`, `email`, `cargo`, `estado`, `cidade`, `bairro`, `rua`, `complemento`, `redeSocial`) " +
                    "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?) ");

            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCpf());
            stmt.setString(3, fornecedor.getSexo());
            stmt.setString(4, fornecedor.getTelefone1());
            stmt.setString(5, fornecedor.getTelefone2());
            stmt.setString(6, fornecedor.getEmail());
            stmt.setString(7, fornecedor.getCargo());
            stmt.setString(8, fornecedor.getEstado());
            stmt.setString(9, fornecedor.getCidade());
            stmt.setString(10, fornecedor.getBairro());
            stmt.setString(11, fornecedor.getRua());
            stmt.setString(12, fornecedor.getComplemento());
            stmt.setString(13, fornecedor.getRedeSocial());



            stmt.executeLargeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Salvou", JOptionPane.INFORMATION_MESSAGE);

        }catch (Exception error){
            JOptionPane.showMessageDialog(null,"Houve um erro ao salvar. ERRO: "+error,"ERRO",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }


    }





    public static List<Fornecedor> ListarFornecedor() throws SQLException, ClassNotFoundException {


        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from tbfornecedor");
            ResultSet list = stmt.executeQuery();

            while (list.next()){
                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setIdFornecedor(list.getInt("idFornecedor"));
                fornecedor.setNome(list.getString("nome"));
                fornecedor.setEmail(list.getString("Email"));
                fornecedores.add(fornecedor);

            }

        }catch (Exception error){
            JOptionPane.showMessageDialog(null,"Houve um erro ao listar os dados. ERRO: "+error,"ERRO",JOptionPane.ERROR_MESSAGE);
        }


        return fornecedores;

    }


}
