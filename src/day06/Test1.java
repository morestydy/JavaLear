package day06;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("day06.Student");
			
//			Class superClass=clazz.getSuperclass();//获取父类
//			
//			System.out.println(superClass.getName());
//			Class[] interfaces = clazz.getInterfaces();//获取接口
//			for ( Class i: interfaces) {
//				System.out.println(i.getName());
//			}
//			Constructor[] cons=clazz.getConstructors();//获取构造方法,只public
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
//			Constructor[] cons1=clazz.getDeclaredConstructors();//获取所有构造方法,包括public和private
//			System.out.println("----------------");
//			for(Constructor c:cons1) {
//				System.out.println(c.getName()+":"+c.getModifiers());
//
//				Class[] ParameterTypes=c.getParameterTypes();
//				for (Class xlz:ParameterTypes) {
//					System.out.println(xlz);
//				}
//			}
			
			//通过反射创建一个对象
			try {
//				Student stu=(Student) clazz.newInstance();//得到Student对象,
				
				
//				Constructor c=clazz.getConstructor(String.class);
//				Student s=(Student) c.newInstance("asopcm school");
//				System.out.println(s.school);
				
//				Constructor c1=clazz.getDeclaredConstructor(String.class,int.class);//获取所有构造方法,包括public和private
//				c1.setAccessible(true);//解除私有的封装
//				Student s1 = (Student) c1.newInstance("asc",55);
				
				
//				Field[] fs=clazz.getFields();//获取公有属性
//				for(Field f:fs) {
//					System.out.println(f.getModifiers()+"+"+f.getType()+"+"+f.getName());
//				}
//				System.out.println("++++++++++++++++++++");
//				Field[] fs1=clazz.getDeclaredFields();
//				for(Field f:fs1) {
//					System.out.println(f.getModifiers()+"+"+f.getType()+"+"+f.getName());
//				}
				Constructor con=clazz.getConstructor();//获取无参构造
				Method m = clazz.getMethod("setInfo", String.class,String.class);//得到名称为setInfo,参数String
				m.invoke(con.newInstance(), "张三","scjool");//参数1:实例化对象,2调用当前实际参数
				
				Method m1 = clazz.getDeclaredMethod("test", String.class);
				m1.setAccessible(true);//强制调用私有方法
				m1.invoke(con.newInstance(), "iniasschool");
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
