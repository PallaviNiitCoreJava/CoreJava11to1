package bankapplication;

public class Account {

    private int bal = 0;

    void deposite(int b) {
        bal = bal + b;
    }

    void wid(int b) {
        if (b < bal) {
            bal = bal - b;
        } else {
            System.out.println("IB");
        }
    }

    void dispBal() {
        System.out.println("Balance is " + bal);
    }
}
