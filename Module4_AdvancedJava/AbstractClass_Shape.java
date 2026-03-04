abstract class Human {
    void eat() {
        System.out.println("Eating food");
    }

    abstract void work(); 
}

class Doctor extends Human {
    void work() {
        System.out.println("Doctor treats patients");
    }
}

class Teacher extends Human {
    void work() {
        System.out.println("Teacher teaches students");
    }
}

public class Main {
    public static void main(String[] args) {
        Human h1 = new Doctor();
        Human h2 = new Teacher();

        h1.eat();
        h1.work();

        h2.eat();
        h2.work();
    }
}