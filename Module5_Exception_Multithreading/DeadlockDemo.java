class Resource {

    void method1(Resource r) {
        synchronized (this) {

            System.out.println(Thread.currentThread().getName() + " locked Resource 1");

            try { Thread.sleep(100); } catch (Exception e) {}

            synchronized (r) {
                System.out.println(Thread.currentThread().getName() + " locked Resource 2");
            }
        }
    }
}

public class DeadlockDemo {

    public static void main(String[] args) {

        Resource r1 = new Resource();
        Resource r2 = new Resource();
        Thread t1 = new Thread(() -> {
            r1.method1(r2);
        });
        Thread t2 = new Thread(() -> {
            r2.method1(r1);
        });

        t1.start();
        t2.start();
    }
}