package Test;

public abstract class Person1 {
	String name;
}
class Teacher extends Person1 implements Cooker,Singing{
	String work;
	int id=001;

	
	public Teacher(String name,String work) {
		super();
		this.work = work;
		this.name=name;
	}
	void showInfo(){
		System.out.println(work+name);
		coooing(this.id);
		Sing();
	}
	@Override
	public void Sing() {
		// TODO �Զ����ɵķ������
		System.out.println("Sing");
	}

	@Override
	public void coooing(int id) {
		// TODO �Զ����ɵķ������
		System.out.println(id+":"+"Cooking");
	}
	
}