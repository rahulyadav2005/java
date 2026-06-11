public class DoWhile {
    public static void main(String[] args) {
        System.out.println("=================================Do While Loop==========================================");
        int day=1;
        do
        {System.out.println("=================================Day   "+day+"   ============================================");
            int hours=0;
            do{
                System.out.println(("Hours "+hours));
                hours++;
            }while(hours<=24);
            day++;
        }while (day<=7);
    }
}
