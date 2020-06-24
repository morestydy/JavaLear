package day07;

public class Test2 {
	public static void main(String[] args) {
		Account a = new Account();
		
		//多线程对象
		User u_wx = new User(a, 2000);
		User u_zfb = new User(a, 2000);
		Thread wx = new Thread(u_wx,"微信");
		Thread zfb = new Thread(u_zfb,"支付宝");
		wx.start();
		zfb.start();
	}
}

class Account{
	public static int money=3000;

	/**
	 * 判断钱够不够
	 * 问题:线程共享资源时,一个线程在执行这个方法没有完毕时,另一个线程又开始执行这个方法
	 * 先让一个线程执行完
	 * 通过synchronized同步锁来完成
	 * 可以直接在方法前加上synchronized关键字
	 * 
	 * 在普通方法上加synchronized,锁的是整个对象,不是某一个方法
	 * @param m
	 */

	public synchronized void drawinng(int m) {	
		String name=Thread.currentThread().getName();
		if (money < m) {
			System.out.println(name+"金额不足:"+money);
		}else {
			System.out.println(name+"操作,账户原有金额"+money);
			System.out.println(name+"操作,取款金额:"+m);
			money=money-m;
			System.out.println(name+"操作,取款后余额:"+money);
		}

	}
	
	public synchronized void drawinng1(int m) {	
		String name=Thread.currentThread().getName();
		
		
		if (money < m) {
			System.out.println(name+"金额不足:"+money);
		}else {
			System.out.println(name+"操作,账户原有金额"+money);
			System.out.println(name+"操作,取款金额:"+m);
			money=money-m;
			System.out.println(name+"操作,取款后余额:"+money);
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
		// TODO 自动生成的方法存根
		if (Thread.currentThread().getName().equals("微信")) {
			account.drawinng(money);
		}else {
			account.drawinng1(money);
		}
		
	}
	
}