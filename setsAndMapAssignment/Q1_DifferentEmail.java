package setsAndMapAssignment;

import java.util.HashSet;

public class Q1_DifferentEmail {
	public static void main(String[] args) {
		String[] emails= {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
//		String[] emails= {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(differentEmail(emails));
	}
	static int differentEmail(String[] emails) {
		HashSet<String> differentEmail=new HashSet<String>();
		for (int i = 0; i < emails.length; i++) {
			String[] str=emails[i].split("@");
			String leftPart=str[0];
			String rightPart=str[1];
			
			leftPart=leftPart.replaceAll("\\.", "");
			leftPart=leftPart.split("\\+")[0];
			
			String acceptableEmail=leftPart+rightPart;
			
			differentEmail.add(acceptableEmail);
		}
		return differentEmail.size();
	}
}
