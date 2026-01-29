package day2;

public class Java3_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수학에서 사용하는 사칙연산(+,-,*,/) 사용. 사칙연산할 때도 데이터 타입이 중요.
		
		int a = 10;
		int b = 5;
		int c = 13;
//		double c = 13; // 더블 타입이 들어간 건 실행 시 소수점으로 나오는 걸 확인 가능.
		System.out.println(a + b); // 15
		System.out.println(c - b); // 8
		System.out.println(a * c); // 130
		
		// int 와 int의 계산이므로 결과도 int(나머지 값 사라짐)
		System.out.println(c / b); // 이대로 실행하면 나머지 값은 나오지 않고 몫만 나온다.
		
		// 사친연산의 결과는 더 큰 데이터 타입을 따른다.
		double d = 13;
		// int 와 double의 계산이므로 결과가 double로 나온다.
		System.out.println(d / b);
		System.out.println((double)c / b);
		
		
		
		
		
		
		
	}

}
