package day06;

public class Person {
	public String name;
	public int age;
}


class Student extends Person implements Move,Study{
	
	public Student() {
		
	}

	public Student(String school) {
		this.school=school;
	}
	String school;
	private Student(String school,int age) {
		this.school=school;
		this.age=age;
	}
	@Override
	public void studyInfo() {
		// TODO �Զ����ɵķ������
		System.out.println("jsbdjcaklszsn");
	}

	@Override
	public void moveType() {
		// TODO �Զ����ɵķ������
		System.out.println("1965332");
	}
	public void showInfo() {
		System.out.println("ѧУ"+this.school);
	}

}