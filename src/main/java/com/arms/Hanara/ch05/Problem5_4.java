package com.arms.Hanara.ch05;

import java.util.Arrays;

public class Problem5_4 {

	public static void main(String[] args) {
	
			int[][] arr = {
			{ 5, 5, 5, 5, 5},
			{10,10,10,10,10},
			{20,20,20,20,20},
			{30,30,30,30,30}
			};
			int total = 0;
			double average = 0;
			 
			 
			
			for(int[] item : arr) {
			 
			
			for(int arr1 : item ) {
				total += arr1;
			   //average = total / (double)(arr.length * item.length);
			   
			}
		}
			average = total /(float)(arr.length * arr[0].length);
			System.out.println("total="+total);
			System.out.println("average="+average);


	}

}
