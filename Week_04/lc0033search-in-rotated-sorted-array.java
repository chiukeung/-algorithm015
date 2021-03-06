package leetcode;

public class Solution33 {
	public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0] == target? 0: -1;

        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target)
                return mid;
            
            if (nums[mid] >= nums[0]) {
                if (nums[0] <= target && target < nums[mid])
                    r = mid -1;
                else
                    l = mid + 1;

            }
            else{
                if (nums[mid] < target && target <= nums[nums.length-1])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }
        return -1;

    }

}
