package day4;

import java.util.Arrays;

public class Java3_문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열에서 가장 큰 숫자와 가장 작은 숫자의 위치 바꾸기
		// 가장 큰 숫자와 가장 작은 숫자 따로 따로 먼저 찾기
		// 결과 : {3, 1, 2, 4, 5};
		
		int[] arr = {3, 5, 2, 4, 1};
		
		int minIndex = 0;
		int maxIndex = 0;
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
			if(arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		System.out.println(maxIndex);
		System.out.println(minIndex);
		
		int temp = arr[maxIndex]; // 백업 용도!
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		
		
//		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
