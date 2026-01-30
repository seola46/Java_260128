package day3;

import java.util.Random;
import java.util.Scanner;

public class Java9_UpAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		Scanner s = new Scanner(System.in);
		
		int random = ran.nextInt(100+1); // 1~100
		int count = 1; // 몇 번 시도했는지 체크
		while(true) {
			System.out.print(count + "번째 시도 : ");
			int answer = s.nextInt(); // 사용자가 응답한 숫자에 따라서
			
			if(!(answer >= 1 && answer <= 100)) { // '1부터 100 사이의 값이 아닐 때'라는 의미로 앞에 !
				// if(answer < 1 || answer > 100) 동일한 의미
				System.out.println("1~100 사이 값을 입력해 주세요.");
			} else if(random > answer) {
				System.out.println("UP!");
				count++;
			} else if(random < answer) {
				System.out.println("DOWN!");
				count++;
			} else {
				System.out.println("정답입니다! " + count + "번째만에 맞히셨습니다.");
				break; // 빠져나간다.
			}
		}
	}
}
