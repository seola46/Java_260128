package day1;

public class Java3_변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ;
		name = "홍길동";
		System.out.println(name);
		
		// 변수 안에 들어간 값은 언제든 바꿀 수 있다.
		String hobby = "영화감상";
		System.out.println(hobby); // 영화 감상 출력
		
		hobby = "코딩";
		System.out.println(hobby); // 코딩 출력
		
		// 변수 선언은 한 번만 가능하다.
		int age = 30;
		
//		int age = 31;
		age = 31;
		
		
		
		
		char text = 'a'; // 캐릭터는 문자 한 개만 들어감
		var test = 1; // 자바 언어의 특징 때문에 선호해서 쓰진 않는다. (책에서는 중요하다고 함)
		// 어떤 데이터든 다 들어간다.
	}

}
