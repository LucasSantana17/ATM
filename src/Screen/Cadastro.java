package Screen;
import atm.Account;
import atm.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro {

    JFrame frame = new JFrame();
    JPanel painel = new JPanel();
    JButton Enviar = new JButton();
    JTextField input = new JTextField();
    JTextField PIN = new JTextField();

    JLabel pinTxt = new JLabel();

    JLabel nomeTxt = new JLabel();

    public Cadastro(){

        frame.setTitle("CADASTRO");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        frame.add(painel);


        painel.setBounds(95,70,400,400);
        painel.setBackground( new Color(94, 92, 92));
        painel.setLayout(null);

        painel.add(Enviar);
        painel.add(input);
        painel.add(PIN);
        painel.add(pinTxt);
        painel.add(nomeTxt);
        painel.setVisible(true);

        nomeTxt.setText("Insira o Nome");
        nomeTxt.setFont(new Font("Arial",Font.BOLD,20));
        nomeTxt.setBounds(10,80,300,40);
        nomeTxt.setVisible(true);

        pinTxt.setText("Insira o PIN");
        pinTxt.setFont(new Font("Arial",Font.BOLD,20));
        pinTxt.setBounds(10,180,300,40);
        pinTxt.setVisible(true);

        //Botão enviar
        Enviar.setText("Enviar");
        Enviar.setBounds(10,290,100,30);
        Enviar.setBackground(new Color(0x24657E));

        //Entrada
        input.setBounds(10,120,300,40);
        input.setVisible(true);
        input.setBackground(new Color(0xFDFDFD));

        PIN.setBounds(10,220,300,40);
        PIN.setVisible(true);
        PIN.setBackground(new Color(0xFDFDFD));

        frame.setVisible(true);

        Enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = input.getText();
                int pin = Integer.parseInt(PIN.getText());
                Usuario user = new Usuario(nome, pin);

                Account acc = new Account();
                acc.add(user.getNomeUser(), user.getPIN());
                acc.mostrarLista();

                new Home();


            }
        });
    }
}
