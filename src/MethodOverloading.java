class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a , int b,int c){
        return a+b+c;

    }
    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Calculator c=new Calculator();
        System.out.println(c.add(1,2,3,4));
        System.out.println(c.add(1,2,3));
        System.out.println(c.add(1,2));

        int r=c.add(455,5555);
        System.out.println(r);

    }
}
