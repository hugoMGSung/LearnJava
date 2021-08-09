package ex01.stringbuffer;

public class Main {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");			// Hello 
									// 01234
		sb.append(" ");
		sb.append("Java!");			// Hello Java!
									// 012345678910
		System.out.println(sb);
		
		sb.insert(6, "My ");		// Hello My Java!
									// 012345678910111213
		System.out.println(sb.toString());
		System.out.println(sb.length());
		
		sb.setCharAt(7, 'E');
		System.out.println(sb.toString());
		
		System.out.println(sb.substring(9));
		System.out.println(sb.substring(9, 13));
		System.out.println(sb.replace(7, 10, "2 j"));
		System.out.println(sb.delete(4, 5));
		
		String result = sb.toString();
		System.out.println(result);
	}

}
