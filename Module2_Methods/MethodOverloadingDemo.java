package Module2_Methods;

public class MethodOverloadingDemo {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }

     public static void main(String[] args) {
       System.out.println(" " +add(3,4));
        System.out.println(""+add(1,2,3));
        
    
  
    }
    
}
