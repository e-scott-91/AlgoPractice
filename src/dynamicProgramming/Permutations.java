package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0 || nums == null) return result;

        dfs(new ArrayList<Integer>(), result, nums, new boolean[nums.length]);
        return result;
    }

    private static void dfs(ArrayList<Integer> path, List<List<Integer>> result,
                            int[] nums, boolean[] visited) {
        if (path.size() == nums.length) {
            result.add(path);
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            path.add(nums[i]);
            visited[i] = true;
            dfs(path, result, nums, visited);
            path.remove(path.size() -1);
            visited[i] = false;
        }

    }
}
