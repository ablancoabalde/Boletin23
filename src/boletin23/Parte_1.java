package boletin23;

import static java.awt.Color.red;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Parte_1 implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel premer;

    public Parte_1() {
        marco=new JFrame("Ejericio 1");
        panel=new JPanel();
        boton=new JButton("Presiona");
        premer=new JLabel();

        marco.add(panel);
        panel.setSize(400, 200);
        marco.setSize(400, 200);
        marco.setLayout(null);
        panel.setLayout(null);

        panel.add(boton);
        panel.add(premer);

        boton.setBounds(25, 25, 100, 80);
        premer.setBounds(100, 100, 150, 50);

        boton.addActionListener(this);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (premer.getText()=="") {
            premer.setText("Premeches o boton");
        } else {
            premer.setText("");
        }

    }

}
