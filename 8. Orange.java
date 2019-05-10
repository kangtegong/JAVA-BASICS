/*
	하나의 상자에 오렌지를 10개씩 담을 수 있다고 하자. 
	사용자가 입력한 오렌지 개수에 대해서 상자가 몇 개 필요한가?
	그리고 몇 개의 오렌지가 남는가?
 */

import java.util.Scanner;

public class Orange {

	public static void main(String[] args) {	
		
		System.out.print("오렌지 갯수 입력하시오 : ");
		Scanner input = new Scanner(System.in);
		int orange = input.nextInt();
		
		System.out.print("오렌지는 "+(orange/10)+"박스가 나오고 "+(orange%10)+"개 남는다");
			
	}

}
