package GUI;

import IO.Jopi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Gui8 extends JFrame implements ActionListener{
    private JLabel label1;
    private JTextField textfield1;
    private JButton boton1;
    public Gui8(){
    super("Gui8:Activacion Oyente"); //tambien se puede usar setTitle("Gui8:Activacion Oyente");
        setLayout(null);
        setSize(300,150);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        /*Etiquetra que sirve para escribir texto adicionalmente pude mostrar una imagen*/
        label1 =new JLabel("Nombre");
        label1.setBounds(10,10,100,30); 
        add(label1);
        textfield1=new JTextField();
        textfield1.setBounds(80,10,150,30);
        add(textfield1);
        
         boton1=new JButton("Saludar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);
        setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==boton1){
           Jopi.outMessage("Hola"+textfield1.getText()+"como estas?","mensage", 1);
       }
    }
    
}
