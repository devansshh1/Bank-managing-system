package Bankmanaging;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class logged extends JFrame implements ActionListener {
    JButton g, h, i;
    JTextField f, d;

    logged() {
        setTitle("OUR BANK");
        setLayout(null);
        JLabel b = new JLabel("WELCOME TO THE BANK");
        b.setFont(new Font("Raleway", Font.BOLD, 38));
        //   b.setSize(600,200);
        b.setBounds(200, 50, 750, 40);
        //b.setBackground(Color.GREEN);
        //b.setForeground(Color.BLUE);
        add(b);
        JLabel c = new JLabel("NAME");
        c.setBounds(100, 105, 300, 200);
        c.setFont(new Font("Raleway", Font.ITALIC, 28));
        c.setForeground(Color.ORANGE);
        // c.setBackground(Color.BLACK);
        add(c);
        d = new JTextField(" ");
        d.setBounds(200, 190, 300, 30);
        add(d);

        JLabel e = new JLabel("PIN");
        e.setBounds(100, 145, 300, 200);
        e.setFont(new Font("Raleway", Font.ITALIC, 28));
        e.setForeground(Color.ORANGE);
        add(e);
        f = new JPasswordField("");
        f.setBounds(200, 230, 300, 30);
        add(f);
        setSize(800, 400);
        setLocation(200, 150);
        setVisible(true);
        g = new JButton("CLEAR");
        g.setBounds(200, 280, 100, 30);
        g.setBackground(Color.BLACK);
        g.setForeground(Color.WHITE);
        add(g);
        g.addActionListener(this);

        h = new JButton("SIGN UP");
        h.setBounds(380, 280, 100, 30);
        h.setBackground(Color.BLACK);
        h.setForeground(Color.WHITE);
        add(h);
        h.addActionListener(this);

        i = new JButton("SIGN IN");
        i.setBounds(275, 315, 150, 30);
        i.setBackground(Color.BLACK);
        i.setForeground(Color.WHITE);
        add(i);
        i.addActionListener(this);

    }


public void actionPerformed(ActionEvent e) {
    if (e.getSource() == g) {
        f.setText(" ");
        d.setText(" ");

    } else if (e.getSource() == h) {
        setVisible(false);
        new signup22().setVisible(true);
    } else if (e.getSource() == i) {

    }
}
    public static void main(String[] args) {
        logged n=new logged();
    }
    }
