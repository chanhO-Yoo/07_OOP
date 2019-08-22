package kh.java.oop.method;

import java.util.Random;

public class Main {
	
	private int num = 100;
	//Main이라는 객체가 생성되어야 할당됨. -> 객체를 우선적으로 만들어야 한다.
	
	public static void main(String[] args) {
		//1.멤버 메서드 호출
		//객체 생성 후 객체로써 접근할 것.
		MethodTest m = new MethodTest();
		m.test1();
		
		
		//2.클래스 메서드 호출
		//객체생성 없이 클래스명으로 접근할 것.
		MethodTest.test2();
		
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(); //멤버 메서드 : 객체 생성
		
		int num2 = (int)(Math.random()*100)+1; //클래스 메서드 : 객체 생성하지 않음

//		System.out.println(num);
//		System.out.println(new Main().num);
		
	}
}
