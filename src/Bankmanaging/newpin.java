package Bankmanaging;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class newpin extends JFrame implements ActionListener {

    JLabel a,b,c;
    JButton g,f;
    JTextField e;
    newpin(){
       // setLayout(null);
        setSize(1500,1800);
        setLocation(200,50);
        setVisible(true);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons//atm.jpg"));
        Image i2= (i1.getImage().getScaledInstance(900,930,Image.SCALE_DEFAULT));
        ImageIcon i3=new ImageIcon(i2);
        JLabel i4=new JLabel(i3);
        add(i4);
        a=new JLabel("Change Your  Pin");
        a.setFont(new Font("Raleway",1,22));
        a.setBounds(550,250,400,100);
        a.setForeground(Color.WHITE);
        i4.add(a);
        b=new JLabel("New Pin");
        b.setFont(new Font("Raleway",1,18));
        b.setForeground(Color.WHITE);
        b.setBounds(475,350,100,50);
       i4.add(b);
       JTextField c=new JTextField("");
       c.setBounds(650,366,170,20);
       i4.add(c);
       JLabel d=new JLabel("Re Enter New  Pin");
       d.setFont(new Font("Raleway",1,18));
       d.setForeground(Color.WHITE);
       d.setBounds(475,390,350,50);
       i4.add(d);
         e=new JTextField("");
        e.setBounds(650,405,170,20);
        i4.add(e);
        f=new JButton("CHANGE");
        f.setBounds(475,450,100,20);
        f.addActionListener(this);
        i4.add(f);

         g=new JButton("BACK");
        g.setBounds(720,450,100,20);
       g.addActionListener(this);
        i4.add(g);
    }
    public void actionPerformed(ActionEvent ef) {
        if (ef.getSource() == g) {
            try {
                setVisible(false);
                new atm().setVisible(true);

         if (ef.getSource() == f) {
                    String w = c.getText();
                    String q = e.getText();
                    if (!w.equals(q)) {
                        JOptionPane.showMessageDialog(null, "Both pins do not match");
                        return;
                    }
                }

            }
            catch(Exception e){
                System.out.print(e);
            }
        }
    }
    public static void main(String[] args) {
        newpin v=new newpin();
    }


}
