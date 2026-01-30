package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Java12_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1 + "번째 숫자 입력 : "));
			arr[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr)); // toString 외워두면 좋음. 나중에 쓰임.
		
		
		// ===== 입력받은 5개의 숫자의 평균을 구하기 =====
		// 		 (배열 안에 있는 모든 값의 평균)=>모든 숫자를 더한 다음 갯수로 나누기
		
		// 오답!
//		int sum=0;
//		System.out.print(sum + arr.length % 5);
		
		
		// 정답 및 풀이
		int sum = 0; // 누적해서 계산
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("평균 값 : " + (sum/arr.length)); // 소수로 바꾸고 싶으면 sum 앞 괄호 안에 double 넣어주기
		// arr.length 말고 따로 변수 선언 후 변수 값 넣어도 됨
	}

}
