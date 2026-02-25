package Module3_Oops;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
    void display() {
        System.out.println(" Calculator");
    }
}
class AdvCalculator extends Calculator {
    @Override
    void display() {
        System.out.println("Adv Calculator");
    }
}
public class OverloadingVsOverriding {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(5, 10));
        System.out.println("Sum of 3 numbers: " + calc.add(5, 10, 15));
        Calculator advCalc = new AdvCalculator();
        advCalc.display();  
    }
  
}

