import java.util.Scanner;

public class RoundArea {

	public static void main(String[] args) {	
		
		// 직사각형 둘레와 면적
		// 가로 길이, 세로 길이 입력받으면 둘레랑 넓이 구해주는 프로그램
		int round, area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("가로길이 입력 : ");
		int width = input.nextInt();

		System.out.print("세로길이 입력 : ");
		int height = input.nextInt();

		round = (width*2)+(height*2);
		area = width*height;
		
		System.out.println("직사각형 둘레길이는 "+round);
		System.out.println("직사각형 넓이는"+area);
		
	
	}

}
