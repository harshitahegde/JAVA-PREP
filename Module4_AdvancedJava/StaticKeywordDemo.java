class Student {

    int rollNo;             
    String name;        
    static String college = "ABC College";   
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    static void changeCollege() {
        college = "XYZ College";
    }
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticKeywordDemo{
    public static void main(String[] args) {

        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(2, "Anita");
        s1.display();
        s2.display();
        Student.changeCollege();

        System.out.println("After changing college:");

        s1.display();
        s2.display();
    }
}