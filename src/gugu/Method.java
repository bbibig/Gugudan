package gugu;

public class Method {
	//gugu메서드
	public static int[] gugu(int num) {
		int[] gugu = new int[9];
		for(int i = 0; i < gugu.length; i++) {
			gugu[i] = num * (i + 1);
		}
		return gugu;
	}
	
	//print메서드
	public static void print(int[] gugu) {
		for(int i = 0; i < gugu.length; i++) {
		System.out.println(gugu[i]);
		}
	}
}
