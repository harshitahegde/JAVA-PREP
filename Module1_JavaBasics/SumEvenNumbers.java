package Module1_JavaBasics;

public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        while( i<101 && i>0){
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println(""+sum);
        
    }
    
}
