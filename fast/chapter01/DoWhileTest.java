package ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		
		
		
		do {
			input = scanner.nextInt();
			sum += input;
			
		}while(input != 0);
		
		System.out.println(sum);
	}

}

// 조건과 상관 없이 한번은 수행문을 수행

// while문은 조건을 먼저 체크하고 반복 수행이 된다면, do-while은 조건과 상관 없이 수행을 한 번 하고나서 조건을 체크
