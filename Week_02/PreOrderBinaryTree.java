import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by muscaestar on 7/5/20
 *
 * @author muscaestar
 */
public class PreOrderBinaryTree {
    public List<Integer> preorderTraversalIteration(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.addFirst(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.removeFirst();
            list.add(curr.val);
            if (curr.right != null) {
                stack.addFirst(curr.right);
            }
            if (curr.left != null) {
                stack.addFirst(curr.left);
            }
        }
        return list;
    }

    public List<Integer> preorderTraversalRecursion(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public void helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
    }

    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }
}
