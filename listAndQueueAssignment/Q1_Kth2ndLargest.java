package listAndQueueAssignment;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Q1_Kth2ndLargest {
	public static void main(String[] args) {
//		int[] nums= {3,2,1,5,6,4}; int k=2;
		int nums[]= {3,2,3,1,2,4,5,5,6}; int k=4;
		int ans=largestElement(nums, k);
		System.out.println(ans);
	}
	
	static  int largestElement(int[] nums,int k) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		for (int i = 0; i < nums.length; i++) {
			pq.add(nums[i]);
		}
		
		 while(pq.size()>k) {
			 pq.poll();
		 }
		return pq.peek();
	}
}
