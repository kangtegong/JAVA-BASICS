import java.util.Scanner;

public class Basics {

	public static void main(String[] args) {	

		System.out.print("���� �Է� : ");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		int number = score/10; // �� �� ���븦 �˾Ƴ��� ���� ����..
		
		//���� Ʋ�� �� ����
		switch(number)
		{
		case 10:	// ����
		case 9:
			System.out.print("A");
			break; //break�־�� �Ѵ�
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
