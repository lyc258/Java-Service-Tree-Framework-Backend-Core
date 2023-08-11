package com.arms.Hanara.ch05;

import java.util.Arrays;

public class Problem5_5 {
	public static void main(String[] args) {
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		// ballArr . 배열 의 임의의 요소를 골라서 위치를 바꾼다
		for (int i = 0; i < ballArr.length; i++) {
			int j = (int) (Math.random() * ballArr.length);
			int tmp = 0;
			
			System.out.println(tmp);
			tmp = ballArr[i];
			System.out.println("tmp=========================" + tmp); // 1 // 2 
			 
			ballArr[i] = ballArr[j]; 
			System.out.println("ballArr[j]=========================" +ballArr[j]);
			System.out.println("ballArr[i]=========================" +ballArr[i]);
			
			 ballArr[j] = tmp; // 자리 바꾸기
			 System.out.println("tmp=========================" + tmp);
			 System.out.println("ballArr[j]=========================" +ballArr[j]); 
			System.out.println();
			System.out.println(Arrays.toString(ballArr));
		}
		
		System.arraycopy(ballArr,0, ball3,0,3);
	 
		for (int i = 0; i < ball3.length; i++) {
			System.out.print(ball3[i]);
		}
	}  
}  