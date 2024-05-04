public class goodPairs {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,1,1,1   };
        System.out.println("Number of good pairs: "+ numIdenticalPairs(numbers));
    }
    protected static int numIdenticalPairs(int[] nums) {
        int output = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j] && i<j) { // conditions of a good pair, as stated in the problem
                    output+=1;
                }
            }
        }
        return output;
    }
}
