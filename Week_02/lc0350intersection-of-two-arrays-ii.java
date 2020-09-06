package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Solution350 {
	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int[] intersection = new int[Math.min(nums1.length, nums2.length)];
		int i = 0, j = 0, k = 0;
		while ( i < nums1.length && j < nums2.length ) {
			if ( nums1[i] < nums2[j] )
				i++;
			else if ( nums1[i] > nums2[j] )
				j++;
			else {
				intersection[k] = nums1[i];
				i++;
				j++;
				k++;
			}
		}
		return Arrays.copyOfRange(intersection, 0, k);
	}
	public static void main(String[] args){
		Solution350 so = new Solution350();
//		int[] nums1 = {1,2,2,1}, nums2 = {2,2};
		int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};
		int[] res = so.intersect(nums1, nums2);
		for ( int i : res )
			System.out.println(i);
		
	}

}
