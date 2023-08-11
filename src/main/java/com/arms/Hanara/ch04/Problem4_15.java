package com.arms.Hanara.ch04;

public class Problem4_15 {
	public static void main(String[] args) {
		int number = 50686; // 13531
		int tmp = number;
		int result = 0;  

		while (tmp != 0) {
			
			result = result * 10 + tmp % 10; 
			tmp /= 10;
			System.out.println(result);
		}
		if (number == result)
			System.out.println(number + "  는 회문수 입니다.");
		else
			System.out.println(number + " 는 회문수가 아닙니다.");
	} 
	     //System.out.println(50386 % 10);
		 //System.out.println(5038 % 10);
		 //System.out.println(503 % 10);
		 //System.out.println(50 % 10);
		 //System.out.println(5 % 10);
}
