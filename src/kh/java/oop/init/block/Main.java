package kh.java.oop.init.block;

public class Main {
	public static void main(String[] args) {
		InitBlockSample i = new InitBlockSample();
		System.out.println(i.getNum());
		
		System.out.println("---------------------------");
		
		InitBlockSample i2 = new InitBlockSample(9999);
		System.out.println(i2.getNum());
		
		
	}
}
