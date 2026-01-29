package day2;

public class Java2_변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수는 언제든 값이 변경될 수 있다.
		double height = 170.5;
		height = 170.5 + 1; // 171.5;로 해도 되지만 키가 컸다는 의미로 사용 가능.
		
		// final 키워드를 붙이면 값을 변경할 수 없다.
		// final 변수는 모두 대문자로, '상수'라고 표현함. => '수정을 못하는 값'
//		double pi = 3.14;
//		double pi2 = 3.141592; // 값이 미세하게 다르게 나올 수 있다.
		final double PI = 3.14;
//		PI = 3.141592; fianl 이므로 수정할 수 없다.
		
		int number = 50; // 오른쪽에 있는 값을 왼쪽에 넣겠다.
		int number2 = number; // 변수 뒤에 값을 넣을 때 숫자 말고도 변수 이름을 넣어도 됨
		
		
		int weight = 50; // 50.0이 될 수 있기 때문에 더블형 데이터에 대입 가능
		double weight2 = weight; // 숫자끼리는 형 변환을 많이 허용해 준다.
		
		
		// double이 더 큰 개념이므로 int에 담는 건 원래 불가능
		// 다만, 강제형변환을 통해서 가능하게 할 수 있음.
		// 이때, 값의 손실이 발생한다.
		double weight3 = 50.5;
//		int weight4 = weight3; // 더블형에서 인트로는 변환할 수 없다. 큰 거 -> 작은 거 X
		int weight4 = (int) weight3;
		System.out.println(weight4);
		
		
		
		
		
		
		
	}

}
