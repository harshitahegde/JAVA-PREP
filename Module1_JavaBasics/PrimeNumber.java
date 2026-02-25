package Module1_JavaBasics;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        int count=0;
        if(a<=1){
            System.out.println(a+ "is not a prime");
        }
        for(int i=2;i<a;i++){
            if((a%i)==0){
                System.out.println(a + " is not prime number");
                count++;  
                break;
            }

        }
        if(count==0){
        System.out.println(a + "is a prime number");}
        

    }
    
}
