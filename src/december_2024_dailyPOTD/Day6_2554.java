package december_2024_dailyPOTD;
import java.util.*;
public class Day6_2554 {
    public static int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set = new HashSet<>();
        for (int ban : banned) {
            set.add(ban);
        }
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) continue;
            sum += i;
            if (sum > maxSum) break;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int banned[] = {1,6,5};
        int n = 5;
        int maxSum = 6;
        System.out.println(maxCount(banned,n,maxSum));
    }
}
