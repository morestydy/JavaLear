package day04;

public class Test1 {
	public static void main(String[] args) {
		
	}
}
interface IB<T>{
	T test(T t);
}

class B1<T> implements IB<T>{
	public T test(T t) {
		return t;
	};
}

class B2 implements IB<String>{

	@Override
	public String test(String t) {
		// TODO �Զ����ɵķ������
		return null;
	}
}
class C1<E>{
	
	private E e;
	public <T> void test(T s) {
		// TODO �Զ����ɵķ������
		//�����϶���ķ���,��������ͨ�ķ�����ʹ�������
		System.out.println(this.e);
		T t=s;
	}
	
	public <T> T test1(T s) {
		return s;
	}
	public <T> void test2(T...strs) {
		for (T s:strs) {
			System.out.println(s);
		}
	}
}