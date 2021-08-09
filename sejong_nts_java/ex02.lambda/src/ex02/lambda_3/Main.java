package ex02.lambda_3;

import java.util.function.DoubleUnaryOperator;

public class Main {

	public static void main(String[] args) {
		DoubleUnaryOperator oper;
        oper = (n) -> Math.abs(n);
        System.out.println(oper.applyAsDouble(-5));

        oper = Math::abs;
        System.out.println(oper.applyAsDouble(-5));
	}

}
