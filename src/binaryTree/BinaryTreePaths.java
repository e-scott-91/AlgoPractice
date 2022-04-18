package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    List<String> result;

    public List<String> binaryTreePaths(TreeNode root) {

        result = new ArrayList<String>();
        if (root == null) return result;
        if (root.left == null && root.right == null){
            result.add(Integer.toString(root.value));
        }
        traverse(root.left, Integer.toString(root.value));
        traverse(root.right, Integer.toString(root.value));
        return result;
    }

    public void traverse(TreeNode node, String currList){
        if (node == null) return;

        currList += "->" + node.value;

        if (node.left == null && node.right == null){
            result.add(currList);
            return;
        }

        traverse(node.left, new String(currList));
        traverse(node.right, new String(currList));
    }
}
