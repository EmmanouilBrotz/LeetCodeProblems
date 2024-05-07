import java.util.Arrays;

public class howManyNumbersAreSmallerThanCurrentNumber {
    // Love the name I gave this class.
    public static void main(String[] args) {
        int[] arr = new int[]{8,1,2,2,3}; // EXPECTED OUTPUT: [4,0,1,1,3]
        System.out.println("Input array: " + Arrays.toString(arr));
        System.out.println("How many numbers are smaller than the current number, per number: " + Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    protected static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length]; // making result array the length of the original array
        for(int i = 0; i < nums.length; i++){
            int count = 0; // initializing a count, should reset with every new number in the array
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j] && i != j){ // as long as the first number is bigger than the second, and we're not talking about the same index, count up
                    count++;
                }
            }
            result[i] = count; // place the count into the array to reset it for the next number
        }
        return result;
    }
}
