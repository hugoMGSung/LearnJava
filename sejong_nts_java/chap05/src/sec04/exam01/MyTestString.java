package sec04.exam01;

public class MyTestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "성명건";
		String strVar2 = "성명건";
		
		System.out.println("strVar1 = " + strVar1);
		System.out.println("strVar2 = " + strVar2);
		System.out.println(strVar1 == strVar2);
		
		strVar2 = "성태준";
		System.out.println("strVar1 = " + strVar1);
		System.out.println("strVar2 = " + strVar2);
		System.out.println(strVar1 == strVar2);
	}

}
