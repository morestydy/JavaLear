package day07;

public class Test1 {
	public static void main(String[] args) {
		TestRun run0 = new TestRun();
		TestRun run1 = new TestRun();
		
		Thread t0 = new Thread(run0);
		Thread t1 = new Thread(run1);
//		t0.setName("�߳�0");
//		t0.setPriority(1);
//		t1.setPriority(1);
		t0.start();
		t1.start();
		
//		System.out.println(t0.getName());//ϵͳ����Ĭ������
		System.out.println("+++++++++++++++++++1");
		System.out.println("+++++++++++++++++++2");
		System.out.println(t0.isAlive());
		t0.stop();
		System.out.println(t0.isAlive());
//		try {
//			t0.join();
//			/**
//			 * �൱�ڰ�t0.run������뵽��λ��
//			 * ��ִ��join����,ִ����Ϻ��ټ���ִ��
//			 */
//		} catch (InterruptedException e) {
//			// TODO �Զ����ɵ� catch ��
//			e.printStackTrace();
//		}
		System.out.println("===================3");
		
		/**
		 * 
		 * �߳����ȼ�
		 * ���ȼ�1-10,Ĭ��Ϊ5
		 */
//		System.out.println("���ȼ�"+t0.getPriority());
		
		
	}
}
class TestRun implements Runnable{

	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		System.out.println(Thread.currentThread().getName()+"���߳�����Runnable");
		for(int i=0;i<5;i++) {
//			try {
//				Thread.sleep(1000);//��ǰ�߳���ʱ1000ms
//				//ѭ��ÿ��1000msѭ��һ��
//			} catch (InterruptedException e) {
//				// TODO �Զ����ɵ� catch ��
//				e.printStackTrace();
//			}
//			if (i%2==0) {
//				Thread.yield();//�߳��ò�
//			}

			System.out.println("�߼�����Runnable"+i);
			
		}
	}
	
}