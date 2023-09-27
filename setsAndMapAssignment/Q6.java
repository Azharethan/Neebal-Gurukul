package setsAndMapAssignment;

import java.util.HashSet;
import java.util.Set;

public class Q6 {
	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();

		for(int i = 5; i < 30; i += 5) {
			s1.add(i);
		}

		for(int i = 3; i < 20; i += 3) {
			s2.add(i);
		}

		Set<Integer> x = new HashSet<>(s1);
		x.addAll(s2);
		System.out.println("Union of 2 sets : " + x + " and its length: "+ x.size());

		Set<Integer> y = new HashSet<>(s1);
		y.retainAll(s2);
		System.out.println("Intersection of 2 sets : " + y +" and its length: " + y.size());

		Set<Integer> z = new HashSet<>(s1);
		z.removeAll(s2);
		System.out.println("Difference of set1 and set2: " + z + " and its length: "+ z.size());
	}
}

