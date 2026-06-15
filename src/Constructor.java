 import java.lang.String;
class Human {
    private int age;
    private String name;

    // Default Constructor
    public Human() {
        age = 12;
        name = "John";
    }

    // Constructor with Name
    public Human(String name) {
        this.age = 12;
        this.name = name;
    }

    // Parameterized Constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor {
    public static void main(String[] args)  {

        Human obj = new Human();
        Human obj1 = new Human("Rahul");
        Human obj2 = new Human(20, "Sonam");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());
    }
}