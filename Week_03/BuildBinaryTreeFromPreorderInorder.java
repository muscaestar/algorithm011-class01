import java.util.HashMap;
import java.util.Map;

/**
 * Created by muscaestar on 7/12/20
 *
 * @author muscaestar
 */
public class BuildBinaryTreeFromPreorderInorder {

    Map<Integer, Integer> valToIdx = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            valToIdx.put(inorder[i], i);
        }
        return helper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public TreeNode helper(int[] preorder, int preS, int preE, int[] inorder, int inS, int inE) {
        if (preS == preE) {
            return null;
        }
        int rootVal = preorder[preS];
        int rootIdx = valToIdx.get(rootVal);
        int leftTreeSize = rootIdx - inS;

        TreeNode root = new TreeNode(rootVal);
        root.left = helper(preorder, preS + 1, preS + 1 + leftTreeSize, inorder, inS, rootIdx);
        root.right = helper(preorder, preS + 1 + leftTreeSize, preE, inorder, rootIdx + 1, inE);
        return root;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
