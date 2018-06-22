package innerclassexample;
public class InnerClassExample {
    public static void main(String[] args) {
        
//        Car c1=new Car();
//        Car.Engin e1=c1.new Engin();
        
        Dad d1=new Dad() {

            @Override
            public void holiday() {
        
            }
        };
        
        Dad d2=new Dad() {

            @Override
            public void holiday() {
        
            }
        };
        
    }
    
}
