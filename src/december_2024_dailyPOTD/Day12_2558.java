package december_2024_dailyPOTD;
import java.util.*;
public class Day12_2558 {
    // brute force
//        public static long pickGifts(int[] gifts, int k) { // TC - O(k*n)+n
//            for (int i = 0; i < k; i++) { // k
//                int maxIndex = 0;
//                for (int j = 1; j < gifts.length; j++) { // n
//                    if (gifts[j] > gifts[maxIndex]) {
//                        maxIndex = j;
//                    }
//                }
//                gifts[maxIndex] = (int) Math.floor(Math.sqrt(gifts[maxIndex]));
//            }
//            long totalGifts = 0;
//            for (int gift : gifts) {//n
//                totalGifts += gift;
//            }
//
//            return totalGifts;
//        }
    public static long pickGifts(int[] gifts, int k) { // O(N) + k.2logN
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        long sum = 0l;
        for(int gift : gifts){
            sum +=gift;
            pq.offer(gift);
        }
        for(int i=0;i<k;i++){
            if(pq.isEmpty()) break;
            int largest = pq.poll();
            int sq = (int)Math.sqrt(largest);
            sum -= (largest - sq);
            pq.offer(sq);
        }
        return sum;
    }
    public static void main(String[] args) {
        int gifts[] = {25,64,9,4,100};
        int  k = 4;
        System.out.println(pickGifts(gifts,k));
    }
}
