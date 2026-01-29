package day2;

import java.util.Scanner;

public class Java23_무한루프 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int가 허락하는 숫자(21억)까지 무한루프
		
//		int a = 1;
//		for(;;) {
//			System.out.println(a++);
//			if(a == 10) {
//				break; // 빠져나올 수 있는 구멍
//			}
//		}
		
		
		Scanner s = new Scanner(System.in);
		
		for(;;) {
			System.out.println("숫자를 입력해 주세요 : ");
			int input = s.nextInt();
			if(input < 1 || input > 100) {
				System.out.println("1부터 100 사이의 값을 입력해 주세요.");
			} else if(input % 2 == 0) {
				System.out.println("짝수입니다.");
				break;
			} else {
				System.out.println("홀수입니다.");
				break; // 적절한 위치에 원하는 시간에 빠져나갈 수 있게
			}
		}
		
		
	}

}
