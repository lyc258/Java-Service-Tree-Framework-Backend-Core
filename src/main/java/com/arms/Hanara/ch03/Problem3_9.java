package com.arms.Hanara.ch03;

public class Problem3_9 {
	public static void main(String[] args) {
		char ch = 2;
		boolean result = (Character.isLowerCase(ch) || Character.isUpperCase(ch) &&  ch == (int)ch);
		System.out.println(result);
	
	}
}
