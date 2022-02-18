package gugu;
import java.util.Scanner;
//java jdk에서 제공하는 class, 사용 위해서는 import 필요


public class Variable {
	public static void main(String[] args) {
		System.out.println("2단");
		System.out.println(2 * 1);
		System.out.println(2 * 2);
		System.out.println(2 * 3);
		
		
		//변수 사용
		System.out.println("3단");
		int three = 3 * 1;
		System.out.println(three);
		three = 3 * 2;
		System.out.println(three);
		three = 3 * 3;
		System.out.println(three);
		
		
		//Scanner클래스 
		System.out.println("출력할 단은?");
		Scanner scanner = new Scanner(System.in);
		int four = scanner.nextInt();
		System.out.println("number : " + four);
		System.out.println(four * 1);
		System.out.println(four * 2);
		System.out.println(four * 3);
		scanner.close();

	}
}
