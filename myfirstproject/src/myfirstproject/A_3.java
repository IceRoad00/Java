package myfirstproject;

import java.util.Scanner;

public class A_3 {
	
	int solution(int number) {
		return 0;
	}

	public static void main(String[] args) {
		
		int number = 0;
		int sum = 0;	
		
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		
		while(number > 0) {
			sum += number % 10;
			number /= 10;	
		}
		
		System.out.println(sum);
		
	}
 
}
