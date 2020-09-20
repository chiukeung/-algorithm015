package leetcode;

public class Solution200 {
    public int numIslands(char[][] grid) {
    	if ( grid == null || grid.length == 0 )
    		return 0;
        int res = 0;
        for ( int i = 0; i < grid.length; i++) {
        	for (int j = 0; j < grid[0].length; j++) {
        		if (grid[i][j]=='1')
        			res++;
        		dfs(grid, i, j);
        	}
        }
        return res;

    }
    
    public void dfs(char[][] grid, int x, int y){
    	if (!isValid(x, y, grid))
    		return;
    	if (grid[x][y] != '1')
    		return;
    	
    	grid[x][y] = '2';
    	dfs(grid, x+1, y);
    	dfs(grid, x-1, y);
    	dfs(grid, x, y+1);
    	dfs(grid, x, y-1);  	
    }
    
    public boolean isValid(int x, int y, char[][] grid) {
    	return x >= 0 && y >= 0 && x < grid.length && y < grid[0].length;
    }
}
