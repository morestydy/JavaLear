package day04;

import java.util.ArrayList;
import java.util.List;


public class Test {
	public static void main(String[] args) {
		A<String> a=new A<String>();//����ָ��ΪString
		a.serKey("xxx");
		System.out.println(a.getKey());
		
	}
}
/**
 * ����T��������ȡ��,һ��ʹ��T
 * @author Tom
 *
 */
class A<T>{
	private T key;
	public void serKey(T key) {
		this.key=key;
	}
	public T getKey() {
		return this.key;
	}
}