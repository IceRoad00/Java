package myfirstproject;

import java.util.Scanner;

class Solution{
	int solution(int arg) {
		return -1;
	}
}

public class A_1 {
	
	Scanner scan = new Scanner(System.in);
	
	Solution solution = new Solution();
	
	 public int solution(int[] numList) {
	        int answer = -1;
	        
	        for(int index = 0; index <numList.length; index++) {
	        	answer = scan.nextInt();       	
	            if(numList[index] < 0) {
	                answer = index;
	                break;
	            }
	        }
            System.out.println(numList);
			return answer;
	 }
}
