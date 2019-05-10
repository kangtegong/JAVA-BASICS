import java.util.Scanner;

public class BitOperation {

	public static void main(String[] args) {	
		
		// 비트 연산자도 한 번 예제 작성해보자
		int x = 0x0fff;
		int y = 0xfff0;
		
		// System.out.println("%x", (x&y)); 
		// println은 이 경우 출력 불가 
		System.out.printf("%x ", (x&y));	//AND
		System.out.printf("%x ", (x|y));	//OR
		System.out.printf("%x ", (x^y)); //XOR
		System.out.printf("%x ", (~x));  //Bitwise Not
		
	
	}

}
