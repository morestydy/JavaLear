package day1;

public class Person {
	protected String name="����";
	protected int age;
	public String getInfo() {
		return "Name:"+name+"\n age:"+age;
	}
	
//	��������û�пղ����Ĺ�����ʱ,����Ĺ�������ͨ��this��super���ָ�����ñ����������Ӧ�Ĺ�����
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
