package december_2024_dailyPOTD;

public interface Day26_494 {
    public static int find(int[] arr, int target, int i, int currSum, String path){
        if(i == arr.length){
            if(target == currSum){
                System.out.println(path);
                return 1;
            }else{
                return 0;
            }
        }
        int plusPart = find(arr,target,i+1,currSum+arr[i], path + "+" +arr[i]);
        int minusPart = find(arr, target,i+1,currSum-arr[i], path + "-"+arr[i]);
        return plusPart + minusPart;
    }
    public static int findTargetSumWays(int[] nums, int target) {
        return find(nums, target, 0,0,"");
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(findTargetSumWays(nums, target));
    }
}
