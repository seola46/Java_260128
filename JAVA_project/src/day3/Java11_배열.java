package day3;

import java.util.Arrays;

public class Java11_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열(array)
		// 선언 먼저 한 후 나중에 값을 넣기 가능
		// 배열은 고정 크기를 지정해 줘야 한다.
		
		int[] arr = new int[5]; // 정해져 있는 문법 (원하는 값을 넣어주면 됨)
		// 5개의 공간을 가진 배열이 됨 {0,0,0,0,0};
//		arr[0] = 10; // {10,0,0,0,0}
//		arr[3] = 50; // {10,0,0,50,0}
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
//			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr)); // 배열 값 그대로 출력
	}

}
