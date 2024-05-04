package Bankmanaging;
import com.toedter.calendar.JDateChooser;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class signup1 extends JFrame implements ActionListener{
    signup1(){
setLayout(null);
setSize(1200,800);
setVisible(true);
setLocation(250,100);
JLabel a=new JLabel("NAME");
a.setFont(new Font( "Raleway",Font.BOLD,24));
a.setBounds(100,90,100,50);
add(a);

JLabel c=new JLabel("APPLICATION NO");
c.setBounds(350,20,350,30);
c.setFont(new Font("Raleway",Font.BOLD,32));
add(c);

JTextField b=new JTextField(" ");
b.setBounds(300,90,400,35);
b.setForeground(Color.WHITE);
b.setBackground(Color.BLACK);
add(b);

        JLabel d=new JLabel("FATHER NAME");
        d.setFont(new Font( "Raleway",Font.BOLD,24));
        d.setBounds(100,145,200,50);
        add(d);

        JTextField e=new JTextField(" ");
        e.setBounds(300,150,400,35);
        e.setForeground(Color.WHITE);
        e.setBackground(Color.BLACK);
        add(e);

        JLabel f=new JLabel("MOTHER NAME");
        f.setFont(new Font( "Raleway",Font.BOLD,24));
        f.setBounds(100,215,200,50);
        add(f);

        JTextField g=new JTextField(" ");
        g.setBounds(300,220,400,35);
        g.setForeground(Color.WHITE);
        g.setBackground(Color.BLACK);
        add(g);

        JLabel h=new JLabel("CITY");
        h.setFont(new Font( "Raleway",Font.BOLD,24));
        h.setBounds(100,275,200,50);
        add(h);

        JTextField i=new JTextField(" ");
        i.setBounds(300,280,400,35);
        i.setForeground(Color.WHITE);
        i.setBackground(Color.BLACK);
        add(i);

        JLabel j=new JLabel("DATE OF BIRTH");
        j.setFont(new Font( "Raleway",Font.BOLD,24));
        j.setBounds(100,325,200,50);
        add(j);

        JDateChooser k=new JDateChooser();
        k.setForeground(Color.BLACK);
        k.setBackground(Color.BLACK);
        k.setBounds(300,330,400,35);
        add(k);

        JLabel l=new JLabel("EMAIL ADDRESS");
        l.setFont(new Font( "Raleway",Font.BOLD,24));
        l.setBounds(100,375,200,50);
        add(l);

        JTextField m=new JTextField(" ");
        m.setBounds(300,385,400,35);
        m.setForeground(Color.WHITE);
        m.setBackground(Color.BLACK);
        add(m);

        JLabel r=new JLabel("GENDER");
        r.setFont(new Font( "Raleway",Font.BOLD,24));
        r.setBounds(100,425,150,50);
        add(r);

        JRadioButton n=new JRadioButton(" MALE");
        n.setBounds(300,430,200,50);
        add(n);
        n.setForeground(Color.BLACK);
        n.addActionListener(this);

        JRadioButton q=new JRadioButton(" FEMALE");
        q.setBounds(500,430,200,50);
        add(q);
q.setForeground(Color.BLACK);
        q.addActionListener(this);

        ButtonGroup s=new ButtonGroup();
        s.add(n);
        s.add(q);

        JLabel t=new JLabel("PIN");
        t.setFont(new Font( "Raleway",Font.BOLD,24));
        t.setBounds(100,480,160,50);
        add(t);

        JTextField u=new JTextField(" ");
        u.setBounds(300,480,410,35);
        u.setForeground(Color.WHITE);
        u.setBackground(Color.BLACK);
        add(u);

    }
public void actionPerformed(ActionEvent o){

}
    public static void main(String[] args) {
        signup1 b=new signup1();
    }
}

