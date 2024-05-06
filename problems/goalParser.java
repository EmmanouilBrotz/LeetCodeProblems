import java.util.Scanner;

public class goalParser {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input command: ");
        String command = keyboard.nextLine();
        keyboard.close();
        System.out.println("Output command: " + interpret(command));
    }
    protected static String interpret(String command) {
        if (!command.contains("G") || !command.contains("()") || !command.contains("(al)")) { // !command = NOT command, so if the command doesn't have the substrings, return error message
            return "Error: Input does not contain required substrings";
        }

        String result = command; // store it in result, so we can replace the commands with the proper output
        result = result.replace("()", "o");
        result = result.replace("(al)", "al");
        return result;
    }

}
