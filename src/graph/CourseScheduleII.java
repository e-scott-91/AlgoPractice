package graph;

import java.util.ArrayList;
import java.util.List;


public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<Integer>[] adj = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] elem: prerequisites) {
            adj[elem[0]].add(elem[1]);
        }

        ArrayList<Integer> topoSort = new ArrayList<>();
        int[] status = new int[numCourses];

        for(int i = 0; i < numCourses; i++) {
            if(isCyclic(topoSort, status, adj, i)) {
                return new int[0];
            }
        }



        return topoSort.stream().mapToInt(i -> i).toArray();


    }

    // 0 means that vertex has not been visited yet, (-1) means that vertex is still being processed, 1 means that  vertex has already been processed.
    private boolean isCyclic(ArrayList<Integer> topoSort, int[] status, List<Integer>[] adj, int vertex) {
        if(status[vertex] == -1) {
            return true;
        }

        if(status[vertex] == 1) {
            return false;
        }

        status[vertex] = -1;

        for(int neighbor: adj[vertex]) {
            if(isCyclic(topoSort, status, adj, neighbor)) {
                return true;
            }
        }

        status[vertex] = 1;
        topoSort.add(vertex);

        return false;
    }
}
