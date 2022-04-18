package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {

    List<List<Integer>> result;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        result = new ArrayList<>();

        if (root == null) return result;

        traverse(root, targetSum, new ArrayList<>());

        return result;
    }

    public void traverse(TreeNode node, int updatedSum, ArrayList<Integer> currList){
        if (node == null) return;

        currList.add(node.value);

        if (node.value - updatedSum == 0 && node.left == null && node.right == null){
            result.add(currList);
        }

        traverse(node.left, updatedSum - node.value, new ArrayList<>(currList));
        traverse(node.right, updatedSum - node.value, new ArrayList<>(currList));
    }
}
