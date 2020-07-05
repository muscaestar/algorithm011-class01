import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by muscaestar on 7/5/20
 *
 * @author muscaestar
 */
public class InOrderBinaryTree {
    public List<Integer> inorderTraversalIteration(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.addFirst(curr);
                curr = curr.left;
            }
            curr = stack.removeFirst();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }

    public List<Integer> inorderTraversalRecursion(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;

    }

    public void helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }

    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }
}
