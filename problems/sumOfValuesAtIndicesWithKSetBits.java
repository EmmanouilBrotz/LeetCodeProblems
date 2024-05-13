import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;

public class sumOfValuesAtIndicesWithKSetBits {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Welcome to the program. You will now begin inserting integers. If you input a String at any point, the program will stop input and continue.");
        Scanner keyboard = new Scanner(System.in);
        for(int i=0;;i++){ // this loop allows me to enter as many numbers as i want in the arraylist, allowing for different experiments
            System.out.print("Enter number #"+(i+1)+": ");
            if(keyboard.hasNextInt()){
                numbers.add(keyboard.nextInt());
            }
            else{ // once i input something that is not an integer, exit the loop
                break;
            }
        }
        System.out.println("Set number of set bits: "); // this is how many 1's we want the index binary number to have if we want to take the index's number into the sum
        Scanner s = new Scanner(System.in);
        int bits = s.nextInt();
        System.out.println("Sum of elements in numbers whose indices have " + bits + " bits: " + sumIndicesWithKSetBits(numbers, bits));
    }
    protected static int sumIndicesWithKSetBits(List<Integer> nums, int k){
        int sum = 0;
        for(int i =0;i<nums.size();i++){
            String binary = Integer.toBinaryString(i); // convert index into binary
            String[] splitBinary = binary.split(""); // split the binary into a String[] array
            int count = 0;
            for(int j = 0; j< splitBinary.length;j++){
                if(splitBinary[j].equals("1")){ // take each different number in the binary, and see if it's =1, so we keep a count of them
                    count++;
                }
            }
            if(count == k){ // match count with number of 1s we want
                sum = sum + nums.get(i);
            }
        }
        return sum;
    }
}
