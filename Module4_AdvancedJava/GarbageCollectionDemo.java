class GarbageDemo {
    protected void finalize() {
        System.out.println("Garbage Collector called for object");
    }

    public static void GarbageCollectionDemo(String[] args) {

        GarbageDemo obj1 = new GarbageDemo();
        GarbageDemo obj2 = new GarbageDemo();
        obj1 = null;
        obj2 = null;
        System.gc();

        System.out.println("End of main method");
    }
}