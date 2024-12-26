package december_2024_dailyPOTD;

import java.util.HashMap;

public class Day26_494_using_Memorisation {
    public static int solve(int[] nums, int i, int currSum, int target, HashMap<String, Integer> memo ){
        if(i == nums.length){
            return (currSum == target)? 1 : 0;
        }
        // create a unique key for this subproblem
        String key = i + ","+currSum;
        // if result already computed, return it
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        int plus = solve(nums, i+1,currSum + nums[i],target,memo);
        int minus = solve(nums, i+1,currSum - nums[i],target, memo);
        // store result in memo and return
        memo.put(key,plus+minus);
        return plus+minus;

    }
    public static int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> memo = new HashMap<>();
        return solve(nums,0,0,target,memo);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(findTargetSumWays(nums, target));
    }
}
