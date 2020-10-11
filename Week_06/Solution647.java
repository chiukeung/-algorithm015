package leetcode;

public class Solution647 {
	public int countSubstrings(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n * 2 - 1; i++) {
            int left = i / 2, right = i / 2 + i % 2;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                --left;
                ++right;
                ++res;
            }
        }
        return res;

    }

}
