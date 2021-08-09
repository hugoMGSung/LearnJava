package ex02.lambda;

public class Main1 {
	public static void main(String[] args) {
		Person psn = new Person();
		psn.hi(new Say() {
			public int something(int a, int b) {
				System.out.println("My name is java's 11");
				System.out.println("Glad meet you");
				System.out.println("param is " + a + ", " + b);
				return a + b;
			}
		});
	}
}
