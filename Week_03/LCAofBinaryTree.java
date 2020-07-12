/**
 * Created by muscaestar on 7/12/20
 *
 * @author muscaestar
 */
public class LCAofBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) {
            return root;
        }
        if (root == null) {
            return null;
        }

        TreeNode lLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rLCA = lowestCommonAncestor(root.right, p, q);
        if (lLCA != null && rLCA != null) {
            return root;
        } else if (lLCA == null) {
            return rLCA;
        } else {
            return lLCA;
        }

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
