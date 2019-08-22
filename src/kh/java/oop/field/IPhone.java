package kh.java.oop.field;

public class IPhone {
	//멤버(인스턴스)변수 : non -static
	//클래스 영역에 선언되었으므로, 모든 메소드에서 접근 가능
	private String owner;
	private String phoneNum;
	
	//클래스 변수 : static 변수
	//프로그램 최초 실행시 메모리 staitc 영역에 적재됨
	//static 영역도 초기값을 설정하지 않으면,
	//타입별 기본값으로 세팅
	//static 특성상 공용자원으로 많이 사용됨.
	//객체 생성 없이도 접근 가능
//	public static int width = 50;
//	public static int height = 100;
	
	//공유 목정의 상수인 경우
	//반드시 초기화 할 것.
	//자바 언어 관례상 상수는 모두 대문자로 표기한다.
	//eclipse에서 ctrl + shift + x -> 대문자로, y -> 소문자로
	public static final int WIDTH = 50;
	public static final int HEIGHT = 100;
	
	
	public String getOwner() {
		return owner;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	/**
	 * 메소드 영역에서는 전역변수(필드)를 참조할 수 있다.
	 */
	public void heySiri() {
		System.out.println(owner+"님 안녕하세요.");
		System.out.println("당신의 번호는 "+phoneNum+"입니다.");
		
		//지역변수
		//접근제어자 / static 키워드 사용 불가
		//지역변수는 반드시 값 대입후 사용해야한다.
		int num1 = 100;
		int num2 = 200;
		System.out.println("num1 X num2 = "+num1*num2);
	}
	/**
	 * 매개변수도 하나의 지역변수이다.
	 * 메서드 호출시 값이 넘어오기 때문에,
	 * 값을 대입하지 않고 사용할 수 있다.
	 * @param a
	 * @param b
	 */
	public void heySiri(int a, int b) {
		System.out.println(a+"와 "+b+"의 합은 "+(a+b)+"입니다.");
	}
}
