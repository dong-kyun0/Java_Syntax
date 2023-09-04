package com.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparator implements Comparator<Student> {

	// 내림차순 비교자
	@Override
	public int compare(Student std1, Student std2) {
		return Integer.compare(std1.getId(), std2.getId());
	}

}

public class StudentsCollectionRunner {
	public static void main(String[] args) {
		// 학생들의 리스트를 만들어
		List<Student> std = List.of(new Student(1, "Kim"), new Student(100, "Kyun"), new Student(2, "Dong"));

		List<Student> stdAl = new ArrayList<>(std);

		System.out.println(std);

		Collections.sort(stdAl);
		/*
		 * Collection의 스태틱 메소드 sort를 사용하기 위한 여정이 핵심 sort()메소드는 Comparator 인터페이스를 구현해야한다.
		 * student 클래스로 해당 인터페이스를 구현할 것임.
		 * 
		 */
		System.out.println("Desc" + stdAl);

		// Collections.sort(stdAl, new AscendingStudentComparator());
		stdAl.sort(new AscendingStudentComparator());

		System.out.println("AscendingStudentComparator" + stdAl);
	}
}