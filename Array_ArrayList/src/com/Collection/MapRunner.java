package com.Collection;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {//문자열의 한 글자 & 한 단어 들의 갯수를 구해보자!
	public static void main(String[] args) {
		String str = "This is an awesome occassion. This has never happened before.";
		
		//A. 문자열의 글자 갯수 (공백 포함)
		char[] characters = str.toCharArray(); //글자 차례대로 확인하자 => 1. 모든 글자를 입력함 : char 배열을 이용하여
		Map<Character, Integer> occurrences = new HashMap<>();
		//2.  enhanced for문을 사용
		for (char character : characters) {
			Integer count = occurrences.get(character); //글자를 하나씩 가져옴
			if (count == null) {
				occurrences.put(character, 1);
			} else {
				occurrences.put(character, count + 1); //글자가 있으면 +1 해줌
			}
		}
		System.out.println(occurrences);
		
		
		//B.문자열의 단어의 갯수
		Map<String, Integer> hashmap = new HashMap<>();
		
		String[] words = str.split(" "); // str 문자열의 모든 단어를 반환함 : split("?") 메소드는 해당 문자(?)를 기준으로 문자열을 나누어 Array에 저장할 수 있는 기능을 함 
		for (String word : words) {
			//1. hashmap에서 해당 단어(value)를 찾아서 없으면 null 값을 반환 / 있으면 1을 반환하는 get() 메소드 사용
			//2. number는 Wrapper객체기 때문에 null값을 포함할 수 있습니다.
			
			Integer number = hashmap.get(word); 
			
			if (number == null) {//put() 메소드를 사용해서 있다면 해당 단어와 1 or 없다면 해당 단어에 value값에 +1을 해줍니다.
				hashmap.put(word, 1);
				System.out.println(hashmap.put(word, 1));
			} else {
				hashmap.put(word, number + 1);
			}
		}
		System.out.println(hashmap);
	}
}