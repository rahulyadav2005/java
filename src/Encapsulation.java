
  class human {
      private int age = 40;
      private String Name = "Shyam";

      public int getAge() {
          return age;
      }

      public void setAge(int age) {
          this.age = age;
      }

      public String getName() {
          return Name;
      }

      public void setName(String name) {
          this.Name = name; 
      }
  }

public class Encapsulation {
    public static void main(String[] args) {
        human obj= new human();
        obj.setName("Rahul");
       obj.setAge(21);
//        System.out.println(obj);
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
