package leetcode;

import java.util.HashMap;

public class Solution242 {
	public boolean isAnagram(String s, String t) {
		if ( s.length() != t.length() ) return false;
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
		
	}
	public static void main(String[] args){
		String s = "rat", t = "ca";
		Solution242 so = new Solution242();
		System.out.println(so.isAnagram(s, t));
	}

}
