package methodoverloadingexp;

public class Calc {

    public void add(int i,int j)
    {
        System.out.println("Ans is "+(i+j));
    }
    public void add(int i,double j)
    {
        System.out.println("Ans is "+(i+j));
    }
    public void add(double i,int j)
    {
        System.out.println("Ans is "+(i+j));
    }
    public void add(double i,double j)
    {
        System.out.println("Ans is "+(i+j));
    }

    public void add(int i,int j,int k)
    {
        System.out.println("Ans is "+(i+j+k));
    }
    public double add(Double i,int j,int k)
    {
        return i+j+k;
    }
}
