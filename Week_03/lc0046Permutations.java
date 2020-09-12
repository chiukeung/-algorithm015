package leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution46 {
	public List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new LinkedList<>();
        List<Integer> path = new LinkedList<>();
        backtrack(nums, path);
        return res;
    }
    public void backtrack(int[] nums, List<Integer> path) {
        if ( path.size() == nums.length ) {
            res.add(new LinkedList<>(path));
            return;
        }

        for ( int i = 0; i < nums.length; i++ ) {
            if ( path.contains(nums[i]))
                continue;
            path.add(nums[i]);
            backtrack(nums, path);
            path.remove(path.size() - 1);
        }
    }

}
