package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new LinkedList<>();
        if ( k <= 0 || n < k ) return res;

        Deque<Integer> deque = new ArrayDeque<>();
        dfs(n, k, 1, deque, res);
        return res;
    }
    public void dfs(int n, int k, int start, Deque<Integer> deque, List<List<Integer>> res){
        if ( deque.size() == k ) {
        	res.add(new ArrayList<>(deque));
        	return;
        }
        
        for ( int i = start; i <= n; i++ ) {
        	deque.addLast(i);
        	
        	dfs(n, k, i + 1, deque, res);
        	
        	deque.removeLast();
        	
        }
        
    }

}
