package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        traversal(root, result);
        return result;
    }
    public void traversal(TreeNode node, List<Integer> result){
        if ( node == null ) return;
        result.add(node.val);
        traversal(node.left, result);
        traversal(node.right, result);
    }

}
