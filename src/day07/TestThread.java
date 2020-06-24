package day07;

public class TestThread extends Thread{
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		System.out.println("多线程运行");
		for(int i=0;i<5;i++) {
			System.out.println("逻辑代码"+i);
		}
	}
}
