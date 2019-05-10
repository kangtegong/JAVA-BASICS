import java.util.Scanner;

public class AreaTest {

	public static void main(String[] args) {

		final double PI = 3.141592;
		
		System.out.print("반지름 입력 : ");
		Scanner input = new Scanner(System.in);
		// 새로운 Scanner 클래스를 선언하고
		// input이라는 이름의 Scanner 인스턴스에 대입 

		double radius = input.nextDouble();
		double area = PI*radius*radius;
		
		System.out.println("반지름이"+radius+"인 원의 면적은"+area+"이다");
		
		
	}

}
