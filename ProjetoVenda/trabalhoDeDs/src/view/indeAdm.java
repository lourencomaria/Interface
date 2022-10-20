package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class indeAdm extends JFrame {

    JButton btnListar = new JButton("Ver Listas");
    JButton btnAlterar = new JButton("Alterar");
    JButton btnExcluir = new JButton("Excluir");

    public indeAdm(){

        Container c = getContentPane();
        setLayout(new GridLayout (0,2));
        setTitle("Login");

        c.add(btnListar);
        setVisible(false);

        btnListar.addActionListener(this::btnListar);
    }

    private void btnListar(ActionEvent actionEvent) {
    try{
        AdmListar admListar = new AdmListar();
        admListar.setVisible(true);
        setVisible(false);
    }catch (Exception error){
        JOptionPane.showMessageDialog(null,"Erro ao abrir a tela de Lista erro: "+error,"Erro",JOptionPane.ERROR_MESSAGE);

    }


    }


}
