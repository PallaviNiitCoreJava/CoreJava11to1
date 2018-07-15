package typecastingexample;
public class TypeCastingExample {
    public static void main(String[] args) {

//        int a=(int)45.00;
//        double d=(double)45;
//        System.out.println(a);
//        int n=Integer.parseInt("45");       //Type Conversion
        
        Dad d=new Son();
        System.out.println(d.getClass().getName());
        //Son s=(Son)new Dad();               //Wrong Type Casting
        Son s1=(Son)d;
    }
    
}
