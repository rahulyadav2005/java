class mobile {
    String Brand;
    int price;
    static String Name;


    void Show()

    {
        System.out.println(Brand + " : "+price + " : "+ Name);


    }
    public static void Show1(mobile obj){
        System.out.println(obj.Brand + " : "+ obj.price + " : "+ Name);


    }


}

public class StaticMethod {
    public static void main(String[] args) {
        mobile.Name="phone";
        mobile obj1=new mobile();
        obj1.Brand="Apple";
        obj1.price=1590;
        obj1.Name="Smart Phone";



        mobile obj2=new mobile();
        obj2.Brand="Sumsang";
        obj2.price=1500;
        obj2.Name="Phone";


        obj1.Show();
        obj2.Show();
        mobile.Show1(obj1);

    }
}
