package Test;

public abstract class Animal {
	public abstract void Test();
	
	public abstract void move();
}


class Dog extends Animal{

	@Override
	public void Test() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void move() {
		// TODO 自动生成的方法存根
		System.out.println("跑");
	}
	
}

class fish extends Animal{

	@Override
	public void Test() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void move() {
		// TODO 自动生成的方法存根
		System.out.println("游");

	}
	
}

abstract class Bird extends Animal{
	@Override
	public void move() {
		// TODO 自动生成的方法存根
		System.out.println("游");

	}
	public abstract void test();
}