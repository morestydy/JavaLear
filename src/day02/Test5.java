package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("b");
		list.add("cd");
		list.add("ca");
		list.add("a");
		list.add("1");
		list.add("1");
		System.out.println(list);
		Collections.reverse(list);//反转
		System.out.println(list);
		Collections.shuffle(list);//随机排序
		System.out.println(list);
		Collections.sort(list);//升序排列
		System.out.println(list);
		System.out.println(Collections.max(list));//最大
		System.out.println(Collections.min(list));//最xiao
		int count=Collections.frequency(list, "1");
		System.out.println(count);
		
		
//		Student s1=new Student(14,"张三");
//		Student s2=new Student(12,"Lu");
//		Student s3=new Student(13,"吴");
//		Student s4=new Student(11,"须");
//		List<Student> stus=new ArrayList<Student>();
//		stus.add(s1);
//		stus.add(s2);
//		stus.add(s3);
//		stus.add(s4);
//		
//		for (Student stu:stus) {
//			System.out.println(stu.name+":"+stu.age);
//		}
//		System.out.println("--------------------------");
//		Collections.sort(stus, new Student());
//		for (Student stu:stus) {
//			System.out.println(stu.name+":"+stu.age);
//		}
//		Collections.swap(stus, 1, 2);		//交换
//		System.out.println("--------------------------");
//		for (Student stu:stus) {
//			System.out.println(stu.name+":"+stu.age);
//		}
//		System.out.println("--------------------------");
//		Student s= Collections.max(stus, new Student());
//		System.out.println(s.name+":"+s.age);
//		System.out.println("--------------------------");
//		Student s5= Collections.min(stus, new Student());
//		System.out.println(s5.name+":"+s5.age);
		
	}
}
class  Student implements Comparator<Student>{
	int age;
	String name;
	
	public Student() {
		
	}
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int compare(Student o1, Student o2) {//年龄升序排列
		// TODO 自动生成的方法存根
		if (o1.age>o2.age) return 1;
		else if (o1.age<o2.age) return -1;
		else return 0;
	}
}