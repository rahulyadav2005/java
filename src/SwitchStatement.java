import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("enter the day no (1-7)");
        Scanner sc=new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("wednesday");
                break;

            case 5:
                System.out.println("other days");
                break;

            default :
                System.out.println("you choose wrong selection ");

        }

    }
}
