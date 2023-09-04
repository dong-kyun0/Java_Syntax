package com;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	// private int[] marks;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int...marks) {
		this.name = name;
		//this.marks = marks;
		for(int mark: marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		// return marks.length;
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}

		return sum;
	}

	public int getMaximumMark() {
		/*
		 * Arrays.sort(marks); int i = marks.length-1; int b = marks[i]; return b;
		 */
		// 쌤 풀이
		/*
		int max = Integer.MIN_VALUE;
		for (int mark : marks) {
			if (mark > max) {
				max = mark;
			}
		}
		return max;
		*/
		
		//Collection~!~!~!
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		/*
		 * Arrays.sort(marks); int b = marks[0]; return b;
		 */
		//쌤 풀이

		/*
		int min = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < min) {
				min = mark;
			}
		}
		return min;
		*/
		
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		// sum
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		// total

		// return new BigDecimal(sum / number);
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);

	}

	//st 객체의 정확한 콘텐츠를 출력해보자 : toString
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

}

