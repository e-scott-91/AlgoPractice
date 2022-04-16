package graph;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {

    List<List<Integer>> adjList;
    int[] visited;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //initialize adjList ans visited array
        adjList = new ArrayList<>();
        visited = new int[numCourses];

        //build a graph
        buildGraph(numCourses, prerequisites);

        //iterate through each vertex
        for(int i=0; i<numCourses; i++){
            if(visited[i] == 0) //check if its already been processed or not
                if(isCycle(i)) //check, is there any cycle that includes this index??
                    return false; //if yes, then we found cycle,hence can't complete each course
        }
        return true; //we went through all vertices, did not find any cycle hece we can complete the course. i.e no two courses are dependent on each other.(DEADLOCk)
    }

    private void buildGraph(int vertices, int[][] edges){
        //initialize empty list for every vertex
        for(int i=0; i<vertices; i++)
            adjList.add(new ArrayList<>());

        //establish the edges between the vertices
        for(int i=0; i<edges.length; i++)
            adjList.get(edges[i][0]).add(edges[i][1]);
    }

    private boolean isCycle(int vertex){
        if(visited[vertex] == 2) //we visited this vertex agaain, hence found cycle.
            return true;
        visited[vertex] = 2; //set this as, processing vertex.
        for(int neighbourVertex : adjList.get(vertex)){ // check for its each neighbourVertexs
            if(visited[neighbourVertex] != 1) //check if neighbourVertex is already processed or not.
                if(isCycle(neighbourVertex))
                    return true; //we found cycle in one of the neighbourVertex.
        }
        visited[vertex] = 1; //did not find any cycle, hence mark it as done and return false.
        return false;
    }
}
