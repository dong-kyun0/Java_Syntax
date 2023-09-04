package com.Collection;

import java.util.Comparator;

public class ComparatorInterface {
	public static void main(String[] args) {
		StudentComparator a = new StudentComparator(17, 2); // 17살 2반
		StudentComparator b = new StudentComparator(18, 1); // 18살 1반
		StudentComparator c = new StudentComparator(15, 3); // 15살 3반

		// a객체와는 상관 없이 b와 c객체를 비교한다.
		int isBig = a.compare(b, c);

		if (isBig > 0) {
			System.out.println("b객체가 c객체보다 큽니다.");
		} else if (isBig == 0) {
			System.out.println("두 객체의 크기가 같습니다.");
		} else {
			System.out.println("b객체가 c객체보다 작습니다.");
		}
	}
}

class StudentComparator implements Comparator<StudentComparator> {

	int age; // 나이
	int classNumber; // 학급 

	StudentComparator(int age, int classNumber) {
		this.age = age;
		this.classNumber = classNumber;
	}

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		return o1.classNumber - o2.classNumber;
	}
}
