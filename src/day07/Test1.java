package day07;

public class Test1 {
	public static void main(String[] args) {
		TestRun run0 = new TestRun();
		TestRun run1 = new TestRun();
		
		Thread t0 = new Thread(run0);
		Thread t1 = new Thread(run1);
//		t0.setName("线程0");
//		t0.setPriority(1);
//		t1.setPriority(1);
		t0.start();
		t1.start();
		
//		System.out.println(t0.getName());//系统配置默认名称
		System.out.println("+++++++++++++++++++1");
		System.out.println("+++++++++++++++++++2");
		System.out.println(t0.isAlive());
		t0.stop();
		System.out.println(t0.isAlive());
//		try {
//			t0.join();
//			/**
//			 * 相当于把t0.run代码插入到此位置
//			 * 先执行join方法,执行完毕后再继续执行
//			 */
//		} catch (InterruptedException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
		System.out.println("===================3");
		
		/**
		 * 
		 * 线程优先级
		 * 优先级1-10,默认为5
		 */
//		System.out.println("优先级"+t0.getPriority());
		
		
	}
}
class TestRun implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		System.out.println(Thread.currentThread().getName()+"多线程运行Runnable");
		for(int i=0;i<5;i++) {
//			try {
//				Thread.sleep(1000);//当前线程延时1000ms
//				//循环每隔1000ms循环一次
//			} catch (InterruptedException e) {
//				// TODO 自动生成的 catch 块
//				e.printStackTrace();
//			}
//			if (i%2==0) {
//				Thread.yield();//线程让步
//			}

			System.out.println("逻辑代码Runnable"+i);
			
		}
	}
	
}