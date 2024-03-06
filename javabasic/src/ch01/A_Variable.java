package ch01;

public class A_Variable {

	public static void main(String[] args) {

//		변수(Variable)
//		데이터를 저장하는 공간, 변수는 지정한 타입의 데이터만 할당할 수 있다.
		
//		선언: 변수를 생성
//		데이터타입 변수명;
		int number; 
		
//		초기화: 변수에 초기 값을 할당하는 것
//		변수명 = 데이터;
		number = 10;
		number = 50;
		
//		선언과 동시에 초기화
		double pie = 3.14;
		
//		변수에 지정한 타입의 데이터가 아니면 할당이 불가능
//		number = 3.14;
		
//		변수를 선언한 후 반드시 초기화 이후에 사용할 수 있다.
//		int age;
//		System.out.println(age);
		
//		변수 명령 규칙
//		1. 중복된 변수명을 사용할 수 없다.
		boolean flag;
//		int flag;
		
//		2. 숫자로 시작할 수 없다.
//		int 1age;
		int age1;
		
//		3. 연산자로 사용되는 특수문자를 포함할 수 없다.
//		int age+;
		int age$_;
		
//		4. 키워드 단어만으로는 사용할 수 없다.
//		int int;
		int int1;
		
//		암묵적 룰
//		띄워쓰기 표현
//		- Camel Case: 띄워쓰기를 표현할 때 띄워쓰기를 제거하고 바로 뒤 문자를 대문자로 표현
		String smartPhone;
//		- Snake Case: 띄워쓰기를 표현할 때 띄워쓰기 자리에 _로 표현
		String smart_phone;
//		- Upper ~ : 대문자 표현
//		- Lower ~ : 소문자 표현

//		- UpperCamelCase : 첫문자를 대문자로 시작(클래스, 인터페이스)
//		- lowerCamelCase : 첫문자를 소문자로 시작(변수, 메서드)컴파일 언어
//		- UPPER_SNAKE-CASE : 모든 문자를 대문자로 작성(상수)
//		- lower_snake_case : 모든 문자를 소문자로 작성(변수, 메서드)스크립트 언어
		
//		상수(Constant)
//		초기화가 이루어지면 그 값을 변경 할 수 없는 변수
//		변수 선언 시 데이터 타입 앞에 final 키워드를 붙여서 선어
//		final 데이터타입 변수명(상수명);
		final int MAX;
		MAX = 100;
		final int MIN = -100;
		
//		상수는 한번 할당 후 재할당 불가능
//		MAX = 200;
		
		double size1 = 146.6*70.6;
		
//		상수를 사용하는 이유: '리터럴'에 이름을 붙여주기 위한 용도로 가장 많이 사용됨.(가독성 향상)
		final double IPHONE_15_PRO_HEIGHT = 146.6;
		final double IPHONE_15_PRO_WIDTH = 70.6;
		
		double size2 = IPHONE_15_PRO_HEIGHT * IPHONE_15_PRO_WIDTH;
		
//		리터럴: 값 그 자체
//		int number = 10; 이라는 구문에서 '10'이 리터럴 상수;
//		10 = 12;
		
		
	}

}
