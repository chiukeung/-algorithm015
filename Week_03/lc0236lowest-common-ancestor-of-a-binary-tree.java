package leetcode;

public class Solution236 {
	private TreeNode res = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p, q);
        return res;
    }
    public boolean helper(TreeNode root, TreeNode p, TreeNode q){
        if ( root == null ) return false;
        boolean left = helper(root.left, p, q);
        boolean right = helper(root.right, p, q);
        if (( left && right ) || (( root.val == p.val || root.val ==  q.val) && ( left || right )))
            res = root;
        return left || right || (root.val == p.val || root.val == q.val);
    }

}
