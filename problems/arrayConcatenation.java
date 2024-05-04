import java.util.Arrays;

public class arrayConcatenation {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,1,3}; // sample array
        System.out.println(Arrays.toString(getConcatenation(numbers)));
    }
    protected static int[] getConcatenation(int[] nums){
        int[] result = new int[nums.length*2];
        for(int i=0; i<nums.length; i++){
            result[i] = nums[i]; // this will fill out the first half of the array
            result[i+nums.length] = nums[i]; // this will fill out the second half of the array
        }
        return result;
    }
}
