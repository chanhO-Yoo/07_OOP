package kh.java.oop.furniture;

public class Bed {
	String name;
	int price;
	String size;
	String color;
	int drawerCount;
	String frameMeterial;
	String mattressMetreial;
	
	
	public void information() {
		System.out.println("상품명 : "+name);
		System.out.println(" 가격  : "+price);
		System.out.println("사이즈 : "+size);
		System.out.println(" 색상  : "+color);
	}
}
