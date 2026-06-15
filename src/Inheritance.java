
public class Inheritance {
    public static void main(String[] args) {

        Calc c1=new Calc();
        System.out.println(c1.add(1,2,3));


        AdvCalc c2=new AdvCalc();
        int r1= c2.add(4,5,6);
        int r2=c2.sub(90,66);
        int r3=c2.mul(137,96);
        int r4 = c2.div(137,96);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);



    }
}
