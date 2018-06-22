package exceptionexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) throws SQLException {
        int a[] = new int[2];
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        Connection con = DriverManager.getConnection("");
        try {

            System.out.println("Enter a Number : ");
            a[0] = sc.nextInt();
            System.out.println("Enter a Number : ");
            a[1] = sc.nextInt();
            ans = a[0] / a[1];
            System.out.println("Calc is done.");
        } catch (ArithmeticException e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("You cannot divide by Char.");
            ans = 1;
        } catch (RuntimeException e) {
            System.out.println("Some Error Occoured.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Ans is " + ans);
            System.out.println("Other Tasks....");
            System.out.println("End of Program");
        }

//        Calc c=new Calc();
//        c.disp();
    }

}
