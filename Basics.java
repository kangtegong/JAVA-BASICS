import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {	

		System.out.print("성적 입력 : ");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		int number = score/10; // 몇 십 점대를 알아내기 위한 연산..
		
		//문법 틀을 잘 보자
		switch(number)
		{
		case 10:	// 땡땡
		case 9:
			System.out.print("A");
			break; //break있어야 한다
		case 8:
		case 7:
			System.out.print("B");
			break;
		case 6:
		case 5:
			System.out.print("C");
			break;
		default:
			System.out.print("F");
			break;
				
		}
		
	}

}
