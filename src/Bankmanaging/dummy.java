package Bankmanaging;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class dummy extends JFrame {

        dummy(){
            //setLayout(null);
            Random r=new Random();
            //setSize(800,800);
            //setVisible(true);
            //setLocation(250,50);
            JLabel a=new JLabel("APPLICATION NO."+r.nextInt()%10);
            a.setBounds(200,30,950,80);
            a.setFont(new Font("Raleway",Font.BOLD,24));
            //add(a);

            JLabel b=new JLabel("NAME");
            b.setBounds(50,130,170,20);
            b.setFont(new Font("Raleway",Font.BOLD,28));
            //add(b);

            JTextField c=new JTextField(" ");
            c.setBounds(250,130,70,20);
            c.setForeground(Color.BLACK);
            //add(c);

            JLabel d=new JLabel("FATHER NAME");
            d.setBounds(50,170,170,20);
            d.setFont(new Font("Raleway",Font.BOLD,28));
          //  add(d);

            JLabel e=new JLabel("MOTHER NAME");
            e.setBounds(50,200,170,20);
            e.setFont(new Font("Raleway",Font.BOLD,28));
           // add(e);
        }
        public static void main(String[] args) {
          dummy u=new dummy();
            //  Bankmanaging.signup1 v=new Bankmanaging.signup1();
        }
    }

