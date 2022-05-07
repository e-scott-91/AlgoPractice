package graph;

public class RedundantConnection {
    int[] parent;

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        parent = new int[n + 1];

        for(int i = 1; i <= n; i++){
            parent[i] = i;
        }

        int ans[] = new int[2];

        for(int i = 0; i < edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];

            if(find(a) == find(b)){
                ans[0] = a;
                ans[1] = b;
                break;
            } else {
                union(a, b);
            }
        }

        return ans;
    }

    int find(int x){
        if(parent[x] == x) return x;

        return find(parent[x]);
    }

    void union(int x, int y){
        int xP = find(x);
        int yP = find(y);

        if(xP == yP) return;

        parent[yP] = xP;
    }
}
