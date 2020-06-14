package day02;

import java.util.*;

public class Test4 {
	 public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("b", 1);
		map.put("c", 2);
		map.put("b", 3);
		map.put("e", 3);
		System.out.println(map);
		
		System.out.println(map.get("b"));
//		map.remove("b");
//		System.out.println(map);
		System.out.println(map.keySet());
		Set<String> s=map.keySet();
//		System.out.println(s);
		 	Collection<Integer> i=map.values();
//		System.out.println(i);
		
		for ( String key:s) {
			System.out.println("Key:"+key+",value:"+map.get(key));
		}
		 
		 
//		 Map<Integer, String> map=new TreeMap<Integer, String>();
//		 map.put(4, "a");
//		 map.put(2, "a");
//		 map.put(3, "a");
//		 map.put(1, "a");
//		 map.put(5, "a");
//		 System.out.println(map);
	}
}
