package day3;

public class Java13_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 순차적으로 접근. 2개씩 비교해서 백업->백업한 숫자랑 뒤에 숫자랑 비교...
		int[] arr = {3, 5, 8, 4, 2};
		int max = 0; // 큰 숫자 백업 // 만약, 배열 값이 음수라면 max = arr[0], int i =1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i]; // 배열 순서대로 대입하고, 돌아가면서 큰 숫자 백업 및 비교.
			}
		}
		System.out.println(max);
	}

}
