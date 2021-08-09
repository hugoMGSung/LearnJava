package ex05.exam02.bufferedStreamEx;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("D:/Temp/Output2.txt"));
			String str ="Hello, Java!!";
			bs.write(str.getBytes()); //Byte형으로만 넣을 수 있음

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			bs.close(); //반드시 닫는다.
		} 
	}

}
