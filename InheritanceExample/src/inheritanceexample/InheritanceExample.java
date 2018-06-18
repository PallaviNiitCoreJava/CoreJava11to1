package inheritanceexample;
public class InheritanceExample {
    public static void main(String[] args) {
//        System.out.println("--------------Object of AudiA4-------------");
//        AudiA4  a4=new AudiA4();
//        a4.run();
//        a4.stop();
        System.out.println("--------------Object of AudiA5-------------");
        AudiA5  a5=new AudiA5();
        a5.eng=76;
        a5.run();
        a5.stop();
        a5.openRoof();
        a5.closeRoof();
    }
    
}
