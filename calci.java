import java.util.Scanner;

public class calci{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int ans = 0;

            while (true) {
                System.out.print("Enter the operator (+, -, *, /, % or 'x' to quit): ");
                char op = in.next().trim().charAt(0);

                // Check for exit condition first
                if (op == 'x' || op == 'X') {
                    break;
                }

                // Use a switch instead of a chain of ifs
                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    System.out.print("Enter two numbers: ");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();

                    switch (op) {
                        case '+' -> ans = num1 + num2;
                        case '-' -> ans = num1 - num2;
                        case '*' -> ans = num1 * num2;
                        case '%' -> ans = num1 % num2;
                        case '/' -> {
                            if (num2 != 0) ans = num1 / num2;
                            else System.out.println("Error: Division by zero.");
                        }
                    }
                    System.out.println("Result: " + ans);
                } else {
                    System.out.println("Invalid operation!!");
                }
            }
        }
    }
}

