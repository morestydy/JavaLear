package day;

public class Person {
//	private int age;
//	
//	public void setAge(int age) {
//		if ( age>=0&&age<= 130 ) this.age=age;
//		else System.out.println("error");
//		
//	}
//	public int getAge() {
//		return age;
//	}
	
	public int age;
	public String name;
//	public Person() {
//		super();
//		// TODO 自动生成的构造函数存根
//		age=1;
//		name="zhangsan";
//	}
	
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	public void showInfo(){
		System.out.println(name+age);
	}

}
