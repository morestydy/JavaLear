package day07;

public class TestThread extends Thread{
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		System.out.println("���߳�����");
		for(int i=0;i<5;i++) {
			System.out.println("�߼�����"+i);
		}
	}
}
