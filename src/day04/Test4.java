package day04;

public class Test4 {
	public static void main(String[] args) {
		Season spring=Season.SPRING;
		spring.showInfo();
	}
}
enum Season implements ITest{//ö����
	SPRING("Spring","like"),//�൱�ڵ���Season()����
	SUMMER("Summer","panv"),
	AUTUMN("Autumn","skjbc"),
	WINTER("Winter","slvdbk");
	private final String name;
	private final String desc;
	private Season(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	public void showInfo() {
		System.out.println(this.name+":"+this.desc);
	}
	@Override
	public void test() {
		// TODO �Զ����ɵķ������
		
	}
}

interface ITest{
	void test();
}