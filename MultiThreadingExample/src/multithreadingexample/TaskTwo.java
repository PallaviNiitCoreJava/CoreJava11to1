package multithreadingexample;

public class TaskTwo extends Thread{

    
    @Override 
    public void run()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is Task Two Execution No "+i);
            
        }
    }

}
