package day5.ClassEx;

public class StuMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 수정 필요
		
		Student hong = new Student("홍길동", 30, "1234");
		hong.study();
		hong.study("자바");
		hong.money = 100000;
		//
		hong.money = hong.money - 30000;
		hong.money_708 = hong.money_708 - 50000;
		
		Student kim = new Student("김철수", 25, "9876");
		kim.study();
		String stuNo = kim.getStuNo();
		
		
	}

}
