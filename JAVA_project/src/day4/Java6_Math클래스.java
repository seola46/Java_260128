package day4;

public class Java6_Math클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int max = Math.max(10, 20);
//		System.out.println(max);
//		Math.abs(-10);
		
		int arr[] = {5, -3, 10, -9, 6};
		// 배열 안에 있는 모든 숫자를 양수로 변경
		// 음수인 숫자들을 양수로(-3 = > 3)
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < 0) {
				arr[i] = -arr[i];
			}
		}
		int max = Math.abs(arr[0]);
		for(int i=0; i<arr.length; i++) {
			arr[i] = Math.abs(arr[i]);
			if(Math.abs(arr[i]) > max) {
				max = Math.abs(arr[i]);
			}
		}	
		
		
		
	}

}
