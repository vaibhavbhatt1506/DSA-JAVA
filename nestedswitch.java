
import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // 1. Changed to int because your cases are numbers (1, 2, 3)
        int empID = in.nextInt(); 
        String department = in.next(); // 2. 'String' must be capitalized

        // 3. 'switch' must be lowercase
        switch (empID) {
            case 1 -> System.out.println("vaibhav bhatt");
            case 2 -> System.out.println("rahul mukho");
            case 3 -> {
                System.out.println("emp no 3");
                switch (department) {
                    // 4. Fixed typo 'Sytesm' -> 'System'
                    case "IT" -> System.out.println("information tech department");
                    // 5. Fixed typo 'ase' -> 'case'
                    case "management" -> System.out.println("management");
                    default -> System.out.println("no department entered");
                }
            }
            // 6. Fixed typo 'Sytem' and missing dot
            default -> System.out.println("Enter correct Employee ID");
        }
    }
}