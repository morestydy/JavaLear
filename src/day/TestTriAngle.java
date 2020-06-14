package day;

public class TestTriAngle {
	private int x,y;
	
	public TestTriAngle(int x,int y) {
		super();
		// TODO 自动生成的构造函数存根
		this.x=x;
		this.y=y;
	}

	public double getAreas() {
		TriAngle t=new TriAngle();
		t.setBase(x);
		t.setHeight(y);
		return 0.5*t.getBase()*t.getHeight();
	}
}
