package kh.java.oop.field;

public class Run {
	public static void main(String[] args) {
		//3. 클래스 변수(static) : 프로그램이 끝날 때 까지 존재한다.
//		System.out.println(IPhone.width);
//		System.out.println(IPhone.height);
		
		//1.멤버 변수/인스턴스 변수
		IPhone hongPhone = new IPhone();//new를 만나야지 객체가 만들어지고 멤버변수가 만들어진다.
		//현재 owner와 phoneNum에는 null이 들어있다.
		
		hongPhone.setOwner("홍길동");
		hongPhone.setPhoneNum("010-1234-1234");
		//owenr와 phoneNum이 set한 값으로 변경된다.
//		System.out.println("객체에서 접근 : "+hongPhone.width);//추천하지는 않는다.
		//static 변수 -> 클래스명.필드명; 으로 사용을 추천
		
		
		
		//2.지역변수
		hongPhone.heySiri();
		hongPhone.heySiri(10,20);
		//num1과 num2는 사라진다.
		
		IPhone sinsaPhone = new IPhone();
		sinsaPhone.setOwner("신사임당");
		sinsaPhone.setPhoneNum("010-1234-5678");
//		System.out.println("객체에서 접근 : "+sinsaPhone.width);
//		IPhone.width = 200;//static식 접근법, 클래스명.필드명;
		//final 필드 변수의 경우, 상수로 변경할 수 없다.
		
		System.out.println("-------- 프로그램 종료 --------");
	}
}
