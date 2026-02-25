package Module2_Methods;
import java.util.*;

public class FactorialRecursion {
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n<0){
        System.out.println("invalid number");
        }
        else{
            System.out.println("Factorial of a number is"+ fact(n) );
        }
      
        }
    }

    

