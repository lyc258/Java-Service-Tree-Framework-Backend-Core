package com.arms.Hanara.ch03;

public class Problem3_10 {

	public static void main(String[] args) {
		char ch = 'c'; // 32빼기
		char lowerCase = ('A' <= ch && ch <= 'Z') ? (char)(ch+32): ch;

		char lowerCase1 = Character.toLowerCase(ch);
		
		System.out.println("ch:"+ch); //A 65
		System.out.println("ch to lowerCase:"+lowerCase1); 

		System.out.println("ch to lowerCase:"+lowerCase);
		}
}
