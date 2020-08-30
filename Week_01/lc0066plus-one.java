package leetcode;

public class Solution66 {
	public int[] plusOne(int[] digits) {
		for ( int i = digits.length - 1; i >= 0; i-- ) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if ( digits[i] != 0 ) {
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
		
	}
	public static void main(String[] args){
		Solution66 s0 = new Solution66();
		int[] digits = {1, 2, 3};
		int[] result = s0.plusOne(digits);
		for ( int i: result )
			System.out.print(i);
	}

}