package day06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test2 {
	public static void main(String[] args) {
		ITestDemo test = new TestDemoImpl();
		
		test.Test1();
		test.Test2();
		System.out.println("++++++++++++++++++++++++++++++++");
		/**
		 * 
		 * 执行test1和test2时,在执行前打印test1或test2开始执行,
		 * 执行后,打印test1和test2结束
		 * 打印的方法名和调用方法一致
		 */
		
		InvocationHandler handler = new ProxyDemo(test);
		/***
		 * 参数1代理对象的类加载器,
		 * 参数2被代理的对象的接口,
		 * 参数3代理对象;
		 * 
		 * 
		 * 返回值是成功被代理后对象,返回的是Object,需根据情况转换类型
		 */
//		ITestDemo t = (ITestDemo) Proxy.newProxyInstance(handler.getClass().getClassLoader(), test.getClass().getInterfaces(), handler);
//		t.Test1();
//		t.Test2();
		System.out.println("this\s+is\s+text");
		
	}
}
