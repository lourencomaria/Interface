package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class indexAdm extends JFrame{
    JButton btnListar = new JButton("Ver Listas");
    JButton btnAlterar = new JButton("Alterar");
    JButton btnExcluir = new JButton("Excluir");
    JButton btnVoltar= new JButton("Voltar");

    public indexAdm () {
        Container c = getContentPane();
        setLayout(new GridLayout(0, 2));
        setTitle("Login");


        c.add(btnVoltar).setBackground(new Color(139, 0, 0));
        c.add(btnVoltar).setForeground(new Color(237, 241, 238));
        c.add(btnVoltar).setFont(new Font("ROCKWELL", Font.BOLD, 14));

        c.add(btnListar).setBackground(new Color(18, 10, 143));
        c.add(btnListar).setForeground(new Color(237, 241, 238));
        c.add(btnListar).setFont(new Font("ROCKWELL", Font.BOLD, 14));







        getContentPane().setBackground(new Color(173,216,230)); //cor de fundo da lbl
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE); //encerrar o programa
        setResizable(false); // n�o poder diminuir
        setLocationRelativeTo(null); //ficar no meio da tela
        btnListar.addActionListener(this::btnListar);
        setVisible(true); // vis�vel
        pack();

        btnVoltar.addActionListener(this::btnVoltar);
    }

    private void btnListar(ActionEvent actionEvent) {
        try {
            AdmListar admListar = new AdmListar();
            admListar.setVisible(true);
            setVisible(false);
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir a tela de Lista erro: " + error, "Erro", JOptionPane.ERROR_MESSAGE);

        }


    }
    private void btnVoltar(ActionEvent actionEvent) {
        Login Login = new Login();
        Login.setVisible(true);
        setVisible(false);
    }
}
