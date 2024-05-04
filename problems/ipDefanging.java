import java.util.Scanner;

public class ipDefanging {
    public static void main(String[] args) {
        System.out.println("Input IP Address to be defanged (x.x.x.x): ");
        Scanner keyboard = new Scanner(System.in);
        String ip = keyboard.nextLine();
        keyboard.close();
        System.out.println("IP Address: " + defangIPaddr(ip));
    }
    public static String defangIPaddr(String ip) {
        return ip.replace(".","[.]");
    }
}
