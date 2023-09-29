package graphAssignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q2_findIfPathExists {
	public static void main(String[] args) {
		//test 1
		int[][] edges= {{0,1},{1,2},{2,0}};
		int n=3;
		int source=0;
		int destination=2;
		
		//test 2
//		int[][] edges= {{0,1},{0,2},{3,5},{5,4},{4,3}};
//		int n=6;
//		int source=0;
//		int destination=5;
		
	
		
		boolean ans=validPath(n,edges,source,destination);
		System.out.println(ans);
		
	}
	public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if(edges.length == 0)
            return true;
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        
        boolean[] visited = new boolean[n];
        
        while(!q.isEmpty()){
            int node = q.remove();
            visited[node] = true;
            
            for(Integer l : adj.get(node)){
                if(l == destination)
                    return true;
                if(!visited[l])
                    q.add(l);
            }
            
        }
        
        return false;
    }
}
