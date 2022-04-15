package binaryTree;

public class ReverseLevelOrder {

//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//
//        if (root == null) return res;
//
//        Stack<List<Integer>> stack = new Stack<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//
//        queue.add(root);
//
//        while (!queue.isEmpty()){
//            int size = queue.size();
//            ArrayList<Integer> currentLevel = new ArrayList<>();
//
//            for (int i = 0; i < size; i++){
//                TreeNode current = queue.remove();
//                currentLevel.add(current.val);
//
//                if (current.left != null){
//                    queue.add(current.left);
//                }
//
//                if (current.right != null){
//                    queue.add(current.right);
//                }
//            }
//            stack.push(currentLevel);
//        }
//
//        while (!stack.isEmpty()){
//            res.add(stack.pop());
//        }
//        return res;
//    }
}
