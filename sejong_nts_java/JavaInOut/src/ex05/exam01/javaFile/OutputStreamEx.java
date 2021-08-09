package ex05.exam01.javaFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		try {
			String filePath = "D:\\Temp";
			File folder = new File(filePath);
			
			if (folder.exists() == false) {
				folder.mkdir();
				System.out.println("폴더 생성");
			}
			
			OutputStream output = new FileOutputStream("D:\\Temp\\Output.txt");
			String str = "Hello, Java!!";
			byte[] bt = str.getBytes();
			output.write(bt);
			System.out.println("완료했습니다");
			
			output.close();
		} catch (IOException ex) {
			ex.getStackTrace();
		}
	}

}
