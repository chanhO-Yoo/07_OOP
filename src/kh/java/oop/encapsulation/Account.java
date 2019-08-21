package kh.java.oop.encapsulation;

//필드 값 : private
//메서드 : public
//private인 필드 값을 public인 메서드를 통해서 사용한다.

public class Account {
	
	//private 접근제어자는 현재 클래스 외에서는 접근 불가능
	private String name; //예금주
	private long balance;//잔액
	
	//값 세팅 메서드 setter
	public void setName(String inputName) {
		name = inputName;
	}
	public void setBalance(long inputBalance) {
		balance = inputBalance;
	}
	
	//값 읽기 메서드 getter
	//리턴타입과 해당 필드의 데이터 타입이 동일해야 된다.
	public String getName() {
		return name;
	}
	public long getBalance() {
		return balance;
	}
	
	//입금 메서드
	public void deposit(long money) {
		if(money > 0) {
			balance += money;
			System.out.println(name+"님의 현재 잔액은 "+balance+"원입니다.");			
		}
		else {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
	}
	
	//출금 메서드
	public void withdraw(long money) {
		if(balance < money) {
			System.out.println("잔액이 부족합니다.");
		}
		else if(money < 0) {
			System.out.println("잘못된값을 입력하셨습니다.");
		}
		else {
			balance -= money;
			System.out.println(name+"님의 현재 잔액은 "+balance+"원입니다.");	
		}
	}
}
