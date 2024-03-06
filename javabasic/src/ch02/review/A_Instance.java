package ch02.review;

public class A_Instance {

	public static void main(String[] args) {

//		객체(인스턴스): 클래스에 정의된 대로 만들어진 독립적인 실체
//		클래스로 '생성'하는 작업이 이루어짐.
//		new 연산자를 사용하여 생성 - new 클래스명();
		ExampleClass instance = new ExampleClass();
		
//		참조: 아래 코드는 변수를 선언
		int number;
		ExampleClass example;
		
//		참조: 아래 코드가 인스턴스 생성
		new ExampleClass();
		
//		인스턴스의 변수와 메서드 접근 혹은 호출: 인스턴스.변수 / 인스턴스.메서드()
		instance.instanceVariable = 0;
		instance.instanceMethod();
		new ExampleClass().instanceVariable = 0;
		
//		참조 아래 코드는 인스턴스가 복사된 것이 아니라 인스턴스의 주소가 복사되어 할당 하는 것
		ExampleClass anotherInstance = instance;
		
	}

}
