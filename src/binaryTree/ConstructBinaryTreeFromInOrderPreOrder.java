package binaryTree;

import java.util.HashMap;

public class ConstructBinaryTreeFromInOrderPreOrder {

    int poIndex;
    HashMap<Integer, Integer> IOreference;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        poIndex = 0;
        IOreference = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            IOreference.put(inorder[i], i);
        }

        return helper(preorder, inorder, 0, inorder.length -1);
    }


    public TreeNode helper(int[] preOrder, int[] postOrder, int start, int end){
        if (start > end) {
            return null;
        }

        TreeNode root = new TreeNode(preOrder[poIndex++]);

        if (root == null) return null;

        if (start == end) return root;

        int index = IOreference.get(root.value);

        root.left = helper(preOrder, postOrder, start, index-1);
        root.right = helper(preOrder, postOrder, index + 1, end);

        return root;

    }
}
