package heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequency {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i< nums.length; i++){
            int curVal = map.getOrDefault(nums[i], 0);
            map.put(nums[i], curVal + 1);
        }


        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (int key : map.keySet()){
            pq.add(key);
        }

        int[] result = new int[k];

        for (int i = 0; i< k; i++){
            result[i] = pq.remove();
        }

        return result;
    }
}
