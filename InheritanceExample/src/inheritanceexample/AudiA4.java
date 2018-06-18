package inheritanceexample;

public class AudiA4 {
    
    protected int eng;
    private int door;
    private String color;
    
    public AudiA4()
    {
        System.out.println("This is A4 Constructor.");
       eng=6;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public void run()
    {
        System.out.println("This is A4 run Method.");
        eng=45;
    }
    public void stop()
    {
        System.out.println("This is A4 stop Method.");
    }
}
