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
		// TODO 自动生成的方法存根
		return null;
	}
}
class C1<E>{
	
	private E e;
	public <T> void test(T s) {
		// TODO 自动生成的方法存根
		//在类上定义的泛型,可以在普通的方法中使用这个类
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