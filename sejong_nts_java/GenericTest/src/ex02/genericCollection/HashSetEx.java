package ex02.genericCollection;

import java.util.*;

public class HashSetEx {

	public static void main(String[] args) {
		// 해시 집합을 생성한다. 
		Set<String> hs = new HashSet<String>();
		// 해시 집합에 요소를 추가한다. 
		hs.add("B"); 
		hs.add("A"); 
		hs.add("D");
		hs.add("E"); 
		hs.add("C"); 
		hs.add("F");
		
		System.out.println(hs);
	}

}
