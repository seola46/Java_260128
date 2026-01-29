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
//		if(input < 2 || input > 9) {
//			System.out.println("다시 입력해 주세요.");
//		
//		for(int i=2; i<=9; i++) {
//			if(i % 2 == 0) {
//				System.out.println("=== " + i + "단 ===");
//					for(int j=1; j<=9; j++) {
//						System.out.println(i + " * " + j + " = " + (i*j));
//						
//					} 
//				}	
//					
//			}
//			System.out.println();
//		}
		
		
		Scanner s = new Scanner(System.in);
		for(;;) {
			System.out.println("구구단 단수를 입력해 주세요. :");
			
			int num = s.nextInt();
			
			if(num >= 2 && num <=9) {
				System.out.println("=== " + num + "단 ===");
				for(int i=1; i<9; i++) {
					System.out.println(num + " * " + i + " = " + (num*i));
				}
				break;
			}
		}
		
		
		
		
		
		
		
	}
}