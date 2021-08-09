package ex02.lambda;

public class Main2 {

	public static void main(String[] args) {
		Person psn = new Person();
		psn.hi((a, b) -> {
			System.out.println("My name is java's");
			System.out.println("Glad meet you, too");
			System.out.println("param is " + a + ", " + b);
			return 1;
		});
	}

}
