package day07;

/**
 * 实现Runnable接口
 * @author Tom
 *
 */
public class TestRunable implements Runnable{

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		System.out.println(Thread.currentThread().getName()+"多线程运行Runnable");
		for(int i=0;i<5;i++) {
			System.out.println("逻辑代码Runnable"+i);
		}
	}
	
}
