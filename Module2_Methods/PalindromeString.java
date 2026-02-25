package Module2_Methods;
import java.util.*;
public class PalindromeString {
    static  Boolean Palindrome(String S){
        int n=S.length();
        for(int i=0;i<n;i++){
                if(S.charAt(i)!=S.charAt(n-i-1)){
                    return false;
                }

            
            

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String S=sc.nextLine();
        System.out.println("It is Plaindrome "+ Palindrome(S));
    }
    
}
