import java.util.Arrays;
import java.util.Scanner;

public class temperatureConversion {
    public static void main(String[] args) {
        System.out.println("Please input temperature for conversion to Fahrenheit and Kelvin.");
        Scanner sc = new Scanner(System.in);
        double temp = Double.parseDouble(sc.nextLine());
        System.out.println(Arrays.toString(convertTemperature(temp)));

    }
    protected static double[] convertTemperature(double celsius){
        return new double[] {celsius + 273.15, (celsius * 1.80) + 32.00}; // f = c * 1.8 + 32, k = c + 273.15
    }
}
