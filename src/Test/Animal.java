package Test;

public abstract class Animal {
	public abstract void Test();
	
	public abstract void move();
}


class Dog extends Animal{

	@Override
	public void Test() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void move() {
		// TODO �Զ����ɵķ������
		System.out.println("��");
	}
	
}

class fish extends Animal{

	@Override
	public void Test() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void move() {
		// TODO �Զ����ɵķ������
		System.out.println("��");

	}
	
}

abstract class Bird extends Animal{
	@Override
	public void move() {
		// TODO �Զ����ɵķ������
		System.out.println("��");

	}
	public abstract void test();
}