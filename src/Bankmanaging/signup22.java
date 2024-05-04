package Bankmanaging;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.Random;


public class signup22 extends JFrame implements ActionListener {
JButton kk;
JTextField b,e,g,i,m,u;
JRadioButton n,q;
JDateChooser k;
long rd;
    Random rq=new Random();
    signup22() {
rd=(rq.nextInt())%10+2;
        this.setLayout((LayoutManager)null);
        this.setSize(1200, 800);
        this.setVisible(true);
        this.setLocation(250, 100);
        JLabel a = new JLabel("NAME");
        a.setFont(new Font("Raleway", 1, 24));
        a.setBounds(100, 90, 100, 50);
        this.add(a);
        JLabel c = new JLabel("APPLICATION NO:"+rd);
        c.setBounds(350, 20, 450, 30);
        c.setFont(new Font("Raleway", 1, 32));
        this.add(c);
        b = new JTextField(" ");
        b.setBounds(300, 90, 400, 35);
        b.setForeground(Color.WHITE);
        this.add(b);
        JLabel d = new JLabel("FATHER NAME");
        d.setFont(new Font("Raleway", 1, 24));
        d.setBounds(100, 145, 200, 50);
        this.add(d);
        e = new JTextField(" ");
        e.setBounds(300, 150, 400, 35);
        e.setForeground(Color.WHITE);
        this.add(e);
        JLabel f = new JLabel("MOTHER NAME");
        f.setFont(new Font("Raleway", 1, 24));
        f.setBounds(100, 215, 200, 50);
        this.add(f);
         g = new JTextField(" ");
        g.setBounds(300, 220, 400, 35);
        g.setForeground(Color.WHITE);
        this.add(g);
        JLabel h = new JLabel("CITY");
        h.setFont(new Font("Raleway", 1, 24));
        h.setBounds(100, 275, 200, 50);
        this.add(h);
         i = new JTextField(" ");
        i.setBounds(300, 280, 400, 35);
        i.setForeground(Color.WHITE);
        this.add(i);
        JLabel j = new JLabel("DATE OF BIRTH");
        j.setFont(new Font("Raleway", 1, 24));
        j.setBounds(100, 325, 200, 50);
        this.add(j);
        JDateChooser k = new JDateChooser();
        k.setForeground(Color.WHITE);
        k.setBounds(300, 330, 400, 35);
        this.add(k);
        JLabel l = new JLabel("EMAIL ADDRESS");
        l.setFont(new Font("Raleway", 1, 24));
        l.setBounds(100, 375, 200, 50);
        this.add(l);
         m = new JTextField(" ");
        m.setBounds(300, 385, 400, 35);
        m.setForeground(Color.WHITE);
        this.add(m);
        JLabel r = new JLabel("GENDER");
        r.setFont(new Font("Raleway", 1, 24));
        r.setBounds(100, 425, 150, 50);
        this.add(r);
        JRadioButton n = new JRadioButton(" MALE");
        n.setBounds(300, 430, 200, 50);
        add(n);
        n.setForeground(Color.BLACK);
        n.addActionListener(this);
        JRadioButton q = new JRadioButton(" FEMALE");
        q.setBounds(500, 430, 200, 50);
        add(q);
        q.setForeground(Color.BLACK);
        q.addActionListener(this);
        ButtonGroup s = new ButtonGroup();
        s.add(n);
        s.add(q);
        JLabel t = new JLabel("PIN");
        t.setFont(new Font("Raleway", 1, 24));
        t.setBounds(100, 480, 160, 50);
        this.add(t);
         u = new JTextField(" ");
        u.setBounds(300, 480, 410, 35);
        u.setForeground(Color.WHITE);
        this.add(u);
         kk=new JButton("Next");
        kk.setBounds(510,600,200,30);
        kk.setBackground(Color.WHITE);
        kk.setFont(new Font("Raleway",1,24));
        add(kk);
        kk.addActionListener(this);
    }

    public  void actionPerformed(ActionEvent o) {
      if(o.getSource()==kk){
              setVisible(false);
new signup2().setVisible(true);
      }
       String aa=" "+rd;
       String bb=b.getText();
       //String cc= dateChooser.getDateEditor().getUicomponent().getText();
String dd=e.getText();
String ee=g.getText();
String ff=i.getText();
String gg=m.getText();
String hh=u.getText();
//String ii=null;
//if(n.isSelected()){
 //       ii="Male";
//}
//if(q.isSelected()){
  //      ii="Female";
//}
try{
if(b.equals("")){
        JOptionPane.showMessageDialog(null,"Name Is Required");
}
else{
        connect c=new connect();
        String query="insert into signup values ('"+aa+"',' "+bb+"','"+dd+"','"+ee+"','"+ff+"','"+gg+"','"+hh;
         c.s.executeUpdate(query);
}
    }
catch(Exception e){
        System.out.println(e);
            }
}
    public static void main(String[] args) {
        new signup22();
    }
}

