package ch01;

import java.util.Scanner;

public class ConsoleIO {

	public static void main(String[] args) {
		
//		콘솔 출력
//		System 클래스의 out 객체의 print(), println()
//		print() : 출력이 끝나고 줄바꿈을 하지 않음.
//		println() : 출력이 끝나고 줄바꿈을 진행함.
		String name = "John Doe";
		System.out.println(name);
		System.out.println(name);
		
//		콘솔 입력
//		java.utill.Scanner 클래스의 객체를 생성해서 nextXXXX() 메서드로 입력을 받음.
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		
		int age = scanner.nextInt();
		
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		
		scanner.close();
		
	}

}

