package day3;

import java.util.Arrays;
import java.util.Random;

public class Java17_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6개 자리. 1~45 랜덤 숫자. 중복 값이 안 나오게.
		Random ran = new Random();
		int[] arr = new int[6];

		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(45)+1; // 1~45
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break; // 빠져나가지 않으면 쓸데없이 중복되지 않은 숫자끼리 계속 비교하게 된다.
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
