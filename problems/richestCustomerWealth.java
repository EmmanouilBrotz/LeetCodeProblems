import java.util.Arrays;

public class richestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{{1,5},{7,3},{3,5}};
        System.out.println(Arrays.deepToString(accounts));
        System.out.println("Maximum wealth: " + maximumWealth(accounts));

    }
    protected static int maximumWealth(int[][] accounts){
        int maximumWealth = 0;
        for(int[] account: accounts){ // running a loop for each account
            int tempWealth = 0; // keeping the wealth of an account temporarily for comparison with max wealth
            for(int j = 0; j < account.length; j++){ // running a loop to calculate the wealth of each account
                tempWealth += account[j];
            }
            if(tempWealth > maximumWealth){ // if the temporary wealth held is bigger than the maximum wealth, overwrite
                maximumWealth = tempWealth;
            }
        }
        return maximumWealth;
    }
}
