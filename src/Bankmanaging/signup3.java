package Bankmanaging;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class signup3 extends JFrame implements ActionListener{
    JButton v;
signup3(){
setLayout(null);
    setSize(1500,1000);
    setBackground(Color.WHITE);
   setVisible(true);
   setLocation(10,10);
    JLabel a=new JLabel("Page 3:Account Details");
    a.setFont(new Font("Raleway",1,32));
    a.setBounds(400,10,400,70);
a.setBackground(Color.BLACK);
    add(a);
    JLabel b=new JLabel("Account Details");
    b.setBounds(70,100,300,80);
    b.setFont((new Font ("Raleway",1,32)));
    add(b);
    JRadioButton c=new JRadioButton("Saving Account");
    c.setFont((new Font("Raleway",1,28)));
    c.setBounds(75,150,300,80);
    add(c);
    JRadioButton d=new JRadioButton("Fixed Deposit Account");
    d.setFont((new Font("Raleway",1,28)));
    d.setBounds(435,150,500,90);
    add(d);
    JRadioButton e=new JRadioButton("Current Account");
    e.setFont((new Font("Raleway",1,28)));
    e.setBounds(75,210,350,80);
    add(e);
    JRadioButton f=new JRadioButton("Reccuring Deposit Account");
    f.setFont((new Font("Raleway",1,28)));
    f.setBounds(433,200,650,100);
    add(f);
    ButtonGroup j=new ButtonGroup();
    j.add(c);j.add(d);
    j.add(e);j.add(f);
    JLabel g=new JLabel("Card Number");
    g.setFont((new Font("Raleway",1,28)));
    g.setBounds(80,290,370,120);
    add(g);
    JLabel h=new JLabel("Your 16 Digit Card Number");
    h.setFont((new Font("Raleway",1,18)));
    h.setBounds(80,330,370,120);
    add(h);
    JLabel i=new JLabel("XXXX-XXXX-XXXX-4184");
    i.setFont((new Font("Raleway",1,24)));
    i.setBounds(380,285,770,135);
    add(i);
    JLabel k=new JLabel("PIN:");
    k.setFont((new Font("Raleway",1,24)));
    k.setBounds(80,365,270,135);
    add(k);
    JLabel l=new JLabel("XXXX");
    l.setFont((new Font("Raleway",1,24)));
    l.setBounds(380,365,170,135);
    add(l);
    JLabel m=new JLabel("Your 4 Digit Password");
    m.setFont((new Font("Raleway",1,18)));
    m.setBounds(80,400,570,135);
    add(m);
    JLabel n=new JLabel("Services Required:");
    n.setFont((new Font("Raleway",1,24)));
    n.setBounds(80,450,370,140);
    add(n);
    JRadioButton o=new JRadioButton("ATM CARD");
    o.setFont((new Font("Raleway",1,28)));
    o.setBounds(75,525,350,90);
    add(o);
    JRadioButton p=new JRadioButton("INTERNET BANKING");
    p.setFont((new Font("Raleway",1,28)));
    p.setBounds(435,520,450,90);
    add(p);
    JRadioButton q=new JRadioButton("MOBILE BANKING");
    q.setFont((new Font("Raleway",1,28)));
    q.setBounds(75,580,350,90);
    add(q);
    JRadioButton r=new JRadioButton("EMAIL AND SMS ALERTS");
    r.setFont((new Font("Raleway",1,28)));
    r.setBounds(437,580,550,90);
    add(r);
    JRadioButton s=new JRadioButton("CHEQUE BOOK");
    s.setFont((new Font("Raleway",1,28)));
    s.setBounds(77,635,250,90);
    add(s);
    JRadioButton t=new JRadioButton("E-STATEMENT");
    t.setFont((new Font("Raleway",1,28)));
    t.setBounds(437,635,250,90);
    add(t);
    JRadioButton u=new JRadioButton("I hereby declare that the above entered details are correct and to the best of my knowledge");
    u.setFont((new Font("Raleway",1,16)));
    u.setBounds(50,700,900,70);
    add(u);
     v=new JButton("SUBMIT");
    v.setBounds(1000,690,200,40);
  v.setBackground(Color.WHITE);
  add(v);
  v.addActionListener(this);
    JButton w=new JButton("CANCEL");
    w.setBounds(1000,735,200,40);
    w.setBackground(Color.WHITE);
add(w);
w.addActionListener(this);
}
public void actionPerformed(ActionEvent e){

}
    public static void main(String[] args) {
signup3 x=new signup3();

    }
}
