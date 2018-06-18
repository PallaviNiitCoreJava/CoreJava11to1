package inheritanceexample;

public class AudiA5 extends AudiA4{
      
    
    public AudiA5()
    {
        System.out.println("This is A5 Constructor.");
        eng=9;
    }

    public int getEng()
    {
        return eng;
        
    }
   public void run()
   {
       super.run();
       System.out.println("This is new A5 run Method.");
   }
    public void openRoof()
    {
        System.out.println("This is A4 open roof Method.");
    }
    
    public void closeRoof()
    {
        System.out.println("This is A4 close roof Method.");        
    }
    
}
