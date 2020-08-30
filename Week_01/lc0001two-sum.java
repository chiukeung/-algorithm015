package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();

		for ( int i = 0; i < nums.length; i++ ) {
			int first = target - nums[i];
			if ( map.containsKey(first) ) {
				res[0] = i;
				res[1] = map.get(first);
				return res;
			}
			map.put(nums[i], i);
		}
		return res;
		

	}
	public static void main(String[] args) {
		Solution1 so = new Solution1();
		int[] nums = {0,7,11,0};
		int target = 0;
		int[] res = so.twoSum(nums, target);
		for ( int i: res )
			System.out.println(i);
	}
}






