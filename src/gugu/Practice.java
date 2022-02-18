package gugu;
import java.util.Scanner;

 /*  Q1. 사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
	 예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다.
	 팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 
	 구현하는 것을 의미한다.*/

public class Practice {
	public static void main(String[] args) {
		System.out.println("사용자의 입력값은?");
		Scanner scanner = new Scanner(System.in);
		
		String inputValue = scanner.nextLine();
		//입력된 두 숫자를 문자열로 처리해 한 번에 받아옴
		
		String[] splitedValue = inputValue.split(",");
		//쉼표를 기준으로 두 숫자를 구분해 배열에 담음
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		//문자열 형식으로 받아온 것을 int로 변환
		
		for(int i = 2; i <= first; i++) {
			System.out.println(i + "단");
			
			for(int j = 1; j <= second; j++) {
				System.out.println(i + " * " + j + " = " + i*j);				
			}
		}	
	}
}
