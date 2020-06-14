package day02;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("d");
		list.add("c");
		list.add("b");
		list.add("a");
		list.add("b");
		list.add("c");
//		System.out.println(list.get(2));
//		for (Object obj:list) {
//			System.out.println(obj);
//		}
		
		List<String> l = new ArrayList<String>();
		l.add("123");
		l.add("456");
		
		list.addAll(2, l);
//		System.out.println(list.get(2));
		for (Object obj:list) {
			System.out.println(obj);
		}
	}
}
