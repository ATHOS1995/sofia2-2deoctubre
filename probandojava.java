//fullchatgpt//

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BotonJava{

    public static void main(String[] args){

        JFrame ventana = new JFrame("Botón Java");

        JButton boton = new JButton("Presioname");

        boton.setBounds(80, 60, 140, 40);

        boton.addActionListener(e -> {

            JOptionPane.showMessageDialog(null, "Hola desde Java.");

        });

        ventana.add(boton);

        ventana.setSize(300, 200);

        ventana.setLayout(null);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.setVisible(true);

    }

}