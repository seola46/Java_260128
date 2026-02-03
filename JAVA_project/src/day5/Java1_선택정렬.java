package day5;

import java.util.Arrays;

public class Java1_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선택정렬
		// 배열의 값들 중 가장 작은 수를 찾아서
		// 맨 앞의 값과 위치 바꾸기
		
		// 규칙성 minIndex 0부터 하나씩 증가. i의 값은 1부터 증가.
		
		int arr[] = {2, 3, 5, 1, 4};
		
		// 1회차 {2, 3, 5, 1, 4} -> {1, 3, 5, 2, 4}
		int minIndex = 0; // 0번째 자리
		for(int i=1; i<arr.length; i++) { // i가 1번째 자리
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		int temp = arr[0];
		arr[0] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		
		// 2회차 {1, 3, 5, 2, 4} -> {1, 2, 5, 3, 4}
		minIndex = 1; // 1번째 자리
		for(int i=2; i<arr.length; i++) { // i가 2번째 자리
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[1];
		arr[1] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		
		// 3회차 {1, 2, 5, 3, 4} -> {1, 2, 3, 5, 4}
		minIndex = 2; // 1번째 자리
		for(int i=3; i<arr.length; i++) { // i가 3번째 자리
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[2];
		arr[2] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		
		// 4회차 {1, 2, 3, 5, 4} -> {1, 2, 3, 4, 5}
		minIndex = 3; // 1번째 자리
		for(int i=4; i<arr.length; i++) { // i가 2번째 자리
			if(arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[3];
		arr[3] = arr[minIndex];
		arr[minIndex] = temp;
		System.out.println(Arrays.toString(arr));
		
		
	}

}
