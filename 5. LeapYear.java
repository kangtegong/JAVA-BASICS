import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {	
		
		boolean isLeapYear; 
			// boolean을 쓰는 예제를 한 번 작성해보고 싶었다..
		Scanner input = new Scanner(System.in);

		System.out.print("연도 입력 : ");
		int year = input.nextInt();
		
		isLeapYear = (year%4==0); 
			// 우변은 T or F 반환. 해당 TF가 isLeapYear에 담김
		if(isLeapYear)
			System.out.println("윤년");
		else
			System.out.println("아님");
					
	}

}
