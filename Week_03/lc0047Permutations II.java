package leetcode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution47 {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new LinkedList<>();
		Deque<Integer> path = new ArrayDeque<>(nums.length);
		boolean[] used = new boolean[nums.length];
		Arrays.sort(nums);
		backtrack(res, nums, path, 0, used);
		return res;

    }
	public void backtrack(List<List<Integer>> res, int[] nums, Deque<Integer> path, int depth,
						boolean[] used){
		if ( depth == nums.length ) {
			res.add(new LinkedList<>(path));
			return;
		}
		for ( int i = 0; i < nums.length; i++ ) {
			if ( used[i] )
				continue;
			if ( i > 0 && nums[i] == nums[i - 1] && !used[i - 1] )
				continue;
				
			path.addLast(nums[i]);
			used[i] = true;
			backtrack(res, nums, path, depth + 1, used);
			used[i] = false;
			path.removeLast();
			
		}
	}
	public static void main(String[] args){
		int[] nums = {3, 3, 0, 3};
		Solution47 so = new Solution47();
		List<List<Integer>> res = so.permuteUnique(nums);
		for ( List<Integer> list : res ) {
			for ( Integer i : list ) {
				System.out.print(i + ",");
			}
			System.out.println();
		}
		
	}

}
