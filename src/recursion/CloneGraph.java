package recursion;

import java.util.HashMap;
import java.util.HashSet;

public class CloneGraph {

    public Node cloneGraph(Node node) {
        if (node == null) return null;
        HashMap<Integer, Node> map = new HashMap<Integer, Node>();
        HashSet<Integer> visited = new HashSet<Integer>();
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
            cloneNode.neighbors.add(cloneNeighbor);
            dfsCloneHelper(currentNeighbor, map, visited);

        }
    }
}

// Alternative solution
//    public Node cloneGraph(Node node) {
//        return node==null ? null : explore(
//                node,new HashMap<Node,Node>()
//        );
//    }
//
//    public Node explore(Node node, Map<Node,Node> map){
//
//        if(map.containsKey(node)){
//            return map.get(node);
//        }
//
//        Node newNode=new Node(node.val);
//        map.put(node,newNode);
//
//        newNode.neighbors=new ArrayList<Node>();
//
//        for(Node temp: node.neighbors){
//            newNode.neighbors.add(explore(temp,map));
//        }
//
//        return newNode;
//    }
