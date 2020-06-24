package day07;

public class Test {
	public static void main(String[] args) {
//		Thread t0 = new TestThread();
//		Thread t1 = new TestThread();
//		t0.start();//启动线程,开始运行Run()方法
		System.out.println("+++++++++++++++++++");
		System.out.println("+++++++++++++++++++");
		System.out.println("===================");
//		t1.start();
		
//		Thread t2 = new Thread(new TestRunable());//实现Runnable接口
//		t2.start();
//		
		Thread t3=new Thread(new TestRunable(), "t-1");
		t3.start();
	}
}

