package ex01.lambda02;

@FunctionalInterface
interface LambdaTest {
    public int min(int a, int b);
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaTest minNum = (x, y)-> x < y ? x : y;
		
		System.out.println("최소값 : " + minNum.min(1, 6));
	}

}
