import javax.swing.tree.TreeNode;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}

// don't need to explore the whole tree just need to find the first node that is grater htan p annd less than q.
// using image as example, if p=0 and q=5, the very first number that will meet the vriteria of > p and < q will be 2.
// Could set an initial value or no value and state that when LCA (lowest common ancestor) has a value, break loop
// and return.

// MY ATTEMPT
//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        TreeNode LCA = null;
//
//        while (LCA == null) {
//            if (root.val >= p.val && root.val <= q.val) {
//                LCA = root;
//            } else if (root.right != null) {
//                lowestCommonAncestor(root.right, p, q);
//            } else {
//                lowestCommonAncestor(root.left,p,q);
//            }
//        }
//        return LCA;
//    }
//}



