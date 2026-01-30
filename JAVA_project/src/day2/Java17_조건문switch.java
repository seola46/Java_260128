package day2;

public class Java17_조건문switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch ~ case는 else if가 많은 코드를 작성할 때 유용. 가독성 있게 처리 가능.
		int score = 100;
		switch (score / 10) {
		case 10: // 어차피 A라서 9와 중복이니 코드는 하나만 해도 가능. break 전까지 실행.
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
//			break;
		case 7:
			System.out.println("C");
//			break;
		default:
			System.out.println("F");
			break;
		}
		
	}

}
