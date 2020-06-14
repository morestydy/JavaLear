package day06;

import java.lang.reflect.Constructor;

public class Test1 {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("day06.Student");
			
			Class superClass=clazz.getSuperclass();//��ȡ����
			
			System.out.println(superClass.getName());
			Class[] interfaces = clazz.getInterfaces();//��ȡ�ӿ�
			for ( Class i: interfaces) {
				System.out.println(i.getName());
			}
			Constructor[] cons=clazz.getConstructors();
			System.out.println("----------------");
			for(Constructor c:cons) {
				System.out.println(c.getName()+":"+c.getModifiers());
			}
			
			
			Constructor[] cons1=clazz.getDeclaredConstructors();
			System.out.println("----------------");
			for(Constructor c:cons1) {
				System.out.println(c.getName()+":"+c.getModifiers());
			}
			
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
