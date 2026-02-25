package Module1_JavaBasics;
import java.util.*;

public class StudentGrade {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student marks");
        int M=sc.nextInt();
        switch(M/10){
            case 10:
                case 9:{
                   System.out.println("A");
                   break;
                
        }
        case 8:{
            System.out.println("B");
            break;
        }
        case 7:{
            System.out.println("C");
            break;
        }
        case 6:{
            System.out.println("D");
            break;
        }
        default:{
            System.out.println("F");
            break;
        }
        }

   
    }
    
}
