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
		 * ִ��test1��test2ʱ,��ִ��ǰ��ӡtest1��test2��ʼִ��,
		 * ִ�к�,��ӡtest1��test2����
		 * ��ӡ�ķ������͵��÷���һ��
		 */
		
		InvocationHandler handler = new ProxyDemo(test);
		/***
		 * ����1���������������,
		 * ����2������Ķ���Ľӿ�,
		 * ����3�������;
		 * 
		 * 
		 * ����ֵ�ǳɹ�����������,���ص���Object,��������ת������
		 */
//		ITestDemo t = (ITestDemo) Proxy.newProxyInstance(handler.getClass().getClassLoader(), test.getClass().getInterfaces(), handler);
//		t.Test1();
//		t.Test2();
		System.out.println("this\s+is\s+text");
		
	}
}
