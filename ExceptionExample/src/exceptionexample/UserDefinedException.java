package exceptionexample;

public class UserDefinedException {
    private int age;
    

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    void vote() throws Exception
    {
        if(getAge()<18)
        {
            throw new Exception();
        }
        else
        {
            System.out.println("Executing Voting Application...... ");
        }
    }
    
    
}
