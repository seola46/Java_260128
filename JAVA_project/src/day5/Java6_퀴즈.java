package day5;

import java.util.Arrays;

public class Java6_퀴즈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {2, 4, 5, 1, 3};
		// 문제를 풀이할 때,
		// 별다른 조건이 없으면(ex, 선택정렬을 쓰세요)
		// Arrays.sort(arr); // 오름차순
//		Arrays.sort(arr); // 정렬이 필요하다. 할 때 쓰면 됨.
//		System.out.println(Arrays.toString(arr));
		
		
		// 선택 or 버블 정렬 편한 방식 이용해서
		// 배열 정렬. 단, 음수를 양수 취급할 것
		// {2, -4, 5, -1, -3} => {-1, 2, -3, -4, 5}
		
		// 정답 및 풀이
		int arr[] = {2, -4, 5, -1, -3};
		for(int j=1; j<arr.length; j++) {
			for(int i=0; i<arr.length-j; i++) {
				if(Math.abs(arr[i]) > Math.abs(arr[i+1])) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
//				int x = arr[i] < 0 ? -arr[i] : arr[i];
//				int y = arr[i+1] < 0 ? -arr[i+1] : arr[i+1];
//				if(x > y) {
//					int temp = arr[i];
//					arr[i] = arr[i+1];
//					arr[i+1] = temp;
//				}	
			}	
		}
		System.out.println(Arrays.toString(arr));
		
		
//		int arr[] = {2, -4, 5, -1, -3};
//		for(int i=0; i<arr.length-1; i++) {
//			if(arr[i] > arr[i+1]) {
//				int temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		
//		for(int i=0; i<arr.length-2; i++) {
//			if(arr[i] > arr[i+1]) {
//				int temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		
//		for(int i=0; i<arr.length-3; i++) {
//			if(arr[i] > arr[i+1]) {
//				int temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		
//		for(int i=0; i<arr.length-4; i++) {
//			if(arr[i] > arr[i+1]) {
//				int temp = arr[i];
//				arr[i] = arr[i+1];
//				arr[i+1] = temp;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
	}

}
