package GUI;

import IO.Jopi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Gui12 extends JFrame implements ActionListener  {
    private JLabel lb1,lb2,lb3,lb4;
    private JButton bt1,bt2,bt3;
    private JTextField txtf1,txtf2,txtf3,txtf4;
    public Gui12(){
        setLayout(null);
        setSize(300,300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        lb1 =new JLabel("No control");
        lb1.setBounds(10,10,100,30); 
        add(lb1);
        txtf1=new JTextField();
        txtf1.setBounds(80,10,150,30);
        add(txtf1);
        
        lb2 = new JLabel("Nombre");
        lb2.setBounds(10, 50, 100, 30);
        add(lb2);
        txtf2=new JTextField();
        txtf2.setBounds(80,50,150,30);
        add(txtf2);

        lb3 = new JLabel("Semestre");
        lb3.setBounds(10, 90, 100, 30);
        add(lb3);
        txtf3=new JTextField();
        txtf3.setBounds(80,90,150,30);
        add(txtf3);

        
        lb4 = new JLabel("Edad");
        lb4.setBounds(10, 130, 100, 30);
        add(lb4);
        txtf4=new JTextField();
        txtf4.setBounds(80,130,150,30);
        add(txtf4);

        bt1 = new JButton("Añadir");
        bt1.setBounds(10, 170, 80, 30);
        add(bt1);
        bt1.addActionListener(this);
        
        bt2 = new JButton("Eliminar");
        bt2.setBounds(100, 170, 80, 30);
        add(bt2);
        bt2.addActionListener(this);
        
        bt3 = new JButton("Saludar");
        bt3.setBounds(190, 170, 80, 30);
        add(bt3);
        bt3.addActionListener(this);
        setVisible(true);
    }
        @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==bt3){
           Jopi.outMessage("BUENAS TARDES","mensage", 1);
       }
       if (e.getSource() == bt1) {
           Jopi.outMessage("BUENAS TARDES", "mensage", 1);
       }
    }
}
