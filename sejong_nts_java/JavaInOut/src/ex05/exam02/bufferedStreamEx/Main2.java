package ex05.exam02.bufferedStreamEx;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Main2 {

	public static void main(String[] args) {
		try {
		       // 바이트 단위로 파일읽기
		        String filePath = "D:/Temp/Output2.txt"; // 대상 파일
		        FileInputStream fileStream = null; // 파일 스트림
		        BufferedInputStream bStream = null;
		        
		        fileStream = new FileInputStream(filePath); // 파일 스트림 생성
		        bStream = new BufferedInputStream(fileStream);
		        //버퍼 선언
		        byte[ ] readBuffer = new byte[bStream.available()];
		        while (bStream.read( readBuffer ) != -1) {}
		        System.out.println(new String(readBuffer)); //출력

		        bStream.close();
		        fileStream.close(); //스트림 닫기
		    } catch (Exception e) {
		    	e.getStackTrace();
		    }
	}

}
