/*
상점에 가서 우리가 물건을 살 때
영수증에는 상품가격의 10% 정도의 부가세와 잔돈 등이 인쇄된다
구입한 상품의 가격과 손님에게 받은 금액을 입력하면
부가세와 잔돈을 출력하는 프로그램을 만들어보아라
 */

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {	

		Scanner input = new Scanner(System.in);

		System.out.print("받은 돈 : ");
		int received = input.nextInt();
		
		System.out.print("상품가격 : ");
		int price = input.nextInt();

		int tax = (int)(price*0.1);
			/*
			이 부분때문에 이 예제 작성한거임
			언뜻 생각해보면 그냥 10나누면 정수니까 바로 int tax에 담으면 될 것 같지만
		 	0.1을 곱하면 실수형으로 자동형변환이 되기 때문에 int로 선언된 tax와 맞지 않게 된다
			그래서 (int)로 자동 형변환 한 거
			 */
		System.out.println("부가세 : "+tax);
		System.out.println("잔돈 : "+(received-price));
			
	}

}
