package december_2024_dailyPOTD;

import java.util.Arrays;

public class Day9_3152 {
    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int count[] = new int[n];
        count[0] = 0;
        for(int i=1;i<n;i++){
            int parity = (nums[i]%2==nums[i-1]%2)?1:0;
            count[i] = count[i-1] + parity;
        }
        int m = queries.length;
        boolean res[] = new boolean[m];
        for(int i=0;i<m;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            res[i] = ((count[end] - count[start]) == 0);
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {4, 3, 1, 6};
        int queries[][] = {{0, 2}, {2, 3}};
        boolean[] result = isArraySpecial(nums, queries); // Get the result array
        System.out.println(Arrays.toString(result)); // Print the array in a readable format
    }
}
