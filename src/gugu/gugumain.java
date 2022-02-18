package gugu;

public class gugumain {
	//메서드를 호출해 실행
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			int gugu[] = Method.gugu(i);
			Method.print(gugu);
		}
	}
}
