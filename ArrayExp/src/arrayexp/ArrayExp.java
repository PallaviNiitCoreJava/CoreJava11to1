
package arrayexp;

import java.util.Scanner;

public class ArrayExp {

    public static void main(String[] args) {      
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a Number");
            a[i]=sc.nextInt();
        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Element a["+i+"]= "+a[i]);
//        }
        for(int i:a)
        {
            System.out.println("Value is "+i);
        }       
    }   
}
