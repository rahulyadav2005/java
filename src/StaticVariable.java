class Mobile {
    String Brand;
    int price;
     static String Name;


    void Show()

    {
        System.out.println(Brand + " : "+price + " : "+ Name);


    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile.Name="phone";
        Mobile obj1=new Mobile();
        obj1.Brand="Apple";
        obj1.price=1590;
        obj1.Name="Smart Phone";



        Mobile obj2=new Mobile();
        obj2.Brand="Sumsang";
        obj2.price=1500;
        obj2.Name="Phone";


   obj1.Show();
   obj2.Show();

    }
}
