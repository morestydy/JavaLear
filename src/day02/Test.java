package day02;

/**
 * A��ͬʱ����B���C��ķ���,������д
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
		
		try {//ͨ���쳣��������Ƶ��ж�
			System.out.println(3/i);
		}catch (Exception e) {//����֪���������ʲô���͵��쳣ʱ,����ֱ��ʹ��Exception��
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
			System.out.println("��дB");
		}
	}
	private class InnerC extends C {
		@Override
		public void TestC() {
			// TODO �Զ����ɵķ������
			System.out.println("��дC");
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