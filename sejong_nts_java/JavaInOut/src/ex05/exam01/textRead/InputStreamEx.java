package ex05.exam01.textRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) {
		try {
			File file = new File("D:/Temp/Output.txt");
			// 입력 스트림 생성
			FileReader reader = new FileReader(file);
			int cur = 0;
			while ((cur = reader.read()) != -1) {
				System.out.print((char)cur);
			}
			
			reader.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
