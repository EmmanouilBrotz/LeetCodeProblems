import java.util.Scanner;
public class numberSum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number1 = keyboard.nextInt();
        System.out.print("Enter an integer: ");
        int number2 = keyboard.nextInt();
        System.out.println("Sum: " + sum(number1,number2));
    }
    protected static int sum(int num1, int num2) {
        return num1 + num2; // you simply add them.
    }
}

// why does this exist as a problem in leetcode
