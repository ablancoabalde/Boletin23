package boletin23;

import static java.awt.Color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Parte_4 implements ActionListener {

    JFrame marco;
    JPanel panel1;
    JPanel panel2;
    JButton boton1;
    JButton boton2;

    public Parte_4() {
        marco=new JFrame("CURSO DAM");
        panel1=new JPanel();
        panel2=new JPanel();
        boton1=new JButton("Base datos");
        boton2=new JButton("Programación");

        marco.add(panel1);
        marco.add(panel2);
        marco.setSize(400, 400);
        panel1.setSize(200, 100);
        panel2.setSize(200, 100);
        
        
        panel1.setBackground(red);
        panel2.setBackground(yellow);
        panel1.add(boton1);
        panel2.add(boton2);

        boton1.addActionListener(this);
        boton2.addActionListener(this);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        panel1.setVisible(true);
        panel2.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton boton=(JButton) e.getSource();
        if (boton==boton1) {
            panel1.setVisible(false);
            panel2.setVisible(true);
        } else {
            panel1.setVisible(true);
            panel2.setVisible(false);
        }
    }

}
