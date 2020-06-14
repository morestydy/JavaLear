package day02;

/**
 * A类同时或获得B类和C类的方法,并且重写
 * 
 * @author Tom
 *
 */
public class Test {
	public static void main(String[] args) {
////		A a=new A();
////		a.testB();
//		a.testC();
		
		int i=0;
		
		try {//通过异常处理处理机制的中断
			System.out.println(3/i);
		}catch (Exception e) {//当不知道捕获的是什么类型的异常时,可以直接使用Exception类
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			
		}
		System.out.println("ok");
	}
}
class A {
	public void testB() {
		new InnerB().TestB();
	}
	public void testC() {
		new InnerC().TestC();
	}
	private class InnerB extends B {
		public void TestB() {
			System.out.println("重写B");
		}
	}
	private class InnerC extends C {
		@Override
		public void TestC() {
			// TODO 自动生成的方法存根
			System.out.println("重写C");
		}
	}
}
class B {
	public void TestB() {
	}
}
class C {
	public void TestC() {
	}
}