package ex02.generic;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 비제너릭
		NonGenCls ngc = new NonGenCls();
		ngc.set("비제너릭");					// String -> Object(자동 변환)
		String name1 = (String) ngc.get();	// Object -> string(강제 변환)
		
		GenCls<String> gc = new GenCls<String>();  // String 생략가능
		gc.set("제너릭");	
		String name2 = gc.get();				
	}

}
