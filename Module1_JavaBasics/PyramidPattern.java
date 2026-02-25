package Module1_JavaBasics;
import java.util.*;

public class PyramidPattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and coloumns");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=i;s<n;s++){
                System.out.print(" ");

            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
