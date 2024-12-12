package december_2024_dailyPOTD;
import java.util.*;
public class Day8_2054 {
    public static int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        int maxVal = 0, ans = 0;

        for (int[] event : events) {
            int start = event[0], end = event[1], value = event[2];

            while (!pq.isEmpty() && pq.peek()[0] < start) {
                maxVal = Math.max(maxVal, pq.poll()[1]);
            }

            ans = Math.max(ans, maxVal + value);
            pq.add(new int[]{end, value});
        }

        return ans;
    }
    public static void main(String[] args) {
        int events[][] = {{1,3,2},{4,5,2},{2,4,3}};
        System.out.println(maxTwoEvents(events));
    }
}
