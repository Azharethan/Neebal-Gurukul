package listAndQueueAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Q4_KthMostFrequent {
	public static void main(String[] args) {
//		int nums[]= {1,1,1,2,2,3};
//		int k=2;
		int nums[]= {1};
		int k=1;
		
		List<Integer> ans=kMostFrequentElement(nums, k);
		System.out.println(ans);
		
	}
	
	static List<Integer> kMostFrequentElement(int[] nums,int k){
		Map<Integer, Integer> hm=new HashMap<Integer, Integer>();
		
		for(int num: nums) {
			hm.put(num, hm.getOrDefault(num, 0)+1);
		}
		
		PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)-> hm.get(a)-hm.get(b));
		
		for(int num:hm.keySet()) {
			pq.add(num);
			if(pq.size()>k) {
				pq.poll();
			}
		}
		
		List<Integer> kthFrequentElement = new ArrayList<Integer>();
		kthFrequentElement.addAll(pq);
		Collections.reverse(kthFrequentElement);
		
		return kthFrequentElement;
	}
}
