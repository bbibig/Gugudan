package gugu;

public class Array {
	//배열과 반복문은 짝꿍처럼 생각하기!
	public static void main(String[] args) {
		int [] number = new int [9];
		for(int i = 0; i < number.length; i++) {
			number[i] = 7 * (i + 1);
			System.out.println(number[i]);
		}
	}
}
