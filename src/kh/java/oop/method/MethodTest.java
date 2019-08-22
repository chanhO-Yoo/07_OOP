package kh.java.oop.method;

public class MethodTest {
	
	private String mVar = "mVar";
	private static String sVar = "sVar";
	
	/*
	 * 멤버 메서드
	 */
	public void test1() {
		System.out.println("Test1()");
		System.out.println(mVar);
		System.out.println(sVar);
	}
	
	/*
	 * 클래스 메서드
	 */
	public static void test2() {
		System.out.println("Test2()");
		
//		Cannot make a static reference to the non-static field mVar
//		System.out.println(mVar);
//		//static메서드에서 member변수를 호출할 수 없다.
//		//static자원에서 non-static자원은 참조 불가
		System.out.println(sVar);
	}
}
