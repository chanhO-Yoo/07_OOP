package kh.java.oop.class_.run;

import kh.java.oop.class_.A;

public class Run {
	public static void main(String[] args) {
		//public class
		//패키지가 달라도, import문을 통해 접근,객체화 가능하다.
		A a = new A();
		
		//default class
		//다른 패키지에서는 import문 조차 사용 불가능
		B b = new B();
	}
}


//절차지향식
/*
 * 집을 짓는 데 필요한 구조 : 벽, 창문, 문, 엘리베이터
 * 
 * 엘리베이터 -> 엘리베이터를 처음부터 만든다.
 * 
 * 로또 코드 -> 난수생성 -> 난수를 만드는 코드를 1부터 작성
 * 
 */


//객체지향식
/*
 * 집을 짓는 데 필요한 구조 : 벽, 창문, 문, 엘리베이터
 * 
 * 엘리베이터 -> 만들어진 것을 가져다가 쓴다.
 * 
 * 로또 코드 -> 난수생성//Random객체를 가져와서 nextInt()메소드의 구현을 모른채 사용
 */

