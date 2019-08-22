package kh.java.oop.acess.modifier;

public class AccessModifierVO {

	public int var1 = 1; //패키지 상관없이 사용가능
	protected int var2 = 2; //같은 패키지 내에서는 default, 다른 패키지에서는 상속해서 사용
	int var3 = 3; // 같은 패키지 내에서만 사용가능
	private int var4 = 4; //같은 클래스 내에서만 사용가능
}
