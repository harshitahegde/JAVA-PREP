
class MyThread extends Thread {

    public void run() {
        System.out.println("Thread created using Thread class.");
    }
}

public class Thread_vs_Runnable {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();   
    }
}