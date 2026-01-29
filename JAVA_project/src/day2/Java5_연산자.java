package day2;

public class Java5_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대입 연산자
		
		int a = 10;
		int b = 5;
		
//		a = a + b; // 15
		a += b; // a = a + b; // 현재 내가 갖고 있는 값(a)에 b를 더해서 다시 a에 넣겠다. (편의성을 위해 간단히.)
		System.out.println(a);
		
		b -= 3; // b = b - 3;
		System.out.println(b);
		
		a *= 2;
		System.out.println(a); // 최초의 값이 아닌 중간에 변했기 때문에 잘 보고 계산해야 된다.
		
	}

}
