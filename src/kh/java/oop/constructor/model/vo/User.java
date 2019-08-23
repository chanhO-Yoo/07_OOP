package kh.java.oop.constructor.model.vo;

/*
 * 생성자(constructor)
 * 
 * new연산자를 통해 호출되는 메서드
 * 클래스를 인스턴스화 하고,
 * 필드에 대한 초기화를 담당한다.
 * 
 * 기본 생성자()
 *   - 파라미터 생성자를 작성하지 않는다면
 *   - jvm이 자동으로 기본생성자를 작성해준다. = 생략이 가능하다.
 *   - 단, 파라미터 생성자를 작성했다면,
 *     명시적으로 기본 생성자를 작성할 것.
 *     
 * 파라미터 생성자(int i,...)
 *   - 전달받은 인자값을 필드에 대입, 객체를 초기화한다.
 *   
 * 기본생성자가 필요한 이유
 *   - 상속시 자식클래스가 부모클래스의 기본생성자를 호출함
 *   - jsp bean객체가 기본생성자를 호출해 bean생성
 *   - spring에서 DI시에도 기본 생성자 호출
 *   
 *   VO : Value Object
 *   
 *   
 */
public class User {
	
	private String userId;
	private String userName;
	private int age;
	private boolean isMarried;
	
	//기본생성자
	//클래스명과 생성자 메서드명은 동일하다.
	//리턴 타입이 없다.
	public User() {
		
	}
	
	public User(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	public User(String userId, String userName, int age, boolean isMarried) {
		//필드의 초기화
//		this.userId = userId;
//		this.userName = userName;
		//다른 생성자 호출해서 중복된 코드제거
		//this()는 메서드 가장 첫줄에 한번만 사용가능
		this(userId,userName);
		this.age = age;
		this.isMarried = isMarried;

	}
	
	public void printUser() {
		System.out.println(userId+", "+userName+", "+age+", "+isMarried);
	}
	
	
	//getter & setter
	public String getUserId() {
		return userId;
	}
	public String getUserName() {
		return userName;
	}
	public int getAge() {
		return age;
	}
	//boolean타입에 한해서
	//필드가 married인 것처럼 메소드명을 지을것
	//단 시작은 get이 아니라 is로 작성할 것.
	public boolean isMarried() {
		return isMarried;
	}
	
	public void setUesrId(String userId) {
		this.userId = userId;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//boolean타입에 한해서
	//필드가 married인 것처럼 메소드명을 지을것
	//단 시작은 get이 아니라 set으로 작성할 것.
	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}
	
	
}
