package Module1_JavaBasics;
import java.util.*;

public class PositiveNegativeZero {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a");
        int a =sc.nextInt();
        if(a==0){
            System.out.println(a +"is zero");
        }
        else{
            if(a>0){
                System.out.println(a +"is positive");
            }else{
                System.out.println(a +"is negative");
            }
        }
        sc.close();

    }
    
}
