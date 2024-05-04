package Bankmanaging;
//import javax.swing.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class deposit extends JFrame implements ActionListener {
    JButton d,e;
    deposit() {
       // setLayout(null);
        setSize(900,1800);
        setLocation(200,50);
        setVisible(true);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons//atm.jpg"));
       Image i2= (i1.getImage().getScaledInstance(900,930,Image.SCALE_DEFAULT));
       ImageIcon i3=new ImageIcon(i2);
JLabel i4=new JLabel(i3);
add(i4);
JLabel ab=new JLabel("Enter the amount that you want to deposit");
ab.setFont(new Font("System",1,16));
ab.setForeground(Color.WHITE);
 ab.setBounds(485,300,600,50);
 i4.add(ab);
 JTextField c=new JTextField();
 c.setBounds(480,360,350,30);
 i4.add(c);
 d=new JButton("DEPOSIT");
 d.setBounds(680,420,150,30);
 i4.add(d);
        d.addActionListener(this);

        e=new JButton("BACK");
        e.setBounds(680,460,150,30);
        i4.add(e);
        e.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent g) {
        if(g.getSource()==e){
            setVisible(false);
            new atm().setVisible(true);
        }
    }


          public static void main (String[]args) {
              deposit v = new deposit();
          }


   }
