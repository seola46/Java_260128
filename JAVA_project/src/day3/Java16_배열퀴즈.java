package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Java16_배열퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 5개의 공간을 가지는 배열을 선언
		// 2. 해당 배열에 숫자를 입력받아서 넣기
		// 3. 1 미만(0 이하)의 숫자를 입력하면 배열에 넣지 말고 다시 입력하도록
		
		Scanner s = new Scanner(System.in);
//		int[] arr = new int[5];
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println((i+1) + "번째 숫자 입력 : ");
//			arr[i] = s.nextInt();
//			if(!(arr[i]>=1)) {
//				System.out.println("1 이상의 숫자를 입력해 주세요.");
//				i--;
//			} 
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		// 정답 및 풀이
		// 1. 무한루프 사용 ver.
		int[] arr = new int[5];
//		int index = 0;
//		while(true) {
//			System.out.print((index+1) + "번째 숫자 입력 : ");
//			arr[index] = s.nextInt();
			// arr[index] 값이 0 이하인지 체크
			
			// 방법 1. continue 사용
//			if(arr[index] < 1) {
//				System.out.println("1 이상의 숫자를 입력해 주세요.");
//				continue; // 밑에 코드 실행 안 하고 다시 위로 올라감.
//			}
//			index++; // 증가하면서 순차적으로 접근
//				
//			// 방법 2. else 사용
//			} else { // continue가 기억이 안 난다면!
//				index++;
//			
//			if(index == arr.length) {
//				break;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
		
		// 2. 무한루프 사용 X
		for(int i=0; i<arr.length; i++) {
			System.out.println((i+1) + "번째 숫자 입력 : ");
			arr[i] = s.nextInt();
			if(arr[i] < 1) {
				System.out.println("1 이상의 숫자를 입력해 주세요.");
				i--; // i 값을 일부러 줄여서 해당 배열을 다시 반복할 수 있게.
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
