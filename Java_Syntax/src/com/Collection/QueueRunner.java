package com.Collection;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

//Comparator 인터페이스 구현
class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {

		return Integer.compare(o1.length(), o2.length());
	}
	
}

public class QueueRunner {
	public static void main(String[] args) {
		//Queue<String> queue = new PriorityQueue<>();

		//comparator 구현하여 임이의 순서대로 정렬하기 위한 코드
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		
		queue.addAll(List.of("Zebra", "Moonkey", "Cat"));
		//A -> C -> M -> Z : 자연스러운 알파벳 순서대로 삭제가 됨
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());	
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		//queue의 기능인 내 마음대로 순서 정렬 : 문자열의 길이 순서대로 삭제를 해보자 => comparator를 구현해야함
		
	}
}
