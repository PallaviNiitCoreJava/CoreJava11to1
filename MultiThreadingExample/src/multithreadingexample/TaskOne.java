package multithreadingexample;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskOne extends Thread {
    
    @Override 
    public void run()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is Task One Execution No "+i);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }

}
