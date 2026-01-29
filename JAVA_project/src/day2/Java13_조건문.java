package day2;

import java.util.Scanner;

public class Java13_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건을 줄 때는 순서가 중요하다.
		
		System.out.println("점수를 입력해 주세요.");
		Scanner s = new Scanner(System.in);
		
		int score = s.nextInt();
		
	
		
		if(score >= 90) {
			System.out.println("A학점");
		} else if(score >= 80) {
			System.out.println("B학점");
		} else if(score >= 70) {
			System.out.println("C학점");
		} else {
			System.out.println("F학점");
		}
		
		
		
	}

}
