package intervals;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0 || intervals.length == 1) return intervals;

        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        ArrayList<int[]> result = new ArrayList<>();
        int[] currInterval = intervals[0];
        result.add(currInterval);

        // current is a separate variable.
        // next is the item being looped
        for (int[] interval: intervals){
            int currStart = currInterval[0];
            int currEnd = currInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (nextStart <= currEnd){
                currInterval[0] = Math.min(currStart, nextStart);
                currInterval[1] = Math.max(currEnd, nextEnd);
            } else {
                result.add(interval);
                currInterval = interval;
            }
        }
        return result.toArray(new int[result.size()][2]);
    }
}
