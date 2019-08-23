package kh.java.oop.constructor;

import kh.java.oop.constructor.model.vo.User;

public class UserMain {

	public static void main(String[] args) {
		//기본생성자로 객체 생성
		User u = new User();
		//setter 메서드를 사용해서 초기화
		u.setUesrId("Sinsa");
		u.setUserName("신사임당");
		u.setAge(50);
		u.setMarried(true);
		u.printUser();
		
		//파라미터생성자로 객체 생성
		User u2 = new User("honggd", "홍길동", 30, true);
		u2.printUser();
		
		User u3 = new User("Leess","이순신");
		u3.printUser();
	}

}
