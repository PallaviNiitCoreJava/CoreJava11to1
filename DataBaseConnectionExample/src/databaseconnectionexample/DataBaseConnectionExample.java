package databaseconnectionexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DataBaseConnectionExample {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {

        Class.forName("org.apache.derby.jdbc.ClientDriver");
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/StudMgmSys", "pal", "pal");
        System.out.println("Connection Done!");
//        DML         PreparedStatement  java.sql
//        DQL         Statement   java.sql

        System.out.println("Enter user id ");
        Scanner sc=new Scanner(System.in);
        int id =sc.nextInt();
        //int id =new Scanner(System.in).nextInt();
        //int id=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("Enter user name ");
        String name=new Scanner(System.in).next();
        //String name=new BufferedReader(new InputStreamReader(System.in)).readLine();

        String stm = "insert into studdet values (?,?)";
        PreparedStatement pst = con.prepareStatement(stm);
        pst.setInt(1, id);          //pst.setInt(<Question Number>,variable);
        pst.setString(2, name);
        
        int b=pst.executeUpdate();
        if (b>0)
        {
            System.out.println("Data is Inserted ");
        }
//        String str="select * from Studdet";
//        
//        Statement st=con.createStatement();
//        ResultSet rs=st.executeQuery(str);
//        
//        while(rs.next())
//        {
//            System.out.println(rs.getInt("sid")+"   "+rs.getString("sname"));
////            System.out.println(rs.getInt(1)+"   "+rs.getString(2));
//        }
    }

}
