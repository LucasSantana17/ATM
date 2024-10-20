package Screen;
import atm.Account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {

    JPanel painelHome = new JPanel();
    JButton botaoCadastro = new JButton("Cadastro");
    JButton botaoConta = new JButton("Conta");
    JLabel cadastroTxt = new JLabel();
    JLabel contaTxt = new JLabel();


    public Home(){
        setTitle("Home");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(0,0,0));
        add(painelHome);

        painelHome.setBounds(95,70,400,400);
        painelHome.setBackground( new Color(36, 101, 126));
        painelHome.setLayout(null);

        painelHome.add(botaoCadastro);
        painelHome.add(cadastroTxt);
        painelHome.add(botaoConta);
        painelHome.add(contaTxt);

        contaTxt.setText("Acessar conta");
        contaTxt.setFont(new Font("Arial",Font.BOLD,20));
        contaTxt.setBounds(10,20, 300, 30);

        botaoConta.setBounds(10,50,100,30);
        botaoConta.setVisible(true);

        cadastroTxt.setText("Criar conta");
        cadastroTxt.setFont(new Font("Arial",Font.BOLD,20));
        cadastroTxt.setBounds(10,100, 300, 30);

        botaoCadastro.setBounds(10,130,100,30);
        botaoCadastro.setVisible(true);

        botaoCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cadastro();
            }
        });

        botaoConta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });

        setVisible(true);
    }
}
