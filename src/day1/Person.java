package day1;

public class Person {
	protected String name="张三";
	protected int age;
	public String getInfo() {
		return "Name:"+name+"\n age:"+age;
	}
	
//	当父类中没有空参数的构造器时,子类的构造器须通过this或super语句指定调用本类或父类中相应的构造器
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	
	public Person() {
		System.out.println("Person");
	}
	
	public void showInfo() {
		System.out.println("nihao");
	}
	
}
