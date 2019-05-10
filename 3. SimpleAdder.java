import java.util.Scanner;

public class SimpleAdder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x,y,result;

		System.out.print("첫번째 수 입력 : ");
		x = input.nextInt();
		System.out.print("두번째 수 입력 : ");
		y = input.nextInt();
		result = x+y;
		System.out.print("덧셈 결과 : "+result);

		
	}

}
