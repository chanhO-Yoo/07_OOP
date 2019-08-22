package kh.java.oop.method.recursion;
/*
 * 재귀메서드
 * 메서드 내부에서 다시 메서드 자신을 호출하는 코드를 포함하는 메서드
 * 
 * factorial
 * 5! = 5*4*3*2*1
 */

public class RecursionTest {

	public static void main(String[] args) {
		RecursionTest r = new RecursionTest();
		int result = r.test1(10);
		System.out.println(result);
		
		//재귀함수
		result = r.test2(10);
		System.out.println(result);
	}
	
	public int test1(int num) {
		int result = 1;
		for(int i=1;i<=num;i++) {
			result *= i;
		}
		return result;
	}

	public int test2(int num) {
		return num*test2(num-1);
	}
}
