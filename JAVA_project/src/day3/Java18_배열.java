package day3;

import java.util.Arrays;

public class Java18_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 위치 바꾸기
		int[] arr = {3, 5, 2, 4, 1};
		// {2,5,3,4,1}
//		arr[0] = arr[2]; // {3, 5, 2, 4, 1} 덮어쓰게 되면 전에 있던 숫자가 사라지게 됨.
		int temp = arr[0]; // 3이라는 숫자가 보관됨.
		arr[0] = arr[2]; // {2, 5, 2 , 4, 1}
		arr[2] = temp; // {2, 5, 3, 4, 1}
		System.out.println(Arrays.toString(arr));
		
		
	}

}
