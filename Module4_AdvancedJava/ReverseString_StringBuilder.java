public class ReverseString_StringBuilder {
    public static void main(String[] args) {

        String original = "Hello World";
        StringBuilder sb = new StringBuilder(original);
        sb.reverse();

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + sb);
    }
}