import java.util.Arrays;

public class arrayShuffling {
    public static void main(String[] args) {
        int[] numbers = new int[]{2,5,1,3,4,7}; // EXPECTED OUTPUT: 2,3,5,4,1,7
        int n = 3;
        System.out.println("Before shuffling: " + Arrays.toString(numbers));
        System.out.println("After shuffling: " + Arrays.toString(shuffle(numbers,n)));
    }
    protected static int[] shuffle(int[] nums, int n) {
       int[] result = new int[n*2]; // n always represents half the size of the array
       for(int i = 0, j = 0; i < n; i++){
            result[j++] = nums[i]; // j++ represents a change of position every time.
            result[j++] = nums[i+n]; //alternating between first half and second half of the array with i, i+n
       }
        return result;


    }
}
