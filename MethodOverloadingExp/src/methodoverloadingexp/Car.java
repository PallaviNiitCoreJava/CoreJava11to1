package methodoverloadingexp;

public class Car {

    private int d;
    private int e;
    private String col;
    
    public Car()
    {
        System.out.println("Simple Constructor Executed");
        d=4;
        e=1;
        col="White";
    }
    public Car(String t)
    {
        System.out.println("Parameterized Constructor Executed");
        d=4;
        e=1;
        col=t;
    }
    public Car(int t)
    {
        System.out.println("Parameterized Constructor Executed");
        d=t;
        e=1;
        col="Red";
    }
    public Car(Car o)
    {
        System.out.println("Copy Constructor Executed");
        d=o.d;
        e=o.e;
        col=o.col;        
    }   
    public void disp()
    {
        System.out.println("Door "+d);
        System.out.println("Eng "+e);
        System.out.println("Color "+col);
    }
    
}
