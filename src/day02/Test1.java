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
		//����,������
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//for each����
		for (Object obj:s) {
			System.out.println(obj);
		}
		
		
		//�ü���ֻ�ܴ�ͬ�����͵Ķ���,����
		Set<String> s1=new HashSet<String>();//ָ��StringΪ���ϵķ���
		s1.add("abc");
//		s1.add(1);
		
	}
}
