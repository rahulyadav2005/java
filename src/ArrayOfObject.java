public class ArrayOfObject {
    public static void main(String[] args) {
        class Student{
            int rollno;
            String name;
            int marks;
        }
        Student s1=new Student();

        s1.rollno=1;
        s1.name="David";
        s1.marks=92;
        Student s2=new Student();
        s2.rollno=2;
        s2.name="Rahul";
        s2.marks=93;
        Student s3=new Student();
        s3.rollno=3;
        s3.name="suman";
        s3.marks=92;

        Student Students[]=new Student[3];
        Students[0]=s1;
        Students[1]=s2;
        Students[2]=s3;

        for (int i=0;i<Students.length;i++){
            System.out.println(Students[i].rollno+" "+Students[i].name+" "+Students[i].marks);
        }
    }
}
