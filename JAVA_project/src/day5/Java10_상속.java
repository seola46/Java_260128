package day5;

public class Java10_상속 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자식 클래스로 만든 객체는 부모 클래스에 있는 객체를 다 사용 가능하다.
		Student hong = new Student("홍길동", 30, "1234");
		hong.eat("치킨");
		hong.study();
//		hong.addr = "인천!!!!!";
		hong.setAddr("인천");
		System.out.println(hong.getAddr());
	}

}
