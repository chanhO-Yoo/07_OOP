package kh.java.oop.student;

/*
 * 클래스란?
 * 
 * 실재하는 사물.개념을 프로그래밍적을 표현하기위해
 * 공통적인 속성/기능을 추상화한 결과물
 * 
 * 객체를 만들기 위한 설계도,틀로써
 * 클래스를 바탕으로 메모리상의 객체를 할당하게 된다.
 */

public class Student {
	
	//캡슐화 전
	
//	// 속성 : 필드, 정적인 데이터
//	 
//	String name;
//	int no;
//	char gender;
//	int age;
//	String address;
//	
//	//기능 : 메소드, 동적인 정보를 표현
//	
//	public void introduce() {
//		String s = "안녕하세요. "+no+"번 "+name+"입니다. 저는 "+gender+"자입니다. "+age+"살 입니다."+address+"에 삽니다.";
//		System.out.println(s);
//	}
	
	
	//캡슐화 후
	
	//필드 변수 private로 변경
	private String name;
	private int no;
	private char gender;
	private int age;
	private String address;
	
	/*
	 * setter
	 * this는 현재 객체를 가리키는 메서드의 숨은 참조값
	 * 모든 메서드에서 this사용가능
	 * private는 현재 클래스에서 사용가능하다.
	 */
	
	
	//private인 필드 변수값에 접근/변경하기 위한 setter
	public void setName(String name) {
		this.name = name;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//private인 필드 변수값을  가져오기 위한 getter
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}
	public char getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getAddress() {
		return address;
	}
	
	//자기소개 출력
	public void introduce() {
		String s = "안녕하세요. "+no+"번 "+name+"입니다. 저는 "+gender+"자입니다. "+age+"살 입니다."+address+"에 삽니다.";
		System.out.println(s);
	}
}
