import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// I decided to do a bit more for this problem since the problem requires we provide a List<Integer>
public class pairsSumLessThanTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner for input
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=0;;i++){ // this loop allows me to enter as many numbers as i want in the arraylist, allowing for different experiments
            System.out.print("Enter number #"+i+": ");
            if(sc.hasNextInt()){
                numbers.add(sc.nextInt());
            }
            else{ // once i input something that is not an integer, exit the loop
                break;
            }
        }
        System.out.println("Array: "+ numbers);
        System.out.print("Target: ");
        Scanner targetscan = new Scanner(System.in); // using a different scanner cause i couldn't use the same one
        int target = targetscan.nextInt();
        targetscan.close();
        System.out.println("Pairs of indices whose sum is less than target: " + countPairs(numbers, target));
    }
    protected static int countPairs(List<Integer> nums, int target){
        int count = 0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.size();j++){
                if(nums.get(i) + nums.get(j) < target && j > i){ // the pair of numbers less than sum, and the 2nd index to be greater than the 1st index is the condition
                    count++;
                }
            }
        }
        return count;
    }
}
