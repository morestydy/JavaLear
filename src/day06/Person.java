package day06;

public class Person {
	public String name;
	public int age;
}


class Student extends Person implements Move,Study{
	
	public Student() {
		System.out.println("public Student()");
	}

	public Student(String school) {
		this.school=school;
		System.out.println("public Student(String school)");
	}
	public String school;
	private String privateField;
	private Student(String school,int age) {
		this.school=school;
		this.age=age;
		System.out.println("private Student(String school,int age)");
	}
	@Override
	public void studyInfo() {
		// TODO 自动生成的方法存根
		System.out.println("jsbdjcaklszsn");
	}

	@Override
	public void moveType() {
		// TODO 自动生成的方法存根
		System.out.println("1965332");
	}
	public void showInfo() {
		System.out.println("学校"+this.school);
	}
	private void test(String name) {
		this.name=name;
		System.out.println("private void test(String name)");
	}
	
	public void setInfo(String name,String school) {
		this.name=name;
		this.school=school;
		System.out.println("setInfo(String name,String school)");
	}

}