package ex01.stringComparison;

public class Main {

	public static void main(String[] args) {
		String a = "aa";
		String b = new String("bb");

		System.out.printf("a | value: %-4s, address: %s\n", a, a.hashCode());
		System.out.printf("b | value: %-4s, address: %s\n", b, b.hashCode());

		a = a + b;

		System.out.printf("a | value: %-4s, address: %s\n", a, a.hashCode());
		System.out.printf("b | value: %-4s, address: %s\n", b, b.hashCode());
	}

}
