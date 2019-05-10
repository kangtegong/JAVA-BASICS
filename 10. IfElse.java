import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {	

		System.out.print("성적 입력 : ");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		
		if(score>=90)
			System.out.println("A");
		else if(score>=80)
			System.out.println("B");
		else if(score>=70)
			System.out.println("C");
		else
			System.out.println("F");

	}

}
