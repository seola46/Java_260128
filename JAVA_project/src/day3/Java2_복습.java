package day3;

import java.util.Scanner;

public class Java2_복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요. : "); // 사용자에게 무얼 적을지 알려주는 용도
		int a = s.nextInt();
		
		if(a % 2 == 0) { // (a % 2 == 1) => 홀수 구분법
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
	}

}
