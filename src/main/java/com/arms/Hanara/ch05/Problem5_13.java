package com.arms.Hanara.ch05;

import java.util.Scanner;

public class Problem5_13 {

	public static void main(String[] args) {
		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String char[] 을 로 변환
			 
			for (int x = 0; x < question.length; x++) {
				//System.out.println(question);
				int random = (int)(Math.random() * question.length);
				 
				char tmp = question[i];
				 
			 
				question[i] = question[random];
				
			 
				question[random] = tmp;
				 
				//System.out.println(question[random]);
				 
				
			}
			System.out.printf("Q%d. %s의 정답을 입력하세요 .>", i + 1, new String(question));
			 
			String answer = scanner.nextLine();
			 
			if (words[i].equals(answer.trim()))
				System.out.printf("맞았습니다 .%n%n");
			else
				System.out.printf("틀렸습니다 .%n%n");
		}

	}

}
