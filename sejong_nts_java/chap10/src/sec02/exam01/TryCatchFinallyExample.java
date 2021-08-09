package sec02.exam01;

public class TryCatchFinallyExample {
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		} finally {
			System.out.println("클래스 생성 완료.");
		}
	}
}

