package ch02.review;

class ConstructorClass{
	
	int instanceVariable1;
	double instanceVariable2;
	
//	생성자: 클래스의 인스턴스를 생성할 때 호출되는 메서드
//	생성할 때 실행할 코드를 구현한 메서드, 일반적으로인스턴스 변수 초기화 작업에 사용
//	생성자를 개발자가 직접 작성하지 않으면 자바가 기본 생성자를 자동으로 생성
//	규칙
//	1. 클래스명과 동일한 이름을 가져야함
//	2. 반환탑입을 지정하지 않음
//	3. 인스턴스 생성 후에 사용할 수 없음.
	ConstructorClass(){
//		아래와 같은 상황을 '의존성을 내부에서 주입한다' 라고 함.
//		의존성을 내부에서 주압하는 사황을 지양해야 함.
		this.instanceVariable1 = 10;
		this.instanceVariable2 = 9.9;
	}
	
//	생성자도 메서드이기 때문에 오버로딩이 가능
	ConstructorClass(int instanceVariable1){
//		this: 현재 인스턴스 혹은 클래스를 가리키는 키워드
//		글로벌 위치에 있는 변수 혹은 메서드를 지칭할 때 사용
		this.instanceVariable1 = instanceVariable1;
	}
	
	ConstructorClass(int instanceVariable1, double instanceVariable2){
//		this(): 현재 클래스의 다른 생성자를 호출하는 키워드
		this(instanceVariable1);
		this.instanceVariable2 = instanceVariable2;
		
	}

}

public class A_Constructor {

	public static void main(String[] args) {
		
//		생성자 사용
		ConstructorClass instnace1 = new ConstructorClass();
		ConstructorClass instnace2 = new ConstructorClass(1);
		ConstructorClass instnace3 = new ConstructorClass(1, 1.1);



		
	}

}
