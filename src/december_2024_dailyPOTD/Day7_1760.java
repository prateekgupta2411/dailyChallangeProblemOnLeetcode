package december_2024_dailyPOTD;

public class Day7_1760 {
    public static int minimumSize(int[] nums, int maxOperations) {
        int start = 1;
        int end = 0;
        for(int num : nums){
            end = Math.max(num,end);
        }
        int res = 0;
        while(start <= end){
            int mid = start +(end-start)/2;
            if(isPossible(nums,mid,maxOperations)){
                res = mid;
                end = mid-1;
            } else{
                start = mid + 1;
            }
        }
        return res;
    }
    public static boolean isPossible(int nums[], int maxBallsAllowed, int maxOperations){
        int operations  = 0;
        for(int num : nums){
            if(num > maxBallsAllowed){
                int bags = (int)Math.ceil(num / (double)maxBallsAllowed);
                operations += bags-1;
            }
            if(operations > maxOperations){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int []nums = {8,3,5}; int  maxOperations = 3;
        System.out.println(minimumSize(nums,maxOperations));
    }
}
