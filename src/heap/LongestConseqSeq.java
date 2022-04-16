package heap;

import java.util.PriorityQueue;

public class LongestConseqSeq {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 ) return 0;
        if (nums.length == 1 ) return 1;

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i:nums) {
            queue.add(i);
        }


        int count=1;
        int prev = queue.poll();
        int maxCount= -Integer.MIN_VALUE;

        while(!queue.isEmpty()){
            int next = queue.poll();

            if((next - prev) == 1) {
                count++;
            }
            // checks if definitely "bigger" than rather than just same
            else if((next - prev ) > 1) {
                count = 1;
            }
            maxCount = Math.max(count,maxCount);

            prev = next;
        }
        return maxCount;
    }
}
