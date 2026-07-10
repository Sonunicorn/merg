public class f2 {
    public static void main(String[] args) {
        //write a code to find fibonacci series up to n terms
        int n = 10; // number of terms
        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}