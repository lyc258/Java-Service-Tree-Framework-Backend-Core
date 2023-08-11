package com.arms.Hanara.ch04;

public class Problem4_13 {
	public static void main(String[] args) {
		String value = "1i2349+";
		char ch = ' ';
		boolean isNumber = true;

		for (int i = 0; i < value.length(); i++) {
				int a = value.charAt(i);
				if(a >= 48 && a <= 57) {
					isNumber = true;
				} else {
					isNumber = false;
					break;
				}
		}
		if (isNumber) {
			System.out.println(value + " 숫자입니다.");
		} else {
			System.out.println(value + "숫자가 아닙니다.");
		}
	} 
} 
