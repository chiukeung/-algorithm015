package leetcode;

import java.util.HashMap;

public class Soluton105 {
	HashMap<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if ( preorder.length != inorder.length ) return null;
        int len = preorder.length;
        map = new HashMap<>();
        for ( int i = 0; i < len; i++ )
            map.put(inorder[i], i);
        
        return helper(preorder, inorder, 0, len - 1, 0, len - 1 );
    }
    public TreeNode helper(int[] preorder, int[] inorder, int preleft, int preright, int inleft, int inright){
        if ( preleft > preright ) return null;
        int preroot = preleft;
        int inroot = map.get(preorder[preroot]);

        int preleftsize = inroot - inleft;
        TreeNode root = new TreeNode(preorder[preroot]);
        root.left = helper(preorder, inorder, preleft + 1, preleft + preleftsize, inleft, inroot - 1 );
        root.right = helper(preorder, inorder, preleft + 1 + preleftsize, preright, inroot + 1, inright );
        return root;
    }

}
