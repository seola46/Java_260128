package day3;

public class Java4_반복문while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(선언;조건식;증감식)
		// while(조건), 선언은 밖에, 증감은 안에 존재. // while문 안에 while이 더 들어갈 수 있다.
		// for(int i=1; i<=10; i++)
		
//		int i=1; // 선언은 꼭! 바깥에 해야 된다.
//		while(i<=10) {
//			System.out.println(i);
//			i++; // 만약 출력보다 먼저 증감시키게 될 시, 증가된 하나의 값이 더 출력된다.
//		}
		
//		int j=2;
//		while(j<=9) {
//			System.out.println("=== " + j + "단 ===");
//			j++; // 오답!!
//			int k=1;
//			while(k<=9) {
//				System.out.println(j + " * " + k);
//				k++;
//			}
//			j++; // 정답
//		}
		
		// 정답
		int i=2;
		while(i<=9) {
			System.out.println("=== " + i + "단 ===");
			int j=1;
			while(j<=9) {
				System.out.println(i + " * " + j + " = " + (i*j));
				j++;
			}
			i++;	
		}
	}
}
