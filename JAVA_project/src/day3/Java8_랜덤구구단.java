package day3;

import java.util.Random;
import java.util.Scanner;

public class Java8_랜덤구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 사용자가 풀이하고 싶은 문제 수를 직접 정하도록
		// 문제풀이가 끝난 후 또다시 풀이할지 말지 사용자가 결정하도록
		
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
//		for(;;) {
//			System.out.println("[ (1) 구구단 시작 (2) 종료 ] : ");
//			int input = s.nextInt();
//			if(input==2) {
//				System.out.println("종료되었습니다.");
//			}
//		}
		
		
		// 정답 및 풀이
		System.out.println("=== 랜덤 구구단 ===");
		while(true) {
			System.out.println("[ (1) 구구단 시작 (2) 종료 ] : ");
			int menu = s.nextInt();
			if(menu == 1) {
				int count = 0; // 정답 개수 체크
				System.out.println("문제수를 입력해 주세요. : ");
				int num = s.nextInt();
				for(int i=1; i<=5; i++) {
					int x = ran.nextInt(8)+2; // 2~9
					int y = ran.nextInt(9)+1; // 1~9
					System.out.print("[" + i + "번 문제] ");
					System.out.print(x + " * " + y + " = ");
					int answer = s.nextInt();
					if(x*y==answer) {
						System.out.println("정답");
						count++;
					} else {
						System.out.println("오답");
					}
				}
				System.out.println("총 " + count + "문제 맞히셨습니다.");
				System.out.println();
			} else if(menu == 2) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("메뉴는 1과 2 중에서 선택해 주세요.");
			}
		}
		
	}

}
