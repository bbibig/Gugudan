package gugu;
import java.util.Scanner;
//java jdk���� �����ϴ� class, ��� ���ؼ��� import �ʿ�


public class Variable {
	public static void main(String[] args) {
		System.out.println("2��");
		System.out.println(2 * 1);
		System.out.println(2 * 2);
		System.out.println(2 * 3);
		
		
		//���� ���
		System.out.println("3��");
		int three = 3 * 1;
		System.out.println(three);
		three = 3 * 2;
		System.out.println(three);
		three = 3 * 3;
		System.out.println(three);
		
		
		//ScannerŬ���� 
		System.out.println("����� ����?");
		Scanner scanner = new Scanner(System.in);
		int four = scanner.nextInt();
		System.out.println("number : " + four);
		System.out.println(four * 1);
		System.out.println(four * 2);
		System.out.println(four * 3);
		scanner.close();

	}
}
