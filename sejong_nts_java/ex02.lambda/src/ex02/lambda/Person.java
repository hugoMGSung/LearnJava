package ex02.lambda;

interface Say {
	int something(int a, int b);
}

public class Person {
	public void hi(Say line) {
		int number = line.something(3, 5);
		System.out.println("Number is " + number);
	}
}
