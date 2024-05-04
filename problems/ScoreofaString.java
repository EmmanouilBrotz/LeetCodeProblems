import java.util.Scanner;
import static java.lang.Math.abs;

public class ScoreofaString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input String: ");
        String answer = keyboard.next();
        System.out.print("ASCII Value: ");
        System.out.print(scoreOfString(answer));
    }
    static int scoreOfString(String s){
        int sum = 0;
        String[] input = s.split(""); // split string into array of chars
        for(int i = 0; i < input.length - 1; i++){ //calculate ASCII value
            sum = sum + abs((int) input[i].charAt(0) - (int) input[i + 1].charAt(0));

        }
        return sum;
    }
}