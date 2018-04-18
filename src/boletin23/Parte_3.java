/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ablancoabalde
 */
public class Parte_3 implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton1;
    JButton boton2;
    JLabel premer1;

    public Parte_3() {
        marco=new JFrame("Saudo e Despedida");
        panel=new JPanel();
        boton1=new JButton("Saudo");
        boton2=new JButton("Despedido");
        premer1=new JLabel();
        
        marco.add(panel);
        panel.setSize(400, 200);
        marco.setSize(400, 200);

        panel.add(boton1);
        panel.add(boton2);
        panel.add(premer1);

        boton1.addActionListener(this);
        boton2.addActionListener(this);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         JButton boton=(JButton) e.getSource();
        if (boton==boton1) {
            premer1.setText("Un saudo a DAM");
        } else {
            premer1.setText("fin do programa ");
        }
    }

}
