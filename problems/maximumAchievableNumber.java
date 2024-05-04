import java.util.Scanner;

public class maximumAchievableNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = keyboard.nextInt();
        System.out.println("Enter the maximum amount of iterations (t): ");
        int t = keyboard.nextInt();
        System.out.println("Maximum Achievable number: " + theMaximumAchievableXtheEasyWay(number, t));
        theMaximumAchievableX(number, t);
    }
    public static void theMaximumAchievableX(int num, int t){
        int x = num + 2*t;
        for(int i = 1; i <= t; i++){
            num = num + 1;
            x = x - 1;
        }
        System.out.print(num+", ");
        System.out.print(x);
    }
    public static int theMaximumAchievableXtheEasyWay(int num, int t){
        return num + 2*t;
    }

}
