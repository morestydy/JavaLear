package day02;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		//TreeSet��Ȼ����
		set.add(5);
		set.add(4);
		set.add(3);
		set.add(2);
		System.out.println(set);
//		set.contains(o);
//		set.remove(o);
//		set.clear();
		
//		for (Object obj:set) {
//			System.out.println(obj);
//		}
//		
//		Iterator<Integer> it = set.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		Person p1=new Person("����",23);
		Person p2=new Person("��",25);
		Person p3=new Person("��",26);
		Person p4=new Person("��",18);
		
		TreeSet<Person> s=new TreeSet<Person>(new Person());
//		treeset�Ĺ��췽����
//		new Person�൱�ڴ���һ���Ƚ�����TreeSet�ͻᰴ�ձȽ����е�˳������
//		TreeSet��������Ҫ�Ĺ��캯�����޲ε�ʹ�õ�����Ȼ˳��Comparable����
//		�вεĴ���Ĳ�������ΪComparator���ͣ��Ƚ�ʱ����Comparator����ıȽϷ������бȽ�
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);

		for(Person p: s) {
			System.out.println(p.name+":"+p.age);
		}
	}
}
class Person implements Comparator<Person>{//����TreesSet,������������
	int age;
	String name;
	public Person() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	public Person( String name,int age) {
		this.age = age;
		this.name = name;
	}


	@Override
	public int compare(Person o1, Person o2) {
		if ( o1.age>o2.age) {
			return 1;
		}else if( o1.age<o2.age){
			return -1;
		}else {
			return 0;
		}
		
	}
}