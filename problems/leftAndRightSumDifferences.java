import java.util.Arrays;


import static java.lang.Math.abs;

public class leftAndRightSumDifferences {
    public static void main(String[] args) {
        int[] numbers = new int[]{10,4,8,3}; // EXPECTED OUTPUT: [15,1,11,22]
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Difference between Left and Right Sum: " + Arrays.toString(leftRightDifference(numbers)));
    }
    protected static int[] leftRightDifference(int[]nums){
        int[] leftSum = new int[nums.length]; // array to keep left sum
        int[] rightSum = new int[nums.length]; // array to keep right sum
        int[] difference = new int[nums.length]; // array to keep difference
        for(int i = 0; i<nums.length;i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += nums[j]; // add number onto the sum until j = i
            }
            leftSum[i] = sum; // add the sum onto the corresponding index
        }
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for (int j = nums.length-1;j>i;j--){
                sum += nums[j]; // same thing as above, except the other way around
            }
            rightSum[i] = sum;
        }
        for(int i = 0; i < nums.length; i++){
            difference[i] = abs(leftSum[i] - rightSum[i]); // adding onto the difference array, in absolute value
        }
        return difference;
    }
}
