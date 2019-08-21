package kh.java.oop.student;

public class Main {

	public static void main(String[] args) {
		
		//캡슐화 전
		
//		//클래스를 바탕으로 객체 생성
//		
//		//홍길동 학생 객체
//		Student hong = new Student();
//		
//		//속성값(필드) 대입
//		hong.name="홍길동";
//		hong.gender='남';
//		hong.age=300;
//		hong.address="서울";
//		
//		//기능(메서드) 호출
//		hong.introduce();
//		
//		
//		//개인정보 객체 생성
//		Student my = new Student();
//		
//		//개인정보 필드(속성값) 대입
//		my.name="이름";
//		my.no=100;
//		my.age=123;
//		my.gender='남';
//		my.address="서울";
//		
//		//개인정보 메서드(기능) 호출
//		my.introduce();
//		
//		Student s = new Student();
//		s.introduce();
		
		//캡슐화 후
		//객체 생성
		Student s = new Student();
		
		//setter를 이용해 값 지정
		s.setName("홍길동");
		s.setNo(250);
		s.setGender('남');
		s.setAge(30);
		s.setAddress("서울");
		
		s.introduce();
		
		System.out.println("==============================================================");
		String str = "안녕하세요. "+s.getNo()+"번 "+s.getName()+"입니다. 저는 "+s.getGender()+"자입니다. "+s.getAge()+"살 입니다."+s.getAddress()+"에 삽니다.";
		System.out.println(str);
		
		
	}

}
