package day3;

import java.util.Scanner;

public class Java98_StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 고블린 = 객체 => 주소 다음 변수
		// 체력, 공격력...
		
		Scanner s = new Scanner(System.in);
		String menu = s.next();
		// 문자열끼리는 == 두 개 쓰면 X, equals 메소드를 사용해야 한다.
		if(menu.equals ("Y")) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
	}

}
