package Tools;
import Tools.Brand;
import Tools.Engine;



public class Car {
    public static void main(String[] args) {
        System.out.println("this is car class");
        Brand b=new Brand();
        Engine E=new Engine();
        int e=E.year(2025);
       String s= b.CarName("Scarpio","s11");

        System.out.println(s+" "+e);
    }
}
