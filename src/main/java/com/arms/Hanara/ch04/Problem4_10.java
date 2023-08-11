package com.arms.Hanara.ch04;

public class Problem4_10 {
	public static void main(String[] args) {
		int num = 6789;
		int sum = 0;
		while (num > 0) {
			sum += num % 10;
			System.out.println(num / 10); 

			num /= 10;
		
		}
		System.out.println("sum=" + sum);
	}
}