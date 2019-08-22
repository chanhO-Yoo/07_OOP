package kh.java.oop.init.block;

import java.util.Random;

/**
 * 멤버변수의 초기화
 * 1. 타입별 기본값
 * 2. 명시된 초기값
 * 3. 초기화 블럭에서 생성된 값
 * 4. 매개변수 생성자를 이용한 초기화
 *
 */
public class InitBlockSample {

	//멤버변수 선언
	private int num = 100;//한줄에 값을 초기화 할 경우
	
	//클래스 변수 선언
	public static int snum = 99;
	//static 초기화 블럭
	{
		System.out.println("초기화 이전 : "+snum);
		snum=999;
		System.out.println("초기화 이후 : "+snum);
	}
	
	//초기화 블럭
	//초기화에 연산이 필요한 경우
	{
		System.out.println("초기화 이전 : "+num);
//		num = 200;
		
		Random rnd = new Random();
		num = rnd.nextInt(1000)+1;
		
		System.out.println("초기화 이후 : "+num);
	}
	
	
	public int getNum() {
		return num;
	}
}
