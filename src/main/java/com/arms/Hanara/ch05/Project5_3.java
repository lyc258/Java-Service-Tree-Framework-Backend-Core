package com.arms.Hanara.ch05;

import java.util.Arrays;

public class Project5_3 {

	public static void main(String[] args) {
	int[] array = {10,20,30,40,50};
	int sum = 0;
	for(int item : array) {
		sum += item;
	}
	
	System.out.println(Arrays.toString(array));
	System.out.println("sum = " +sum);

	}

}
