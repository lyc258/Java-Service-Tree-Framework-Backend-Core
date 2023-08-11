package com.arms.Hanara.ch04;

public class Problem4_3 {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i < 10; i++) {
		 count = (1 + (1 + 1+i) + (1 + 1+i + 2+i) + (1 + 1+i + 2+i + 3+i) + (1 + 1+i + 2+i + 3+i + 4+i) + (1 + 1+i + 2+i + 3+i + 4+i + 5+i) + 
				 (1 + 1+i + 2+i + 3+i + 4+i + 5+i + 6+i) + (1 + 1+i + 2+i + 3+i + 4+i + 5+i + 6+i + 7+i) + (1 + 1+i + 2+i + 3+i + 4+i + 5+i + 6+i + 7+i + 8+i) 
				 + (1 + 1+i + 2+i + 3+i + 4+i + 5+i + 6+i + 7+i + 8+i + 9+i)
		          );
		 break;
		}
	System.out.println(count);

	}

}

/*int count = 0;
int totalcount = 0;

for(int i = 1; i <= 10; i++) {
	count += i;
	System.out.println(totalcount += count);

	//System.out.println(count += count);
} */