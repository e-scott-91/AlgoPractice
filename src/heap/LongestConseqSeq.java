package heap;

import java.util.PriorityQueue;

public class LongestConseqSeq {

    public int longestConsecutive(int[] nums) {
        if(nums.length==0 ) return 0;
        if(nums.length==1 ) return 1;

        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i:nums){
            pq.add(i);
        }
        int count=1,prev=pq.poll(),maxCount=-Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            int t=pq.poll();
            if((t-prev)==1){
                count++;
            }
            else if((t-prev)>1){
                count=1;
            }
            maxCount=Math.max(count,maxCount);
            // System.out.println(t+" "+prev+" "+count+" "+maxCount);
            prev=t;
        }
        return maxCount;
    }
}
