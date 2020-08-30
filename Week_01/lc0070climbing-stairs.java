package leetcode;

public class Solution70 {
	public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return helper(memo, n);

    }
    int helper(int[] memo, int n){
        if ( n == 1 || n == 0) return 1;
        if ( memo[n] != 0) return memo[n];
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static void main(String[] args){
    	Solution70 solution = new Solution70();
    	int n = 44;
    	System.out.print(solution.climbStairs(n));
    }

}
