import java.util.Stack;

/**
 * Created by Administrator on 6/27/2017.
 */
public class TreeIterate {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == null || q == null) {
            return null;
        }

        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        Stack<TreeNode> ancs = new Stack<TreeNode>();

        Stack<TreeNode> ps = null, qs = null;

        TreeNode node = null;
        while (ps == null || qs == null) {
            node = s.pop();
            while (!ancs.isEmpty() && (ancs.peek().left != node && ancs.peek().right != node)) {
                ancs.pop();
            }

            if (node == p) {
                ps = (Stack) ancs.clone();
            }
            if (node == q) {
                qs = (Stack) ancs.clone();
            }

            if (node.right != null) {
                s.push(node.right);
            }
            if (node.left != null) {
                s.push(node.left);
            }

            if (node.right != null || node.left != null) {
                ancs.push(node);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);
        TreeNode a6 = new TreeNode(6);
        TreeNode a7 = new TreeNode(7);

        a1.left = a2;
        a1.right = a3;

        a2.left = a4;
        a2.right = a5;

        a3.left = a6;
        a3.right = a7;


        lowestCommonAncestor(a1, a4, a7);
    }
}
