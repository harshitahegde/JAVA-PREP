package Module2_Methods;

public class StudentConstructor {
    int n;

    public StudentConstructor() {
         n=9;
    }
    StudentConstructor(int n){
        this.n=n;

    }
    int display(){
     return n;
    }
    public static void main(String[] args) {
      StudentConstructor o1=new StudentConstructor(8);
      System.out.println("enter student number "+ o1.display());
       StudentConstructor o2=new StudentConstructor();
       System.out.println("enter student number "+ o2.display());

    

        
    }
    
}
