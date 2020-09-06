package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Solution347 {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> occ = new HashMap<>();
		for ( int num : nums ) {
			occ.put(num, occ.getOrDefault(num, 0) + 1);
		}

		PriorityQueue<int[]> queue = new PriorityQueue<int[]>( new Comparator<int[]>() {
            public int compare(int[] m, int[] n) {
                return m[1] - n[1];
            }
        });

		for ( Map.Entry<Integer, Integer> entry : occ.entrySet() ) {
			int num = entry.getKey(), count = entry.getValue();
			if ( queue.size() == k ) {
				if ( queue.peek()[1] < count ) {
					queue.poll();
					queue.offer(new int[]{num, count});
				}
			}
			else{
				queue.offer(new int[]{num, count});
			}
		}
		int[] res = new int[k];
		for ( int i = 0; i < k; i++ ) {
			res[i] = queue.poll()[0];
		}
		return res;
	}
	public static void main(String[] args){
		int[] nums = {1};
		int k = 1;
		Solution347 so = new Solution347();
		int[] res = so.topKFrequent(nums, k);
	}

}
