package ch03;

import java.util.ArrayList;
import java.util.List;

// 제너릭: 클래스나 메서드에서 사용할 데이터 타입을 외부에서 받아오는 기법

// Test1, Test2 형태로 클래스를 사용하게 되면 코드의 중복이 발생함.
class Test1{
	String subject;
	int score;
}
class Test2{
	String subject;
	String score;
}

// Test3 형태로 클래스를 사용하게 되면 타입의 안정성이 떨어짐.
class Test3{
	String subject;
	Object score;
}

// 제너릭 클래스: 클래스 내부에 있는 데이터 타입을 외부에서 받아오려고 할 때 사용
// class 클래스명<매개타입>{} {매개타입 변수명;...}
class Test4<T>{
	String subject;
	T score;
}

class Test5 {
	
//	제너릭 메서드: 해당 메서드의 매개변수의 타입이나 반환 타입에서 사용할 타입을 외부에서 받아오려고 할 때 사용
//	<매개타입> 반환타입 메서드명 (<매개타입> 매개변수) {...}
	static <T> void method(List<T> arg) {
		System.out.println(arg);		
	}
	
//	?: 와일드카드로 제너릭에 대해서 모든 타입을 받을 수 있도록 함
	static void wildCardMethod(List<?> arg) {
		System.out.println(arg);
	}
	
//	? extends 클래스명: 특정 클래스 혹은 특정 클래스를 확장한 클래스만 제너릭으로 받을수 있도록 제한함
//	(본인클래스 또는 자손클래스)
	static void extendMethod(List<? extends MyClass> arg) {
		System.out.println(arg);
	}
	
//	? super 클래스명: 특정 클래스 혹은 특정 클래스가 확장한 클래스만 제너릭으로 받을 수 있도록 제한함
//	(본인클래스 또는 조상클래스)
	static void superMethod(List<? super MyClass> arg) {
		System.out.println(arg);
	}
}

class SuperClass{
	
}

class MyClass extends SuperClass{
	
}

class SubClass extends MyClass{
	
}
public class C_Generic {

	public static void main(String[] args) {
		
		Test3 myTest = new Test3();
		myTest.subject = "국어";
		myTest.score = 95;
		
		Test3 yourTest = new Test3();
		yourTest.subject = "경영학원론";
		yourTest.score = "A+";
		
//		myTest.score
		
		Test4<Integer> hisTest = new Test4<> ();
		hisTest.score = 94;
//		hisTest.score = "A+";
		
		Test4<String> herTest = new Test4<> ();
		herTest.score = "A+";
		
		hisTest.score++;
		
		List<String> arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("B");
		arrayList1.add("C");
		
		List<Boolean> arrayList2 = new ArrayList<>();
		arrayList2.add(true);
		arrayList2.add(false);
		arrayList2.add(true);

		Test5.method(arrayList1);
		Test5.method(arrayList2);
		
		Test5.wildCardMethod(arrayList1);
		Test5.wildCardMethod(arrayList2);
		
		SuperClass superClass = new SuperClass();
		MyClass myClass = new MyClass();
		SubClass subClass = new SubClass();
		
		List<SuperClass> superList = new ArrayList<>();
		superList.add(superClass);
		List<MyClass> myList = new ArrayList<>();
		myList.add(subClass);
		List<SubClass> subList = new ArrayList<>();
		subList.add(subClass);
		
		Test5.wildCardMethod(superList);
		Test5.wildCardMethod(myList);
		Test5.wildCardMethod(subList);
		
//		Test5.extendMethod(superList);
		Test5.extendMethod(myList);
		Test5.extendMethod(subList);
		
		Test5.superMethod(superList);
		Test5.superMethod(myList);
//		Test5.superMethod(subList);

	}

}

