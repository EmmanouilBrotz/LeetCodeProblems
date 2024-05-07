import java.util.Scanner;

public class subtractSumFromProduct {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input integer to calculate difference of product and sum of digits: ");
        int number = keyboard.nextInt();
        keyboard.close();
        System.out.println("Difference of product and sum of digits of number "+ number + " is: " + subtractProductAndSum(number));
    }
    protected static int subtractProductAndSum(int n){
        String resultString = String.valueOf(n); //convert to string
        int product = 1;
        int sum = 0;

        for(int i = 0; i < resultString.length(); i++){
            int digit = resultString.charAt(i) - '0'; // Convert character to integer value. we remove '0' cause we're converting from ASCII to int, and we need to remove 0 which is 48
            sum += digit;
            product *= digit;
        }
        return product - sum;
    }
}
