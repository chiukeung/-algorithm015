package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution589 {
	public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        traversal(root, result);
        return result;
        
    }
    public void traversal(Node node, List<Integer> result){
        if ( node == null ) return;
        result.add(node.val);
        for ( Node child : node.children ) {
            traversal(child, result);
        }
    }

}
