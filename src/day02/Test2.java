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
		//TreeSet自然排序
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
		
		Person p1=new Person("张三",23);
		Person p2=new Person("张",25);
		Person p3=new Person("李",26);
		Person p4=new Person("吴",18);
		
		TreeSet<Person> s=new TreeSet<Person>(new Person());
//		treeset的构造方法，
//		new Person相当于传入一个比较器。TreeSet就会按照比较器中的顺序排序
//		TreeSet有两个主要的构造函数，无参的使用的是自然顺序（Comparable），
//		有参的传入的参数类型为Comparator类型，比较时按照Comparator对象的比较方法进行比较
		s.add(p1);
		s.add(p2);
		s.add(p3);
		s.add(p4);

		for(Person p: s) {
			System.out.println(p.name+":"+p.age);
		}
	}
}
class Person implements Comparator<Person>{//存入TreesSet,按照年龄排序
	int age;
	String name;
	public Person() {
		// TODO 自动生成的构造函数存根
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