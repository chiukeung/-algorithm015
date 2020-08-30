package leetcode;


//输入: secret = "1807", guess = "7810"
//输出: "1A3B"
//输入: secret = "1123", guess = "0111"
//输出: "1A1B"
//1122, 1222
//3A0B

public class Solution299 {
	public String getHint(String secret, String guess) {
		if ( secret == null || guess == null ) return null;
        String res = "";
        int numA = 0, numB = 0;
        int[] set = new int[10];
        for ( int i = 0; i < secret.length(); i++ ) {
        	if ( secret.charAt(i) == guess.charAt(i) ) {
        		numA++;
        		continue;
        	}
        	set[secret.charAt(i) - '0'] += 1;
        	set[guess.charAt(i) - '0'] -= 1;
        }
        for ( int i = 0; i < set.length; i++ ) {
        	if ( set[i] > 0 )
        		numB += set[i];
        }
        numB = secret.length() - numB - numA;
        
        res = numA + "A" + numB + "B";
        
        return res;
    }
	public static void main(String[] args){
		Solution299 so = new Solution299();
		String secret = "1", guess = "0";
		System.out.println(so.getHint(secret, guess));
	}

}
