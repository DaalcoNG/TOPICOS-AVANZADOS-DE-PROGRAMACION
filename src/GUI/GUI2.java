package GUI;

import javax.swing.JFrame;

public class GUI2 {
       public GUI2(){
           JFrame frame= new JFrame("Ventana sin herencia");
        frame.setSize(370,450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
