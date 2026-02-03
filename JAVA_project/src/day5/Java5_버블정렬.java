package day5;

public class Java5_버블정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4번 파일에 한 거 잘 줄이기
		// 수정 필요
		int arr[] = {2, 4, 5, 1, 3};
		for(int j=1; j<arr.length; j++) {
			for(int i=0; i<arr.length-j; i++) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
						
				}
			}
		}
		
	}

}
