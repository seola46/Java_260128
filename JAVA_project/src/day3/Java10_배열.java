package day3;

public class Java10_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열(array) => 객체(주소)
		// 선언과 동시에 초기화 가능
		// 위치값까지 적용해야 됨
		// 반복문으로도 접근 가능
		
//		int[] arr = {3,5,2,4,1}; // arr 뒤에도 [] 가능
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		
		
		// 반복문
		int[] arr = {3,5,2,4,1};
		for(int i=0; i<5; i++) { // i< 뒤에 arr.length; 입력하면 알아서 총 입력된 갯수 출력함.
			System.out.println(arr[i]);
		}
	}
}
