package exceptionexample;

import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDefinedImpl {

    public static void main(String[] args) {

        UserDefinedException ud = new UserDefinedException();
        ud.setAge(67);
        try {
            ud.vote();
        } catch (Exception ex) {
        }
    }
}
