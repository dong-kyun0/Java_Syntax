package com.Collection;


public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id + " " + name;
	}

	//Comparable 인터페이스 구현중
	@Override
	public int compareTo(Student that) { //한 학생을 다른 학생과 비교하고 싶음.
		//id를 이용해 커지는 순서대로 정렬하고 싶다.
		return Integer.compare(that.id, this.id); // 오름차순
		//this : 현재 객체  // that은 비교하려는 객체
		
		//반대 순서로 하고싶으면 
		//return Integer.compare(that.id, this.id);
	}

	
}