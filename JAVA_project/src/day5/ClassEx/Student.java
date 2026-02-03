package day5.ClassEx;

public class Student {
	// 변수(필드) + 메소드
	// 수정 필요
	 String name;
	 int age;
	private String stuNo;
	 
	//3개의 변수를 초기화하는 생성자 작성
	 Student(String name, int age, String stuNo){
		 this.name = name;
		 this.age = age;
		 this.stuNo = stuNo;
	 }
	 viod study() {
		 System.out.println(this.name + "가(이) 공부를 한다.");
	 }
	 viod study(String subject) {
		 System.out.println(subject + "를 공부한다.");
	 
	 }
	 
	
}
