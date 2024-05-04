package Bankmanaging;
//import javax.swing.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class withdraw extends JFrame implements ActionListener {
    JButton d,e,i;
    withdraw() {
        // setLayout(null);
        setSize(900,1800);
        setLocation(200,50);
        setVisible(true);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons//atm.jpg"));
        Image i2= (i1.getImage().getScaledInstance(900,930,Image.SCALE_DEFAULT));
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        add(i4);
        JLabel ab=new JLabel("Enter the amount that you want to withdraw");
        ab.setFont(new Font("System",1,16));
        ab.setForeground(Color.WHITE);
        ab.setBounds(485,250,600,50);
        i4.add(ab);
       JButton c=new JButton("100");
        c.setFont((new Font("Raleway",1,16)));
        c.setBounds(470,335,150,40);
        i4.add(c);
        c.addActionListener(this);
        d=new JButton("200");
        d.setFont((new Font("Raleway",1,16)));
        d.setBounds(470,385,150,40);
        i4.add(d);
        e=new JButton("300");
        e.setFont((new Font("Raleway",1,16)));
        e.setBounds(470,435,160,40);
        i4.add(e);
         JButton f=new JButton("500");
        f.setFont((new Font("Raleway",1,16)));
        f.setBounds(625,327,200,40);
        i4.add(f);
        JButton g=new JButton("1000");
        g.setFont((new Font("Raleway",1,16)));
        g.setBounds(625,370,200,40);
        i4.add(g);
        JButton h=new JButton("10000");
        h.setFont((new Font("Raleway",1,16)));
        h.setBounds(632,415,200,40);
        i4.add(h);
          i=new JButton("BACK");
        i.setFont((new Font("Raleway",1,16)));
        i.setBounds(632,457,200,40);
        i.addActionListener(this);

        i4.add(i);
        setUndecorated(true);
    }

    @Override
    public void actionPerformed(ActionEvent g) {
        if(g.getSource()==i){
            setVisible(false);
            new atm().setVisible(true);
        }
    }




    public static void main(String[] args) {
withdraw q=new withdraw();


    }
}
