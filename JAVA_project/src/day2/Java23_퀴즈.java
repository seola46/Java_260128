package day2;

import java.util.Scanner;

public class Java23_퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 사용자가 입력한 숫자의 구구단을 출력하시오.
		// 2~9 사이의 값이 아니면 다시 입력하도록 하시오.
		
//		Scanner s = new Scanner(System.in);
//
//		System.out.println("숫자를 입력해 주세요. : ");
//		int input = s.nextInt();
//		if(input < 2 && input > 9) {
//			System.out.println("2~9 사이의 값으로 다시 입력해 주세요.");
//		
//		for(int i=2; i<=9; i++) {
//			if(i % 2 == 0) {
//				System.out.println("=== " + i + "단 ===");
//				for(int j=1; j<=9; j++) {
//					System.out.println(i + " * " + j + " = " + (i*j));
//					} 
//				}	
//				System.out.println();
//			}
//		}
		
		// 정답 및 풀이
		for(;;) {
			Scanner s = new Scanner(System.in);
			System.out.println("구구단 단수를 입력해 주세요. : ");
			int dan = s.nextInt();
			if(dan >= 2 && dan <=9) {
				for(int i=1; i<=9; i++) {
					System.out.println(dan + "*" + i + " = " + (dan*i));
				}
				break;
			} else {
				System.out.println("2부터 9 사이의 값을 입력하시오.");
			}
		}
	}
}