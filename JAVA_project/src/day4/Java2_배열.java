package day4;

public class Java2_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		// int arr[] = new int[5];
//		arr[0] = "문자열"; // int형 데이터만 가능. 동일 데이터 사용.
		arr[0] = 10;
		
		String[] textArr = {"java", "aracle", "javascript", "html"};
//		Object[] test = {"z", 1, 1.5, true}; // (예외)아무거나 넣는 게 가능.
//		for(int i=0; i<textArr.length; i++) {
//			System.out.println(textArr[i]);
//		}
		
		for(String txt : textArr) { // 순차적으로 접근해 주겠다. 크기가 끝나면 알아서 빠져나간다. (참고)
			System.out.println(txt.length()); // 몇 글자인지 알려줌. 크기.
		}
		
		
	}

}
