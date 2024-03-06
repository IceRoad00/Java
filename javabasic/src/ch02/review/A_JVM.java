package ch02.review;

// JVM의 메모리 구조
// 메서드 영역: 모든 쓰레드가 공유하며 클래스의 구조 정보와 static으로 선언된 변수 혹은 메소드가 저장되는 공간
// 힙 영역: 모든 쓰레드가 공유하며 클래스로 생성된 인스턴스와 배열이 저장되는 공간(gabage collection)
// 스택 영역: 각 쓰레드 별로 존재하는 공간, 로컬 변수나 메서드 호출 데이터가 저장되는 공간(각 메서드가 종료되면 제거됨.)

// 아래와 같은 클래스의 구조 정보는 '메서드'에 저장된다.
class Class{
//	클래스 변수의 데이터는 '메서드 영역'에 저장된다.
	static int staticVariable;
//	인스턴스 변수는 구조 정보만 '메서드 영역'에 저장된다.
	int instanceVariable;
	
//	클래스 메서드의 구현 데이터는 '메서드 영역'에 저장된다. 
	static void staticMethod() {}
//	인스턴스 메서드는 구조 정보만 '메서드 영역'에 저장된다.
	void instanceMethod() {}
	
}

public class A_JVM {

//	메인 메서드가 실행되면 실행 시 필요한 데이터는 '스택 영역'에 저장된다.
	public static void main(String[] args) {

//		지역 변수의 메모리 데이터는 '스택 영역'에 저장된다.
		int number = 0;
		
//		지역 참조 변수는 '스택 영역'에 저장된다.
//		실제 인스턴스는 '힙 영역'에 저장된다.
		Class instance = new Class();
		
//		호출한 메서드가 실행되면 실행 시 필요한 데이터는 '스택 영역'에 저장된다.
//		호출한 메서드가 중료되면 스택 영역에서 자동ㅇ로 제거된다.
		instance.instanceMethod();
	}

}
