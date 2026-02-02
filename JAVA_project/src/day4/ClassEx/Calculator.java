package day4.ClassEx;

public class Calculator {
	double pi = 3.141592;
	
	Calculator(){
		System.out.println("계산기 생성!");
	}
	
	void intro(){
		System.out.println("아주아주 좋은 계산기 입니다!");
	}
	
	int abs(int x) {
		System.err.println("절댓값을 되돌려 드립니다.");
		return x < 0 ? -x : x;
//		int y;
//		if(x < 0) {
//			y = -x;
//		} else {
//			y = x;
//		}
//		return y;
		
//		int y = x < 0 ? -x : x;
//		return y;
	}
	
	
	int sum(int x, int y) {
		return x+y;
	}
	
}
