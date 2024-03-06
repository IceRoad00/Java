package ch02;

// 오버라이딩: 하위 클래스에서 상위 클래스의 메서드를 재정의 하는 것
// 규칙
// 1. 상위 클래스에서 선언된 메서드와 메서드 이름, 매개변수의 조합이 같아야함.
// 2. 상위 클래스에서 선언된 메서드가 final로 선언되면 재정의가 불가능
// 3. 상위 클래스에서 선언된 메서드보다 더 좁은 범위의 접근 제어를 할 수 없음

class SuperClass1{
	
	int superInstanceVariable;
	
	SuperClass1 (int superInstanceVariable){
		this.superInstanceVariable = superInstanceVariable;
	}
	
	void instanceMethod() {
		System.out.println("조상 클래스의 메서드입니다.");
	}
}

class SubClass1 extends SuperClass1{
	
//	void instanceMethod() {
//		System.out.println("SubClass1의 인스턴스 메서드입니다.");
//	}
	
//	SuperClass1을 상속한 상태에서는 아래 메서드를 가지고 있음
//	void instanceMethod() {...}
	
//	'void instanceMethod ()' 메서드를 이미 가지고 있기 때문에
//	아래 메서드는 'void instanceMethod ()' 메서드를 오버로드 한 것
	void instanceMethod(String string){
		System.out.println(string);
	}
	
//	부모 클래스에서 기본 생성자가 없다면 자식 클래스에서 생성자에서 
//	반드시 부모 클래스의 생성자를 호출해야함
	SubClass1(){
//		super(): 부모 클래스의 생성자를 호출하는 키워드
		super(10);
	}
}

class SubClass2 extends SuperClass1{
	
    SubClass2 (int superInstanceVariable){
    	super(superInstanceVariable);
    }
	
//	@Override: 컴파일러에게 아래에 오는 메서드가 오버라이드 메서드라는 것을 알려주는 것
//	가독성 향상과 개발자의 실수를 방지할 수 있음
	@Override
	void instanceMethod() {
//		super 키워드: 자손 클래스에서 조상클래스의 필드 혹은 메서드에 접근할 때 사용
		super.instanceMethod();
		System.out.println("SubClass2의 인스턴스 메서드입니다.");
}
}

public class B_Overriding {

	public static void main(String[] args) {

		SuperClass1 instance1 = new SuperClass1(0);
		SubClass1 instance2 = new SubClass1();
		SubClass2 instance3 = new SubClass2(50);
		
//		instance1.instanceMethod();
//		instance2.instanceMethod();
		instance3.instanceMethod();
		
		System.out.println(instance1.superInstanceVariable);
		System.out.println(instance2.superInstanceVariable);
		System.out.println(instance3.superInstanceVariable);
	}
}
