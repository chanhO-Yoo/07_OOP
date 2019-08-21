package kh.java.oop.encapsulation;

public class AccountMain {
	public static void main(String[] args) {
		//은행 게좌 객체 생성
		
//		//1.캡슐화 전
//		//홍길동의 계좌
//		Account hongAcc = new Account();
//		
//		hongAcc.name = "홍길동";
//		hongAcc.balance = 1_000_000;
		
//		//입금
//		hongAcc.balance += 500_000;
//		System.out.println(hongAcc.name+"님의 현재 잔액은 "+hongAcc.balance+"원입니다.");
//		
//		//출금
//		hongAcc.balance -= 50_000;
//		System.out.println(hongAcc.name + "님의 현재 잔액은 "+hongAcc.balance+"원입니다.");

//		===========================================
		
		//2. 캡슐화 후
		//홍길동의 계좌
		Account hongAcc = new Account();
		
		//초기화 setter이용
		hongAcc.setName("홍길동");
		hongAcc.setBalance(1_000_000);
		
		//조회 getter이용
		System.out.println(hongAcc.getName() + "님의 현재 잔액은 "+hongAcc.getBalance()+"원입니다.");
		
		//입급
		hongAcc.deposit(500_000);
		
		//출금
		hongAcc.withdraw(-50_000);
		hongAcc.withdraw(50_000);
		hongAcc.withdraw(50_000_000);
	}
}
