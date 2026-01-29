package day2;

public class Java6_증감연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
//		a++; // a = a+1; 독립적으로 사용 가능.
		// 증감연산자가 뒤에 있으면 먼저 값을 넣고 증감이 된다.
		int c = a++;
		System.out.println(c); // 10
		System.out.println(a); // 11
		// 증감연산자가 앞에 있으면 먼저 증감을 하고 값을 넣어야 한다.
		int d = ++b;
		System.out.println(d); // 6
		
		int e = b--;
		System.out.println(e); // 6
		System.out.println(b); // 5
		
	}

}
