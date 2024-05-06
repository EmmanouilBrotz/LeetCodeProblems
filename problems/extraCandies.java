import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class extraCandies {
    public static void main(String[] args) {
        int[] kidsCandies = new int[]{2,3,5,1,3}; // each index represents the amount of candies that each kid has
        int extraCandies = 3; // this number represents how many candies we'll be giving each kid
        for (int i = 0; i < kidsCandies.length; i++) {
            System.out.println("Kid #" + (i+1) + ": " + kidsCandies[i]);
        }
        System.out.println("Extra Candies given: " + extraCandies);
        System.out.println("Greatest number of candies for each kid:" + kidsWithCandies(kidsCandies, extraCandies));
    }
    protected static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = Arrays.stream(candies).max().getAsInt(); // get the maximum amount of candies that each kid has before having the extra candies, for comparison
        System.out.println(maxCandies);
        for(int kid: candies){
            if(kid+extraCandies>=maxCandies){ //compare if each kid + the extra candies will have more than the greatest amount of candies
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}
