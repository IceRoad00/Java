package ch02;

// 상속: 객체지향 프로그래밍의 특성 중 하나
// 원래 존재하던 클래스를 확장하여 재사용할 수 있도록 하는 것
// 코드 중복을 제거하며 확장성을 높을 수 있음
// extends 키워드를 사용하여 확장
 
// class SubClass extends SueprClass{}
class Human{
	String name;
	int age;
	
	void sleep () {
		System.out.println(name + "가 잠을 주무십니다.");
}
	
class Animal {
	String species;
	
	void sleep() {
		System.out.println("잠을 잡니다.");
	}
}
}

// Java 에서는 클래스의 단일 상속만 지원함
// 다이아몬드 문제를 방지하기 위함
// 다이아몬드 문제: 다중 상속을 했을 때 발생하는 메서드 호출의 모호성
// 아래 코드에서는 "extends Human, Animal" 형태로 다중 상속을 할 수 없음
class Teacher extends Human{
	String course;
	
	void teach () {
		System.out.println(name + "가 " + course + "를 가르칩니다.");
	}
}

class Developer extends Human{
	String position;
	
	void develop() {
		System.out.println(name + "가 " + position + " 개발을 합니다.");
	}
}
// 모든 클래스는 'Object'라고 하는 최상위 클래스를 반드시 상속 받고 있음

public class B_Inheritance {

	public static void main(String[] args) {

		Human human1 = new Human();
		human1.name = "홍길동";
		human1.age = 0;
		human1.sleep();
		
		Teacher teacher1 = new Teacher();
		teacher1.name = "김철수";
		teacher1.age = 10;
		teacher1.course =  "국어";
		teacher1.sleep();
		teacher1.teach();
		
		Developer developer1 = new Developer();
		developer1.name = "이영희";
		developer1.age = 20;
		developer1.position = "백엔드";
		developer1.sleep();
		developer1.develop();
}}