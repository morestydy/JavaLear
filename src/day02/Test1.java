package day02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		System.out.println(s);
		//遍历,迭代器
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//for each迭代
		for (Object obj:s) {
			System.out.println(obj);
		}
		
		
		//让集合只能存同样类型的对象,泛型
		Set<String> s1=new HashSet<String>();//指定String为集合的泛型
		s1.add("abc");
//		s1.add(1);
		
	}
}
