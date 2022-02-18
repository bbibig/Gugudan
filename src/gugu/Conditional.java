package gugu;
import java.util.Scanner;

public class Conditional {
	//조건문
	public static void main(String[] args) {
		System.out.println("몇 단?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();		
		if(number < 2) { 
			System.out.println("값이 유효하지 않습니다.");
		} else if (number > 10) {
			System.out.println("값이 유효하지 않습니다.");
		} else {
			for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}
	}

}
