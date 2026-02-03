package day5;

import java.util.Arrays;

public class Java2_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번 파일에서 작성한 코드의 규칙성을 찾아서
		// 반복문으로 다시 작성해 보기
//		int arr[] = {2, 3, 5, 1, 4};
		
//		int minIndex = 0;
//		for(int i=1; i<arr.length; i++) {
//			if(arr[minIndex] > arr[i]) {
//				minIndex = i;
//				continue;
//			}
//		}
//		int temp = arr[0];
//		arr[0] = arr[minIndex];
//		arr[minIndex] = temp;
//		System.out.println(Arrays.toString(arr));
		
		
		// 정답 및 풀이
		int arr[] = {2, 3, 5, 1, 4};
		
		for(int j=0; j<4; j++) {
			int minIndex = j;
			for(int i=1; i<arr.length; i++) {
				if(arr[minIndex] > arr[i]) {
					minIndex = i;
				}	
			}
			int temp = arr[j]; // 임시값 백업
			arr[j] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
	
		
		
	}

}
