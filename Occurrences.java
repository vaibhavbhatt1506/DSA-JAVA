public class Occurrences {
    public static void main(String[] args) {
        int n = 1535555555; // The input number
        int count = 0; // To store the number of 5s found

        while (n > 0) {
            int rem = n % 10; // Get the last digit
            if (rem == 5) {
                count++;      // Increment if the digit is 5
            }
            n = n / 10;       // Remove the last digit
        }
        System.out.println(count);
    }
}