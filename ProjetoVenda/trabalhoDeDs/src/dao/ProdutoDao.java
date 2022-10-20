package dao;


import model.Conexao;
import model.Fornecedor;
import model.Produto;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

    public void Cadastro (Produto produto) throws SQLException, ClassNotFoundException {

        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;


        try {
            stmt = con.prepareStatement("INSERT INTO `tbproduto` (`nomeProduto`, `quantidadeProduto`, `precoProduto`, `categoriaProduto`, `descricaoProduto`) " +
                    "VALUES(?,?,?,?,?)");

            stmt.setString(1, produto.getNome());
            stmt.setInt(2,produto.getQuantidade());
            stmt.setDouble(3,produto.getPreco());
            stmt.setString(4,produto.getCategoria());
            stmt.setString(5, produto.getDescricao());



            stmt.executeLargeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Salvou", JOptionPane.INFORMATION_MESSAGE);

        }catch (Exception error){
            JOptionPane.showMessageDialog(null,"Houve um erro ao salvar. ERRO: "+error,"ERRO",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }





    }


    public static List<Produto> ListarProduto() throws SQLException, ClassNotFoundException {


        Connection con = Conexao.getConnection();

        PreparedStatement stmt = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from tbProduto");
            ResultSet list = stmt.executeQuery();

            while (list.next()){
                Produto produto = new Produto();

                produto.setIdProduto(list.getInt("idProduto"));
                produto.setNome(list.getString("nomeProduto"));
                produto.setPreco(list.getDouble("precoProduto"));
                produtos.add(produto);

            }

        }catch (Exception error){
            JOptionPane.showMessageDialog(null,"Houve um erro ao listar os dados. ERRO: "+error,"ERRO",JOptionPane.ERROR_MESSAGE);
        }


        return produtos;

    }

}
