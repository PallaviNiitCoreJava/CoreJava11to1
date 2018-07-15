package filehandelingexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class FileHandelingExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
 
//        FileOutputStream fos=new FileOutputStream("Demo.txt",true);
//        OutputStreamWriter osw=new OutputStreamWriter(fos);
//        BufferedWriter bw=new BufferedWriter(osw);
//        PrintWriter pw=new PrintWriter(bw);
        
        PrintWriter pw=new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream("Demo.txt",true)
                        )
                )
        );
        pw.println("This is Text by Java.");
        pw.println("This is Text by Java.");
        pw.close();
        
//        FileInputStream in=new FileInputStream("Demo.txt");
//        InputStreamReader isr=new InputStreamReader(in);
//        BufferedReader  br=new BufferedReader(isr);
        BufferedReader  br=new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("Demo.txt")
                )
        );
        String data=br.readLine();
        
        System.out.println(data);
        data=br.readLine();
        
        System.out.println(data);
        
//        InputStreamReader isr=new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(isr);
//        System.out.println("Enter you Name ");
//        String str=br.readLine();
//        int a=Integer.parseInt(str);
//        System.out.println("Welcome "+a);
        
    }
    
}
