package com.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {//Set Collection 의 HashSet, TreeSet, LinkedHashSet의 차이
	
	
	
	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		//중복값 허용안함 : Set Collection
		
		//정렬 순서대로
		Set<Character> treeSetChars = new TreeSet<>(characters);
		System.out.println("Sorted Order: " + treeSetChars);			
		
		//삽입 순서대로
		Set<Character> linkedSetChars = new LinkedHashSet<>(characters);
		System.out.println("Inserted Order: " + linkedSetChars);  

		//정렬 순서x 삽입 순서x 
		Set<Character> hashSetChars = new HashSet<>(characters);
		System.out.println("Unique Characters: " + hashSetChars);
		
		
		
	}
}
