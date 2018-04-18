package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Parte_2 implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton1;
    JButton boton2;

    public Parte_2() {
        marco=new JFrame("CURSO DAM");
        panel=new JPanel();
        boton1=new JButton("Base datos");
        boton2=new JButton("Programación");

        marco.add(panel);
        panel.setSize(400, 200);
        marco.setSize(400, 200);

        panel.add(boton1);
        panel.add(boton2);

        boton1.addActionListener(this);
        boton2.addActionListener(this);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Convierto el evento en un Objeto Botón y recojo el texto de este botón
        marco.setTitle(((JButton) e.getSource()).getText());

    }

}
