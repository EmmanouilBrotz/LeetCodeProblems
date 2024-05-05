import java.util.Scanner;

public class smallestEvenMultipleNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = keyboard.nextInt();
        System.out.println("Smallest Even Multiple: " + smallestEvenMultiple(number));

    }
    protected static int smallestEvenMultiple(int n) {
        while(true){ // keep going until we find the number
            if(n%2==0){ // if it is divisible by 2 perfectly, n is the smallest even multiple
                return n;
            }
            else{ // if not, multiplying by 2 might give us the right answer
            n = n*2;
            }
        }
    }
}
