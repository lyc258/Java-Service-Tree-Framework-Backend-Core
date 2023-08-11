package com.arms.Hanara.ch05;

import java.util.Arrays;

public class Problem5_11 {
	public static void main(String[] args) {
		int sum = 0;
		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		int[][] result = new int[score.length + 1][score[0].length + 1];
		for (int i = 0; i < score.length; i++) {

			for (int j = 0; j < score[i].length; j++) {

				result[i][j] =+ score[i][j];
				result[i][3] =+ score[i][j] + score[i][j] + score[i][j];
				result[5][j] =+ result[0][0] + result[1][0] + result[2][0] + result[3][0] + result[4][0];
				result[5][3] =+ result[5][0] + result[5][1] + result[5][2];
				
				
				/*
				result[i][j] = score[i][j];
				result[i][3] += result[i][j];
				result[5][j] += result[i][j];
				result[5][score[0].length] += result[i][j]; */
				
				System.out.println(result[i][j]);

			}

		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}  
}
