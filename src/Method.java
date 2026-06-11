
class Computer{
    public void music(){
        System.out.println("music is playing ");

    }

    public String Getpen(int n){
        if(n>10){
            return "Pen";

        }
        else{
            return "Nothing";
        }
    }
}
public class Method {
    public static void main(String[] args) {

        Computer com=new Computer();
        com.music();
        System.out.println(com.Getpen(4));


    }
}
