package day08;

/**
 * ��������������
 * @author Tom
 *
 */
public class Test {
	public static void main(String[] args) {
		Clerk c = new Clerk();
		//����ʱ������,����ʱ������
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (c) {
					while(true) {
						if (c.productNum == 0) {//��Ʒ��Ϊ0,��ʼ����
							System.out.println("=======��Ʒ��Ϊ0,��ʼ����========");
							while(c.productNum<4) {
								c.productNum++;
								System.out.println("���:"+c.productNum);
							}
							System.out.println("=======��Ʒ��Ϊ:"+c.productNum+"��������========");
							c.notify();//����������
						}else {
							try {
								c.wait();//�������̵߳ȴ�
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}, "������").start();;
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (c) {
					while(true) {
						if (c.productNum != 0) {//��Ʒ��Ϊ4,��ʼ����
							System.out.println("=======��Ʒ��Ϊ4,��ʼ����========");
							while(c.productNum>0) {
								System.out.println("���:"+c.productNum);
								c.productNum--;
							}
							System.out.println("=======��Ʒ��Ϊ:"+c.productNum+"��������========");
							c.notify();//����������
						}else {
							try {
								c.wait();//�������̵߳ȴ�
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}, "������").start();;
	}
}
class Clerk{
	public static int productNum=0;
}