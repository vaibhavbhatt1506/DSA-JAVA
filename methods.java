import java.util.Scanner;


public class methods {

    public static void main(String[] args){
        sum();

    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a number:");
        int num1 = in.nextInt();
        System.out.print("enter the second number:");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        System.out.println("the sum of two digits is=" + sum);
    }
}


    
