
package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui5 extends JFrame{
    public Gui5(){
        super("Ventana/Herencia");//Establece titulo de ventana
        getContentPane().setLayout(new FlowLayout());//se agrega layout en la ventana
        JButton boton= new JButton("boton");
        JLabel etiqueta = new JLabel("Dato");
        JTextField textField=new JTextField(10);
        JCheckBox chekBox= new JCheckBox("check box");   
        getContentPane().add(boton);
        getContentPane().add(etiqueta);
        getContentPane().add(textField);
        getContentPane().add(chekBox);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
}
