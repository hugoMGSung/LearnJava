package ex05.exam03.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("3");
		list.add("5");
		list.add("2");
		list.add("4");
		list.add("0");
		
		Iterator<String> itr = list.iterator(); // 모든 컬렉션에 iterator() 메소드 존재
		
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
	}

}
