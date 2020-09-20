package leetcode;

public class Solution74 {
	public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length <= 0) return false;
        int r = matrix.length, c = matrix[0].length;

        int left = 0, right = r * c -1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (matrix[mid / c][mid % c] == target)
                return true;
            else if (matrix[mid / c][mid % c] > target) {
                right = mid - 1;
            }
            else if (matrix[mid / c][mid % c] < target)
                left = mid + 1;
        }
        return false;

    }

}
