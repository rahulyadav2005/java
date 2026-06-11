
class calculator{
    public int add(int a,int b){

        return a+b;
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        calculator calc=new calculator();//object
        int r= calc.add(2,4);
        System.out.println(r);

    }

}
