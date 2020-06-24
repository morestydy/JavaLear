package day07;

public class Test2 {
	public static void main(String[] args) {
		Account a = new Account();
		
		//���̶߳���
		User u_wx = new User(a, 2000);
		User u_zfb = new User(a, 2000);
		Thread wx = new Thread(u_wx,"΢��");
		Thread zfb = new Thread(u_zfb,"֧����");
		wx.start();
		zfb.start();
	}
}

class Account{
	public static int money=3000;

	/**
	 * �ж�Ǯ������
	 * ����:�̹߳�����Դʱ,һ���߳���ִ���������û�����ʱ,��һ���߳��ֿ�ʼִ���������
	 * ����һ���߳�ִ����
	 * ͨ��synchronizedͬ���������
	 * ����ֱ���ڷ���ǰ����synchronized�ؼ���
	 * 
	 * ����ͨ�����ϼ�synchronized,��������������,����ĳһ������
	 * @param m
	 */

	public synchronized void drawinng(int m) {	
		String name=Thread.currentThread().getName();
		if (money < m) {
			System.out.println(name+"����:"+money);
		}else {
			System.out.println(name+"����,�˻�ԭ�н��"+money);
			System.out.println(name+"����,ȡ����:"+m);
			money=money-m;
			System.out.println(name+"����,ȡ������:"+money);
		}

	}
	
	public synchronized void drawinng1(int m) {	
		String name=Thread.currentThread().getName();
		
		
		if (money < m) {
			System.out.println(name+"����:"+money);
		}else {
			System.out.println(name+"����,�˻�ԭ�н��"+money);
			System.out.println(name+"����,ȡ����:"+m);
			money=money-m;
			System.out.println(name+"����,ȡ������:"+money);
		}
		
	}
}

class User implements Runnable{
	Account account;
	int money;

	public User(Account account, int money) {
		this.account = account;
		this.money = money;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		if (Thread.currentThread().getName().equals("΢��")) {
			account.drawinng(money);
		}else {
			account.drawinng1(money);
		}
		
	}
	
}