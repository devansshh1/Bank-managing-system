package icons;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class i1 {

        i1(){
            Random r=new Random();

            JLabel aa=new JLabel(" APPLICATION NUMBER"+r.nextInt());
            aa.setBounds(200,100,150,30);
            aa.setFont(new Font("Raleway",Font.BOLD,38));
        }
        public static void main(String[] args) {
            i1 v=new i1();
        }
    }



