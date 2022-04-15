package intervals;

import java.util.LinkedList;
import java.util.List;

public class insertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new LinkedList<>();

        int i = 0, n = intervals.length;
        while (i < n && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }

        while (i <n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        res.add(newInterval);

        while (i < n){
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][2]);
    }
}
