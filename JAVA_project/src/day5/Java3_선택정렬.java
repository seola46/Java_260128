package day5;

import java.util.Arrays;

public class Java3_선택정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 3, 5, 1, 4};
		// 내림차순
		// 수정 필요
		
		for(int j=0; j<4; j--) {
			int maxIndex = j;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[maxIndex] > arr[i]) {
					maxIndex = i;
				}
			}
			int temp = arr[j];
			arr[j] = arr[maxIndex];
			arr[maxIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
		
		
	}

}
