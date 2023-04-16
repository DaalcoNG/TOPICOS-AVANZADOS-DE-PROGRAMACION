package GUI;

import javax.swing.JFrame;

public class GUI1 extends JFrame{
    public GUI1(){
        super("Ventana usando herencia");
        setSize(370,450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    
}
