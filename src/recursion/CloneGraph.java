package recursion;

import java.util.HashMap;
import java.util.HashSet;

public class CloneGraph {

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        return dfsClone(node);
    }

    public Node dfsClone(Node node) {
        HashMap<Integer, Node> map = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        dfsCloneHelper(node, map, visited);
        return map.get(node.val);
    }

    public void dfsCloneHelper(Node node, HashMap<Integer,Node> map, HashSet<Integer> visited) {
        if (visited.contains(node.val)) {
            return;
        }

        Node cloneNode = map.getOrDefault(node.val, new Node(node.val));
        map.put(node.val, cloneNode);

        visited.add(node.val);

        for(int i = 0; i < node.neighbors.size(); i++) {
            Node currentNeighbor = node.neighbors.get(i);
            Node cloneNeighbor = map.getOrDefault(currentNeighbor.val, new Node(currentNeighbor.val));
            map.put(currentNeighbor.val, cloneNeighbor);
            dfsCloneHelper(currentNeighbor, map, visited);
            cloneNode.neighbors.add(cloneNeighbor);
        }
    }
}
