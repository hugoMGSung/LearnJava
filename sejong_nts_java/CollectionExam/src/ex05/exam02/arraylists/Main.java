package ex05.exam02.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("이름 입력");
			String s = scanner.next();
			a.add(s);
		}
		for (int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println((i+1) + "th " + name + " ");
		}
		int longIndex = 0;
		for (int i = 1; i < a.size(); i++) {
			if (a.get(longIndex).length() < a.get(i).length())
				longIndex = i;
		}
		
		System.out.println("가장 긴 이름은" + a.get(longIndex));
		scanner.close();
	}
}
