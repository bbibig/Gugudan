package gugu;
import java.util.Scanner;

 /*  Q1. ����ڰ� �Է��� ���� ���� ũ�Ⱑ �ٸ� �������� ����� ����Ѵ�.
	 ���� ��� ����ڰ� "8,7"�� ���� ���ڿ��� �Է��ϸ� ��ĥ���� �����Ѵ�.
	 ��ĥ���� 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 ���� 
	 �����ϴ� ���� �ǹ��Ѵ�.*/

public class Practice {
	public static void main(String[] args) {
		System.out.println("������� �Է°���?");
		Scanner scanner = new Scanner(System.in);
		
		String inputValue = scanner.nextLine();
		//�Էµ� �� ���ڸ� ���ڿ��� ó���� �� ���� �޾ƿ�
		
		String[] splitedValue = inputValue.split(",");
		//��ǥ�� �������� �� ���ڸ� ������ �迭�� ����
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		//���ڿ� �������� �޾ƿ� ���� int�� ��ȯ
		
		for(int i = 2; i <= first; i++) {
			System.out.println(i + "��");
			
			for(int j = 1; j <= second; j++) {
				System.out.println(i + " * " + j + " = " + i*j);				
			}
		}	
	}
}