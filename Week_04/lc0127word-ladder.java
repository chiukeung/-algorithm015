package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Solution127 {
//	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
//		if(wordList==null||!wordList.contains(endWord)) return 0;
//		boolean[] isVisited = new boolean[wordList.size()];
//		Queue<String> queue = new LinkedList<>();
//		queue.add(beginWord);
//		int depth=0;
//		while(!queue.isEmpty()){
//			int len = queue.size();
//			depth++;
//			for(int i=0;i<len;i++){
//				String poll = queue.poll();
//				for(int j=0;j<wordList.size();j++){
//					//如果已经访问过
//					if(isVisited[j])
//						continue;
//					//是否能转换字符串
//					if(!canConvert(poll,wordList.get(j)))
//						continue;
//					
//					if(wordList.get(j).equals(endWord))
//						return depth+1;
//					isVisited[j]=true;
//					queue.add(wordList.get(j));
//				}
//			}
//		}
//		return 0;
//	}
//	//是否可以转换字符串
//	public static boolean canConvert(String start,String end){
//		int count=0;
//		for(int i=0;i<start.length();i++){
//			if(start.charAt(i)!=end.charAt(i)){
//				count++;
//				if(count>1)
//					return false;
//			}
//			
//		}
//		return count==1;
//	}
	
	
//	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
//	    if(wordList==null||!wordList.contains(endWord)) return 0;
//	    wordList.add(beginWord);
//	    int n = wordList.size();
//	    //begin找end
//	    Set<Integer> isVisited1 = new HashSet<>();
//	    Queue<Integer> queue1 = new LinkedList<>();
//	    int start = n-1;
//	    queue1.add(start);
//	    isVisited1.add(start);
//	    int depth1 =0;
//	    //end找begin
//	    int end = wordList.indexOf(endWord);
//	    Set<Integer> isVisited2 = new HashSet<>();
//	    Queue<Integer> queue2 = new LinkedList<>();
//	    queue2.add(end);
//	    isVisited2.add(end);
//	    int depth2 =0;
//	    
//	    while(!queue1.isEmpty()&&!queue2.isEmpty()){
//	    	//begin找end
//	    	depth1++;
//	    	int size1 = queue1.size(); 
//	    	while(size1-->0){
//	    		String poll = wordList.get(queue1.poll());
//	    		for(int i=0;i<size1;i++){
//	    			if(isVisited1.contains(i))
//	    				continue;
//	    			if(!canConvert(poll,wordList.get(i)))
//	    				continue;
//	    			if(isVisited2.contains(i))
//	    				return depth1+depth2+1;
//	    			isVisited1.add(i);
//	    			queue1.add(i);
//	    		}
//	    	}
//	    	depth2++;
//	    	int size2 = queue2.size();
//	    	while(size2-->0){
//	    		String poll = wordList.get(queue2.poll());
//	    		for(int i=0;i<size2;i++){
//	    			if(isVisited2.contains(i))
//	    				continue;
//	    			if(!canConvert(poll,wordList.get(i)))
//	    				continue;
//	    			if(isVisited1.contains(i))
//	    				return depth1+depth2+1;
//	    			isVisited2.add(i);
//	    			queue2.add(i);
//	    		}
//	    	}
//	    }
//	    return 0;
//	    
//	}
//
//	private static boolean canConvert(String poll, String s) {
//	    int count = 0;
//	    for (int i = 0; i < s.length(); i++) {
//	        if (poll.charAt(i) != s.charAt(i)) {
//	            count++;
//	            if (count > 1) {
//	                return false;
//	            }
//	        }
//	    }
//	    return true;
//	}

//	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
//		if(wordList==null||!wordList.contains(endWord)) return 0;
//	    wordList.add(beginWord);
//	    int n = wordList.size();
//	    //begin找end
//	    Set<Integer> isVisited1 = new HashSet<>();
//	    Queue<Integer> queue1 = new LinkedList<>();
//	    int start = n-1;
//	    queue1.add(start);
//	    isVisited1.add(start);
//
//	    //end找begin
//	    int end = wordList.indexOf(endWord);
//	    Set<Integer> isVisited2 = new HashSet<>();
//	    Queue<Integer> queue2 = new LinkedList<>();
//	    queue2.add(end);
//	    isVisited2.add(end);
//
//	    int depth = 0;
//	    
//	    while(!queue1.isEmpty()&&!queue2.isEmpty()){
//	    	if(queue1.size()>queue2.size()){
//	    		Queue<Integer> tmp = queue1;
//	    		queue1 = queue2;
//	    		queue2 = tmp;
//	    		Set<Integer> set = isVisited1;
//	    		isVisited1 = isVisited2;
//	    		isVisited2 = set;
//	    	}
//	    	
//	    	depth++;
//	        int size = queue1.size();
//	        while (size-- > 0) {
//	            String poll = wordList.get(queue1.poll());
//	            for (int i = 0; i < wordList.size(); i++) {
//	                if (isVisited1.contains(i)) {
//	                    continue;
//	                }
//	                if (!canConvert(poll, wordList.get(i))) {
//	                    continue;
//	                }
//	                if (isVisited2.contains(i)) {
//	                    return depth + 1;
//	                }
//	                isVisited1.add(i);
//	                queue1.add(i);
//	            }
//	        }
//
//	    }
//	    return 0;
//	    
//	}
//	
//	private static boolean canConvert(String poll, String s) {
//    int count = 0;
//    for (int i = 0; i < s.length(); i++) {
//        if (poll.charAt(i) != s.charAt(i)) {
//            count++;
//            if (count > 1) {
//                return false;
//            }
//        }
//    }
//    return true;
//}
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if ( beginWord == null || endWord == null || wordList.size() == 0 )
        	return 0;
        Queue<String> queue = new LinkedList<>();
        boolean[] isVisited = new boolean[wordList.size()];
        queue.add(beginWord);
        int res = 0;
        while ( !queue.isEmpty() ) {
        	int len = queue.size();
        	res++;
        	for ( int i = 0; i < len; i++) {
        		String temp = queue.poll();
        		for ( int j = 0; j < wordList.size(); j++) {
        			if (isVisited[j])
        				continue;
        			if ( !canConvert(temp, wordList.get(j)) )
        				continue;
        			if (wordList.get(j).equals(endWord)) {
        				return res + 1;
        			}
        			isVisited[j] = true;
        			queue.add(wordList.get(j));
        		}
        	}
        	
        }
        return 0;
    }
	public boolean canConvert(String s1, String s2){
		int count = 0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				count++;
				if(count>1) return false;
			}
		}
		return count==1;
	}
	

	
	public static void main(String[] args){
		Solution127 so = new Solution127();
		String beginWord = "hit";
		String endWord = "cog";
		String[] array = {"hot","dot","dog","lot","log","cog"};
		List<String> wordList = new ArrayList<>();
		for(String s:array)
			wordList.add(s);
		
		System.out.println(so.ladderLength(beginWord,endWord,wordList));
	}
}
