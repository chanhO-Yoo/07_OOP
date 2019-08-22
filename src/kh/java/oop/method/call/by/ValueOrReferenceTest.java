package kh.java.oop.method.call.by;

import java.util.Arrays;

public class ValueOrReferenceTest {

	public static void main(String[] args) {
		int a = 9;
		int[] b = {1,2,3,4,5};
		
		ValueOrReferenceTest v = new ValueOrReferenceTest();
		
		//1.call by value
		v.test(a); //test(9)
		//기본형은 변수 값을 가져와서 사용
		//값을 복사해서 사용한다.
		//a라는 결과값에는 변화가 없다.
		System.out.println(a);
		
		//2.call by reference
		v.test(b);
		//참조형은 값의 주소를 저장
		//해당하는 주소에서 값을 변경
		System.out.println(Arrays.toString(b));
		
	}
	
	//메서드 오버로딩
	public void test(int num) {
		num *= 100;
	}

	//메서드 오버로딩
	public void test(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] *= 100;
		}
	}
}
