package ex05.exam01.vectors;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		Vector<Point> v1 = new Vector<Point>();

		v1.add(new Point(2, 3));
		v1.add(new Point(-5, 21));
		v1.add(new Point(30, -8));
		
		for (int i = 0; i < v1.size(); i++) {
			Point p = v1.get(i);
			System.out.println(p);
		}
		
		Vector<String> v2 = new Vector<String>();
		
		v2.add("FIST");
		v2.add("SECOND");
		v2.add("THIRD");
	    
		for (String str : v2) {
			System.out.println(str);
		}
		
		Vector<Map<String, Object>> v3 = new Vector<Map<String, Object>>();
		
		Map<String, Object> s1 = new HashMap<String, Object>();
		s1.put("FIRT", 0.0f);
		s1.put("SECOND", "두번째");
		Map<String, Object> s2 = new HashMap<String, Object>();
		s2.put("세번째", 'W');
		s2.put("네번째", true);
		
		v3.add(s1);
		v3.add(s2);
		
		for (Map<String, Object> map : v3) {
			System.out.println(map);
		}
		
		v2.remove(1);
		for (String str : v2) {
			System.out.println(str);
		}
	}

}
