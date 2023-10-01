package listAndQueueAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Q2_MergeLL {
	public static void main(String[] args) {
		List<List<Integer>> list=new ArrayList<>();
		list.add(Arrays.asList(1,4,5));
		list.add(Arrays.asList(1,3,4));
		list.add(Arrays.asList(2,6));
		
		List<Integer> mergeList=mergeLL(list);
		
		System.out.println(list);
	}
	
	static List<Integer> mergeLL(List<List<Integer>> list) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		for(List<Integer> lists:list) {
			if(!list.isEmpty()) {
				pq.addAll(list.get(0));
				
			} else {
				System.out.println("not");
			}
		}
		System.out.println(pq);
		return null;
		
	
		
		
	}
	
	
}
