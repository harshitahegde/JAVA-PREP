package Module1_JavaBasics;
import java.util.*;

public class LargestOfThree {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first digit");
        int a=sc.nextInt();
        System.out.println("enter second digit");
        int b=sc.nextInt();
        System.out.println("enter third digit");
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }
        else{
            if(b>c){
                System.out.println("b is largest");
            }
            else{
                System.out.println("c is largest");
            }
        }

    }
}
