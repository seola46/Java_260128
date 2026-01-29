package day2;

public class Java1_복습 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("주석은 실행에 영향을 주지 않는다.");
		// 자동 들여쓰기 => Ctrl + Shift + f (들여쓰기는 습관화)
		System.out.println("Test");
		
		String name = "홍길동";
		System.out.println(name); // 홍길동 출력
		System.out.println("name"); // name 출력
		
		int age = 30;
		double height = 170.5;
		boolean isMarried = true; // true or false
		// 노란색 줄이 뜨는 경고성 의미는 실행하는 데에 큰 문제는 없지만 잘 지켜볼 필요 있음.
		
		System.out.println(height);
		
		String gender;
		gender = "남자"; // String gender = "남자";
		// 보통 두줄보다는 한줄로 해결함
		
//		int age = 25; // 한번 선언한 변수는 다시 선언할 수 없다. 타입 + 변수 = 변수 선언
		// age를 위에서 한번 썼기 때문에 다시 사용 불가
		age = 31; // 뒤에 숫자를 바꿀 수는 있다.
		
	}

}
