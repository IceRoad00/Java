package ch01;

import java.util.Scanner;

public class C_Operator {

	public static void main(String[] args) {

//		연산자
		int a = 15;
		int b = 7;
		double c = 15.0;
		double d = 7.0;
		
		int intResult;
		double doubleResult;

//		산술연산자: 사칙연산 작업 숫자 데이터에 대해서  연산을 수행

//		더하기: +
//		좌항에 우항을 더한 값을 반환
		intResult = a + b;
		doubleResult = c + d;
		
		doubleResult = a + b;
		intResult = (int) (c + d);
		
//		정수 + 실수 = 실수
		doubleResult = a + d;
		
//		빼기: -
//		좌항에 우항을 뺀 결과를 반환
		intResult = a - b;
		doubleResult = c - d;
		
//		정수 - 실수 = 실수
		doubleResult = a - d;
		
//		곱하기: *
//		좌항에 우항을 곱한 결과를 반환
		intResult = a * b;
		doubleResult = c * d;
		
//		정수 * 실수 = 실수
		doubleResult = a * d;
		
//		나누기: /
//		좌항에 우항을 나눈 결과를 반환
//		정수 / 정수 = 결과는 실수부가 버려짐
		intResult = a / b;
		System.out.println(intResult);
		doubleResult = c / d;
		System.out.println(doubleResult);
		doubleResult = a / d;
		System.out.println(doubleResult);
		
//		나머지: %
//		좌항에 우항을 나눈 나머지를 반환
		intResult = a % b;
		doubleResult = c % d;
		System.out.println(intResult);
		System.out.println(doubleResult);
		
//		증감 연산자
//		피연산자의 값을 1 증가 혹은 감소
//		증감 연산자: ++
//		감소 연산자: --
		int number = 5;
		intResult = ++number + 5; // 11
		intResult = number++ + 5; // 10 {number 값에서 증가가 되서 6으로 됨.}
		System.out.println(intResult);
		
//		대입(할당) 연산자: 좌항에 우항을 할당
		
//		일반 대입 연산자: =
//      상수에 초기화를 할때를 제외하고 좌항이 반드시 변수이어야 한다.
//		좌항에 우항을 할당
		number = 10;
//		11 = 10;
		
//		복합 대입 연산자: 산술연산=
//		좌항에 사용되는 변수는 반드시 초기화가 되어 있어야 함.
//		좌항에는 변경가능한 일반 변수가 와야함.(상수 불가능)
//		좌항에 우항을 연산한 결과를 좌항에 할당
		number += 10;
		number -= 7;
		
//		우항을 먼저 연산한 후 좌항에 할당, 우선적인 결과는 ()로 지정함.
		number *=  (7 - 5);
		System.out.println(number);
		
//		int number1;
//		number1 += 10;
		
//		비교 연산: 좌항과 우항을 비교하여 결과를 논리값으로 반환
		boolean booleanResult;
		
//		== 같다, 다르다 연산
//		==: 좌항과 우항이 같으면 true, 다르면 false
//		!=: 좌항과 우항이 다르면 true, 같으면 false
		booleanResult = a == b;
		System.out.println(booleanResult);
		booleanResult = a != b;
		System.out.println(booleanResult);
		
		String string1 = "Hello";
		booleanResult = string1 == "Hello";
		System.out.println(booleanResult);
		
//		작다, 작거나 같다 연산
//		<: 좌항이 우항보다 작으면 true, 같거나 크면 false
//		<=: 좌항이 우항보다 작거나 같으면 true, 크면 false
		booleanResult = a < c;
		System.out.println(booleanResult);
		booleanResult = a <= c;
		System.out.println(booleanResult);
		
//		크다, 크거나 같다 연산
//		>: 좌항이 우항보다 작으면 true, 같거나 크면 false
//		>=: 좌항이 우항보다 작거나 같으면 true, 크면 false
		booleanResult = a > c;
		System.out.println(booleanResult);
		booleanResult = a >= c;
		System.out.println(booleanResult);
		
//		논리 연산자: 피연산자가 모두 논리형태로 논리 값을 조합하는 것
//		&&: AND 연산 - 좌항과 우항이 모두 true이면 true(뒤 값은 계산하지 않음), 하나라도 false이면 false
		booleanResult = false && false;
	    System.out.println(booleanResult);
	    booleanResult = a < b && c > d;
	    System.out.println(booleanResult);
	    
//	    ||: OR 연산 - 좌항과 우항이 하나라도 true이면 true, 모두 false면 false(뒤 값은 계산하지 않음)
	    booleanResult = true || false;
	    System.out.println(booleanResult);
	    booleanResult = a < b || c < d;
	    System.out.println(booleanResult);
	    
//	    a : 15, b : 7
	    booleanResult = (a > b) && (a <  ++b);
	    System.out.println(booleanResult);
	    System.out.println(b);
	    
	    booleanResult = (a < b) || (a > ++b);
	    System.out.println(booleanResult);
	    System.out.println(b);
	    
//	    삼항 연산자: 간단한 조건에 따라 결과를 반환하는 연산자
//	    조건(논리식) ? 참일 때 결과 : 거짓일 때 결과
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("나이 : ");
	    
	    int age = scanner.nextInt();
	    
	    String stringResult = age > 19 ? "성인" : "미성년자";
	    System.out.println(stringResult);
	    	    
	    
	}

}

