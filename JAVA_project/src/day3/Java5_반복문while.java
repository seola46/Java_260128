package day3;

import java.util.Scanner;

public class Java5_반복문while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while 무한루프
		// for문에서는 ;;, while문에서는 true
//		int a=1;
//		while(true) {
//			System.out.println(a++);
//		}
		
		// 문제. 입력되는 숫자를 모두 더하시오.
		// 단, -1을 입력하면 여태 더한 값을 출력하고 종료하시오.
		
//		Scanner s = new Scanner(System.in);
//		
//		int a=1;
//		while(true) {
//			System.out.println(a++);
//			System.out.println(a + "번째 숫자 입력 : ");
//			int input = s.nextInt();
//	
//			if(input<0) {
//				System.out.println("모든 숫자의 합 : " + input + );
//			} 
//				
//		}
		
		// 정답 및 풀이
		Scanner s = new Scanner(System.in);
		int sum = 0; // 누적해서 계산하는 식
		int count = 1;
		while(true) {
			System.out.println(count + "번째 숫자 입력 : ");
			int num = s.nextInt();
			if(num != -1) {
				sum += num; // sum = sum + num;
			} else {
				// -1 입력되었을 경우
				break;
			}	
			count++; // 한바퀴 돌고 다시 시작할 때 증가될 수 있게.
		}
		System.out.println("모든 숫자들의 합 : " + sum); // sum이 무한증가하는 게 아니기 때문에 while문 밖에 출력.
	}

}
