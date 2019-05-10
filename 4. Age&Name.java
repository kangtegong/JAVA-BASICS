import java.util.Scanner;

public class AgeName {

	public static void main(String[] args) {
		
		//이름과 나이 출력하기
		String name; //이름을 담을 name
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = input.nextLine(); // 한 줄 문자열 .nextLine() vs 한단어 .next()
		System.out.print("나이를 입력하세요 : ");
		age = input.nextInt();
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age+"살");
				
	}

}
