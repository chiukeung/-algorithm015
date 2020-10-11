package leetcode;

public class Solution221 {
	public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;
        int maxS = 0;
        int row = matrix.length, col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == '1') {
                    maxS = Math.max(maxS, 1);
                    int temp = Math.min(row - i, col - j);
                    for (int k = 1; k < temp; k++) {
                        boolean flag = true;
                        if (matrix[i + k][j + k] == '0')
                            break;
                        for (int m = 0; m < k; m++) {
                            if (matrix[i + k][j + m] == '0' || matrix[i + m][j + k] == '0') {
                                flag = false;
                                
                            }
                        }
                        if (flag) {
                            maxS = Math.max(maxS, k + 1);
                        }
                        else{
                            break;
                        
                        }
                    }
                }

            }
        }
        int max = maxS * maxS;
        return max;

    }

}
