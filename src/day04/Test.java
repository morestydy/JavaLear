package day04;

import java.util.ArrayList;
import java.util.List;


public class Test {
	public static void main(String[] args) {
		A<String> a=new A<String>();//接收指定为String
		a.serKey("xxx");
		System.out.println(a.getKey());
		
	}
}
/**
 * 泛型T可以任意取名,一般使用T
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