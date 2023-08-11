package com.arms.Hanara.ch04;

public class Problem4_14 {
	public static void main(String[] args) {
 
		int answer;
		 
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
 
		java.util.Scanner s = new java.util.Scanner(System.in);
		answer = (int)(Math.random() * 99) + 1; 
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요:");
			
			System.out.println(answer);
			input = s.nextInt();  
			
			if(answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if(answer > input){
				System.out.println("더 큰 수를 입력하세요.");
			} else {
				System.out.println("맞췃습니다 시도횟수는" + count + "번 입니다!!");
				break;
			}
			
			 
			
		} while (true);  
		
	}  
}  
