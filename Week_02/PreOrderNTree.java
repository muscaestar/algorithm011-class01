import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by muscaestar on 7/5/20
 *
 * @author muscaestar
 */
public class PreOrderNTree {
    public List<Integer> preorderIteration(Node root) {
        if (root == null) return new ArrayList<>();

        List<Integer> res = new ArrayList<>();
        Deque<Node> stack = new LinkedList<>();
        stack.addFirst(root);
        while (!stack.isEmpty()) {
            Node curr = stack.removeFirst();
            res.add(curr.val);
            for (int i = curr.children.size() - 1; i >= 0; i--) {
                stack.addFirst(curr.children.get(i));
            }
        }
        return res;
    }

    public List<Integer> preorderRecursion(Node root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(Node root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        for (Node n : root.children) {
            helper(n, list);
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
