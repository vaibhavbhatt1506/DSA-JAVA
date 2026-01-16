public class Fibonacci {
    public static void printFibonacci(int count) {
        int n1 = 0, n2 = 1;
        
        System.out.print("Fibonacci Series (" + count + " numbers): ");

        for (int i = 1; i <= count; ++i) {
            System.out.print(n1 + " ");

            // Calculate the next number
            int nextSum = n1 + n2;
            n1 = n2;
            n2 = nextSum;
        }
    }

    public static void main(String[] args) {
        int n = 9; // Number of elements to print
        printFibonacci(n);
    }
}