package Bankmanaging;
import java.sql.*;
public class connect {
    Connection c;
    Statement s;
    public connect(){
        try{
            c=DriverManager.getConnection("jdbc:mysql:///bankmangment","root","Devfordevansh");
        s=c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
