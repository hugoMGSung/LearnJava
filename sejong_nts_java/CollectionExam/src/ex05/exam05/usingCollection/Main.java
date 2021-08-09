package ex05.exam05.usingCollection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		System.out.println("현재 벡터 나열=" + myList);
		Collections.sort(myList);
		System.out.println("====sort 정렬 후=====");
		printList(myList);

		Collections.reverse(myList);
		printList(myList);

		int index = Collections.binarySearch(myList, "트랜스포머") + 1;
		System.out.println("스타워즈는" + index + "번쨰 요소");
	}

	static void printList(LinkedList<String> I) {
		Iterator<String> iterator = I.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String seperator;
			if (iterator.hasNext())
				seperator = "->";
			else
				seperator = "\n";
			System.out.print(e + seperator);
		}
	}

}
