package Bankmanaging;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class signup2 extends  JFrame implements ActionListener{
    JButton u;
signup2(){
    this.setLayout(null);
    this.setSize(2000,1200);
this.setVisible(true);
this.setLocation(10,10);
setTitle("SIGNUP PAGE 2:");
JLabel z=new JLabel("PAGE 2 ");
z.setFont(new Font("Raleway",Font.BOLD,32));
z.setBounds(750,10,200,40);
add(z);
JLabel a=new JLabel("RELIGION");
a.setFont(new Font("Raleway",Font.BOLD,28));
a.setBounds(20,40,200,70);
add(a);
String[]d={"Hindu","Muslim","Christian","Others"};
JComboBox b=new JComboBox(d);
    b.setFont(new Font("Raleway",Font.BOLD,28));
    b.setBounds(200,60,200,30);
b.setBackground(Color.WHITE);
    add(b);
JLabel c=new JLabel("CASTE");
    c.setFont(new Font ("Raleway",Font.BOLD,28));
    c.setBounds(20,110,200,70);
    add(c);

String[]e={"General","OBC","SC","ST"};
JComboBox f=new JComboBox(e);
f.setFont(new Font ("Raleway",Font.BOLD,28));
f.setBounds(200,130,200,30);
add(f);
    JLabel g=new JLabel("INCOME");
    g.setFont(new Font ("Raleway",Font.BOLD,28));
    g.setBounds(20,170,200,70);
    add(g);

    String[]h={"Null","< 5 Lakh","< 10 Lakh","< 20 Lakh","Other"};
    JComboBox i=new JComboBox(h);
    i.setFont(new Font ("Raleway",Font.BOLD,28));
    i.setBounds(200,190,200,30);
    i.setBackground(Color.WHITE);
    add(i);

    JLabel j=new JLabel("EDUCATIONAL \n QUALIFICATION" );
    j.setFont(new Font ("Raleway",Font.BOLD,28));
    j.setBackground(Color.WHITE);
    j.setBounds(20,210,500,100);
    add(j);
String[]k={"Non Graduate","BCA","MCA","BTECH","DIPLOMA"};
JComboBox l=new JComboBox(k);
l.setFont(new Font("Raleway",Font.BOLD,28));
l.setBackground(Color.WHITE);
l.setBounds(480,240,300,40);
add(l);

JLabel m=new JLabel("PAN NUMBER");
m.setFont(new Font("Raleway",Font.BOLD,28));
m.setBounds(20,260,350,100);
add(m);
JTextField n=new JTextField(" ");
n.setBounds(220,290,200,40);
add(n);
    JLabel o=new JLabel("AADHAR NUMBER");
    o.setFont(new Font("Raleway",Font.BOLD,28));
    o.setBounds(20,320,350,100);
    add(o);
    JTextField p=new JTextField(" ");
    p.setBounds(310,350,250,40);
    add(p);
    JLabel r=new JLabel("EXISTING ACCOUNT");
    r.setFont(new Font("Raleway",Font.BOLD,28));
    r.setBounds(20,410,350,40);
    add(r);
    JRadioButton q=new JRadioButton("YES");
    q.setBounds(400,410,80,40);
    add(q);
    JRadioButton s=new JRadioButton("NO");
    s.setBounds(490,410,80,40);
    add(s);
    ButtonGroup t=new ButtonGroup();
    t.add(q);
    t.add(s);
     u=new JButton("NEXT");
    u.setBounds(250,500,180,50);
    add(u);
    u.addActionListener(this);

}
    public void actionPerformed(ActionEvent e){
if(e.getSource()==u){
    setVisible(false);
    new signup3().setVisible(true);
}
}
    public static void main(String[] args) {
signup2 x=new signup2();

        }

    }

