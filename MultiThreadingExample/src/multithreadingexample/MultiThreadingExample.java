package multithreadingexample;

import static java.lang.Thread.sleep;

public class MultiThreadingExample {

    public static void main(String[] args) {

//        TaskOne t1=new TaskOne();
//        TaskTwo t2=new TaskTwo();
//        t1.setPriority(10);
//        t2.setPriority(1);
//        t1.start();
//        t2.start();
//       WorkOne w1=new WorkOne();
//       WorkTwo w2=new WorkTwo();
//       
//       Thread th1=new Thread(w1);
//       Thread th2=new Thread(w2);  
//       Thread th1=new Thread(new WorkOne());
//       Thread th2=new Thread(new WorkTwo()); 
        Thread th1 = new Thread(new Runnable() {

            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("This is Work One Execution No " + i);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {

                    }
                }
            }
        });
        Thread th2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("This is Work Two Execution No " + i);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {

                    }
                }
            }
        });
        th1.start();
        th2.start();

    }

}
