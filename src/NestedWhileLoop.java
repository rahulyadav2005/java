public class NestedWhileLoop {
    public static void main(String[] args) {
        int day=1;
        while (day<=7)
        {System.out.println("=================================Day   "+day+"   ============================================");
            int hours=0;
            while(hours<=24){
                System.out.println(("Hours "+hours));
                hours++;
            }
            day++;
        }
    }
}
