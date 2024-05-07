import java.util.Arrays;

public class runningSumOf1dArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.println("Running Sum: " + Arrays.toString(runningSum(arr)));
    }
    protected static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length]; // initializing the result array
        int sum = 0; // will be used to keep the sum of the array's numbers
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i]; // add on to the sum
            result[i] = sum; // add the sum to result array
        }
        return result;
    }
}
