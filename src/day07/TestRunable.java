package day07;

/**
 * ʵ��Runnable�ӿ�
 * @author Tom
 *
 */
public class TestRunable implements Runnable{

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		System.out.println(Thread.currentThread().getName()+"���߳�����Runnable");
		for(int i=0;i<5;i++) {
			System.out.println("�߼�����Runnable"+i);
		}
	}
	
}
