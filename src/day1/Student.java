package day1;

public class Student extends Person{
	public String sch;
	protected String name="lisi";
	protected String school="not no";
	public Student() {
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Student s=new Student();
//		s.showInfo();
//		Person p=new Student();
//		p.showInfo();
//		
		Student s=new Student();
		Person p=new Person();
		Person c=new Student();
		
		Object o=new Person();
//		System.out.println(c instanceof Person);
//		System.out.println(c instanceof Student);
//		System.out.println(p instanceof Student);
		System.out.println(p.equals(s));
	}
	@Override
	public void showInfo() {
		// TODO �Զ����ɵķ������
		System.out.println("hello");
	}

	public String getSchool() {
		return school;
	}
	public String getInfo() {
		return super.getInfo()+"\n school:"+school;
	}

}
