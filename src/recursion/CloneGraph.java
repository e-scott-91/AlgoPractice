package recursion;

import java.util.HashMap;
import java.util.HashSet;

public class CloneGraph {

    public Node cloneGraph(Node node) {
        if (node == null) return node;
        HashMap<Integer, Node> map = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        dfsCloneHelper(node, map, visited);
        return map.get(node.val);
    }

    public Node dfsClone(Node root) {
        HashMap<Integer, Node> map = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        dfsCloneHelper(root, map, visited);
        return map.get(root.val);
    }

    public void dfsCloneHelper(Node node, HashMap<Integer, Node> map, HashSet<Integer> visited) {
        if (visited.contains(node.val)) return;

        Node cloneNode = map.getOrDefault(node.val, new Node(node.val));
        map.put(node.val, cloneNode);

        visited.add(node.val);
        for (int i = 0; i < node.neighbors.size(); i++){
            Node currentNeighbour = node.neighbors.get(i);
            Node cloneNeighbour = map.getOrDefault(currentNeighbour.val, new Node(currentNeighbour.val));
            map.put(currentNeighbour.val, cloneNeighbour);
            dfsCloneHelper(cloneNeighbour, map, visited);
            cloneNode.neighbors.add(cloneNeighbour);
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
