package ex05.exam04.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		dic.put("apple", "사과"); // dic 에 있는 모든 k,v 쌍을 출력
		// key value를 각각 컨트롤 하고 싶으면 Set
		
		Set<String> keys = dic.keySet();
		Iterator<String> it = keys.iterator();
		
		while (it.hasNext()) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");
		}
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println("찾고픈단어는");
			String eng = scan.next();
			System.out.println(dic.get(eng)); // 입력하는 key 값으로 value값 가져오기
		}
	
		scan.close();
	}
}
