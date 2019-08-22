package kh.java.oop.acess.modifier;

public class Main {
	public static void main(String[] args) {
		AccessModifierVO a = new AccessModifierVO();
		
		//같은 패키지인 경우
		System.out.println(a.var1);//public
		System.out.println(a.var2);//protected
		System.out.println(a.var3);//default
//		System.out.println(a.var4);//private
	}
}
