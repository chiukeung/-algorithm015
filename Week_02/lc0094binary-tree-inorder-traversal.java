package leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        if ( root == null ) return new LinkedList<>();
        List<Integer> res = new LinkedList<>();
        helper(res, root);
        return res;

    }
    public void helper(List<Integer> res, TreeNode node){
        if ( node == null ) return;
        helper(res, node.left);
        res.add(node.val);
        helper(res, node.right);
    }

}
