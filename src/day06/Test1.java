package day06;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("day06.Student");
			
//			Class superClass=clazz.getSuperclass();//��ȡ����
//			
//			System.out.println(superClass.getName());
//			Class[] interfaces = clazz.getInterfaces();//��ȡ�ӿ�
//			for ( Class i: interfaces) {
//				System.out.println(i.getName());
//			}
//			Constructor[] cons=clazz.getConstructors();//��ȡ���췽��,ֻpublic
//			System.out.println("----------------");
//			for(Constructor c:cons) {
//				System.out.println(c.getName()+":"+c.getModifiers());
//				
//				System.out.println("+++++++++++++++");
//				Class[] ParameterTypes=c.getParameterTypes();
//				for (Class xlz:ParameterTypes) {
//					System.out.println(xlz);
//				}
//				
//			}
//			
//			System.out.println("***************************");
//			Constructor[] cons1=clazz.getDeclaredConstructors();//��ȡ���й��췽��,����public��private
//			System.out.println("----------------");
//			for(Constructor c:cons1) {
//				System.out.println(c.getName()+":"+c.getModifiers());
//
//				Class[] ParameterTypes=c.getParameterTypes();
//				for (Class xlz:ParameterTypes) {
//					System.out.println(xlz);
//				}
//			}
			
			//ͨ�����䴴��һ������
			try {
//				Student stu=(Student) clazz.newInstance();//�õ�Student����,
				
				
//				Constructor c=clazz.getConstructor(String.class);
//				Student s=(Student) c.newInstance("asopcm school");
//				System.out.println(s.school);
				
//				Constructor c1=clazz.getDeclaredConstructor(String.class,int.class);//��ȡ���й��췽��,����public��private
//				c1.setAccessible(true);//���˽�еķ�װ
//				Student s1 = (Student) c1.newInstance("asc",55);
				
				
//				Field[] fs=clazz.getFields();//��ȡ��������
//				for(Field f:fs) {
//					System.out.println(f.getModifiers()+"+"+f.getType()+"+"+f.getName());
//				}
//				System.out.println("++++++++++++++++++++");
//				Field[] fs1=clazz.getDeclaredFields();
//				for(Field f:fs1) {
//					System.out.println(f.getModifiers()+"+"+f.getType()+"+"+f.getName());
//				}
				Constructor con=clazz.getConstructor();//��ȡ�޲ι���
				Method m = clazz.getMethod("setInfo", String.class,String.class);//�õ�����ΪsetInfo,����String
				m.invoke(con.newInstance(), "����","scjool");//����1:ʵ��������,2���õ�ǰʵ�ʲ���
				
				Method m1 = clazz.getDeclaredMethod("test", String.class);
				m1.setAccessible(true);//ǿ�Ƶ���˽�з���
				m1.invoke(con.newInstance(), "iniasschool");
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
