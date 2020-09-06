package leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution429 {
    public List<List<Integer>> levelOrder(Node root) {
        if ( root == null ) return new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        helper(res, root, 0);

        return res;
    }
    public void helper(List<List<Integer>> res, Node root, int level){
        if ( res.size() <= level ) {
            res.add(new LinkedList<>());
        }
        res.get(level).add(root.val);
        for ( Node c : root.children )
            helper(res, c, level + 1);
    }

}
