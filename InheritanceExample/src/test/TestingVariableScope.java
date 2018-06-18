package test;

public class TestingVariableScope{

    public static void main(String[] args) {
        
        Calc c1=new Calc();
        c1.pi=565.56;
        System.out.println(c1.pi);
        Calc c2=new Calc();
        System.out.println(c2.pi);
        Calc.pi=45454.34234;
        System.out.println(Calc.pi);
        System.out.println(c1.pi);
        System.out.println(c2.pi);
    }
}
