package functionalProgramming_Assigment;

import java.util.ArrayList;
//Assignment 2:
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question_2 {
	public static void main(String[] args) {
		Map<String, String> contacts = new HashMap<>();
		contacts.put("1237589020", "John");
		contacts.put("1237009020", "John");
		contacts.put("7890291111", "Neal");
		contacts.put("2647210290", "Raju");
		contacts.put("9999999999", "Peter");
		contacts.put("9081234567", "Neha");
		
//		----------------------------------------------------------------------------------

//		System.out.println("======================================================\n"
//				+ "1.Filter : print the contacts for which the name is John\n"
//				+ "======================================================");
//
//		String targetName = "John";
//		List<String> johnContacts = new ArrayList<>();
//
//		for (Map.Entry<String, String> entry : contacts.entrySet()) {
//			if (entry.getValue().equals(targetName)) {
//				johnContacts.add(entry.getKey());
//			}
//		}
//
//		if (!johnContacts.isEmpty()) {
//			System.out.println("Contacts of " + targetName + ": " + johnContacts);
//		}
//	}
		
//------------------------------------------------------------------------------------------		

	System.out.println("======================================================\n"
			+ "2.Collect: collect all the contacts with name John in a map\n"
			+ "======================================================");

	String targetName = "John";
	Map<String, String> johnContacts = contacts.entrySet().stream()
				.filter(entry -> entry.getValue().equals(targetName))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

	if(!johnContacts.isEmpty())
		System.out.println("Contacts with name john" + ": " + johnContacts);
		
//----------------------------------------------------------------------------------------------		

		System.out.println("======================================================\n"
				+ "3.Map : create a String having all the names saperated by comma\n"
				+ "======================================================");

		StringBuilder s = new StringBuilder();

		for (String name : contacts.values()) {
			s.append(name).append(",");
		}

		if (s.length() > 0) {
			s.deleteCharAt(s.length() - 1);
		}
		
		String namesSeparatedByComma = s.toString();
        System.out.println(namesSeparatedByComma);
        
        
        
        
//------------------------------------------------------------------------------
	 
		
		System.out.println("======================================================\n"
				+ "4.reduce : find out the average of all the marks in below map. use mapToDouble\n"
				+ "======================================================");
		
		
					Map<String,Double> marks = new HashMap<>();
					marks.put("Science", 66.00);
					marks.put("Maths", 78.00);
					marks.put("English", 90.00);


			        double average = marks.values()
			            .stream()
			            .mapToDouble(Double::doubleValue)
			            .average()
			            .orElse(0.0);

			        System.out.println("Average of all marks: " + average);
	}
}
