package day07;

public class Test {
	public static void main(String[] args) {
//		Thread t0 = new TestThread();
//		Thread t1 = new TestThread();
//		t0.start();//�����߳�,��ʼ����Run()����
		System.out.println("+++++++++++++++++++");
		System.out.println("+++++++++++++++++++");
		System.out.println("===================");
//		t1.start();
		
//		Thread t2 = new Thread(new TestRunable());//ʵ��Runnable�ӿ�
//		t2.start();
//		
		Thread t3=new Thread(new TestRunable(), "t-1");
		t3.start();
	}
}

