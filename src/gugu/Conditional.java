package gugu;
import java.util.Scanner;

public class Conditional {
	//���ǹ�
	public static void main(String[] args) {
		System.out.println("�� ��?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();		
		if(number < 2) { 
			System.out.println("���� ��ȿ���� �ʽ��ϴ�.");
		} else if (number > 10) {
			System.out.println("���� ��ȿ���� �ʽ��ϴ�.");
		} else {
			for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}
	}

}
