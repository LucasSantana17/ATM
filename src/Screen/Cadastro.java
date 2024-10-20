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

    public Cadastro(){

        frame.setTitle("CADASTRO");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        //Adicionado componentes
        frame.add(painel);

        painel.setBounds(95,70,400,400);
        painel.setBackground( new Color(94, 92, 92));
        painel.setLayout(null);

        painel.add(Enviar);
        painel.add(input);
        painel.add(PIN);

        //Renderização

        painel.setVisible(true);

        //Botão enviar
        Enviar.setText("Enviar");
        Enviar.setBounds(10,250,100,30);
        Enviar.setBackground(new Color(0x24657E));

        //Entrada
        input.setBounds(10,90,300,40);
        input.setText("Nome");
        input.setVisible(true);
        input.setBackground(new Color(0xFDFDFD));


        PIN.setBounds(10,150,300,40);
        PIN.setText("PIN");
        PIN.setVisible(true);
        PIN.setBackground(new Color(0xFDFDFD));

        frame.setVisible(true);

        Enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = input.getText();
                int pin = Integer.parseInt(PIN.getText());
                Usuario user = new Usuario(nome, pin);

                new Account().addUser(user);
                //user.validacao();
                new Home();


            }
        });
    }
}
