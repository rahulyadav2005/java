class Laptop{
    String Modle;
    int price;
    public String toString(){
        return Modle+"  :   "+price;

    }
}


public class Object_Class {
    public static void main(String[] args)  {
        Laptop lap=new Laptop();

         lap.Modle="dell 1590";
//        lap.wait(100);
        lap.price=1800000;
        System.out.println(lap);
        Laptop lap1=new Laptop();
        lap1.Modle="dell 1590";
//        lap.wait(100);
        lap1.price=1800000;

        System.out.println( lap.equals(lap1));


    }
}
