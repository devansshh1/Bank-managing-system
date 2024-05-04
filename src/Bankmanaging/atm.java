package Bankmanaging;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class atm extends JFrame implements ActionListener{
    JButton c,d,e,f,g,h,i;
    atm(){

        setSize(900,900);
        setVisible(true);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel a=new JLabel(i3);
        add(a);

JLabel b=new JLabel("Please Select Your Transaction");
b.setForeground(Color.WHITE);
b.setFont((new Font("Raleway",1,18)));
b.setBounds(530,265,300,40);
a.add(b);
 c=new JButton("DEPOSIT");
c.setFont((new Font("Raleway",1,16)));
c.setBounds(470,335,150,40);
 a.add(c);
 c.addActionListener(this);
         d=new JButton("FAST CASH");
        d.setFont((new Font("Raleway",1,16)));
        d.setBounds(470,385,150,40);
        a.add(d);
         e=new JButton("PIN CHANGE");
        e.setFont((new Font("Raleway",1,16)));
        e.setBounds(470,435,160,40);
        a.add(e);
         f=new JButton("CASH WITHDRAWAL");
        f.setFont((new Font("Raleway",1,16)));
        f.setBounds(625,327,200,40);
        a.add(f);
         g=new JButton("MINI STATEMENT");
        g.setFont((new Font("Raleway",1,16)));
        g.setBounds(625,370,200,40);
        a.add(g);
         h=new JButton("BALANCE ENQUIRY");
        h.setFont((new Font("Raleway",1,16)));
        h.setBounds(632,415,200,40);
        a.add(h);
         i=new JButton("EXIT");
        i.setFont((new Font("Raleway",1,16)));
        i.setBounds(632,457,200,40);
        i.addActionListener(this);

        a.add(i);
         setUndecorated(true);
    }
public void actionPerformed(ActionEvent e){
        if(e.getSource()==i){
            System.exit(0);
        }
        if(e.getSource()==c){
            setVisible(false);
            new deposit().setVisible(true);
        }

}
    public static void main(String[] args) {
        atm v=new atm();

    }
}
