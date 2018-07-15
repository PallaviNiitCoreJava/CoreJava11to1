package enumwitharray;

import java.util.ArrayList;

public class EnumWithArray {

    enum Season {

        WINTER(5, new Emp("Jan")), SPRING(10, new Emp("Feb")), SUMMER(15, new Emp("Mar")), FALL(20, new Emp("April"));

        private int value;
        private Emp e;

        private Season(int value, Emp e) {
            this.value = value;
            this.e = e;
        }
    }

    enum Discount {
        Winter(10,"RainCoat"), Summer(20,"Sweater"), Rainy(30,"Hats");
    
        private int val;
        private String type;
        Discount(int x, String t)
        {
            this.val=x;
            this.type=t;
        }
    };

    public static void main(String[] args) {

//        for (Season s : Season.values()) {
//            System.out.println(s + " " + s.value);
//            System.out.println(s + " " + s.e.name);
//        }
        Discount d[] = Discount.values();
        for (Discount t : d) {
            System.out.println(t.val);
            System.out.println(t.type);
        }

//        ArrayList<String> names=new ArrayList<>();
//        names.add("Pallavi");
//        names.add("Poonam");
//        names.add("Pooja");
//        names.add("Parvati");
//        names.add("Pavan");
//        names.add("Pankaj");
//        
//        for(String s:names)
//        {
//            System.out.println(s);
//        }
        
                
    }

}
