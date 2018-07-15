
package multithreadingexample;

import static java.lang.Thread.sleep;



public class WorkTwo implements Runnable{

    @Override 
    public void run()
    {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is Work Two Execution No "+i);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
    }

}
