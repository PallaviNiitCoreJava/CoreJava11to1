package exceptionexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calc {
    
    public void disp()
    {

        try {
            System.out.println("Ans is "+ans(5,0));
        } catch (SQLException ex) {
            Logger.getLogger(Calc.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    public int ans(int a,int b) throws SQLException
    {
        return divide(a,b);
    }
    public int divide(int a,int b) throws SQLException
    {
         Connection con = DriverManager.getConnection("");
        return a/b;
    }
}
