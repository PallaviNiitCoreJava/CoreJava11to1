package methodoverloadingexp;
public class MethodOverloadingExp {
    public static void main(String[] args) {
//        Calc c=new Calc();
//        
//        int i=Integer.parseInt("12567");
//        double d=56;
//        c.add(12, 12);
//        c.add(12.00, 45.00);
//        c.add(2, 5);
        String str="Pink";
        Car c=new Car("Red");
        c.disp();
        Car c1=new Car(str);
        c1.disp();
        Car c2=new Car();
        c2.disp();
        Car c3=new Car(c);
        c3.disp();
       
    }
    
}
