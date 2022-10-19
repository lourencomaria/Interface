package dao;


import model.Conexao;
import model.Produto;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

}
