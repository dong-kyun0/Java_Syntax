package com;
import java.math.BigDecimal;

public class StudentRunner {
	public static void main(String[] args) {

		Student st = new Student("Kim", 97, 98, 100);

		int number = st.getNumberOfMarks();
		System.out.println(number);

		int sum = st.getTotalSumOfMarks();
		System.out.println(sum);

		int maximumMark = st.getMaximumMark();
		System.out.println(maximumMark);

		int minimumMark = st.getMinimumMark();
		System.out.println(minimumMark);

		// BigDecimal : floating point 떄문에 사용
		BigDecimal ave = st.getAverageMarks();
		System.out.println(ave);

		// st 객체의 정확한 콘텐츠를 출력해보자 : toString
		System.out.println(st);

		// 배열의 특정 인덱스 값을 삭제 및 배열 속성 더하기
		st.addNewMark(35);

		System.out.println(st);

		st.removeMarkAtIndex(1);

		System.out.println(st);

			//sasdf
	}
}
