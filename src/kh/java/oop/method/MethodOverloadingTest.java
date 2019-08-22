package kh.java.oop.method;

/*
 * 메서드 오버로딩
 * 
 * 한 클래스 내에서 메소드명은 같고,
 * 파라미터 선언부가 다른 메서드를 여러개 정의
 * 
 * 메소드명 동일할 것
 * 매개변수 선언부가 달라야함 : 매개변수 타입, 개수, 순서
 * 
 * 주의사항
 * 1) 매개변수명은 상관치 않는다.
 * 2) 리턴타입은 상관치 않는다.
 * 3) 접근제한자는 상관치 않는다.
 * 
 */
public class MethodOverloadingTest {
	
	public int test() {
		return 0;
	}
	
	public int test(int a) {
		return 0;
	}
	
	public int test(int a, int b) {
		return 0;
	}

	//메서드 오버로딩이 아니다. 
	//매개변수명은 상관이 없다.
//	public int test(int c, int d) {
//		return 0;
//	}
	
	public int test(int a, String b) {
		return 0;
	}
	
	public int test(String a, int b) {
		return 0;
	}
	
	//리턴 타입은 상관이 없다.
//	public void test(String a, int b) {
//		return 0;
//	}
	
	
}
