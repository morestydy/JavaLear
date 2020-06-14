package day05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化反序列化
 * @author Tom
 *
 */
public class Test5 {
	public static void main(String[] args) {
		try {
//			Test5.testSerialize();
			Test5.testDeserialize();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	public static void testSerialize() throws Exception{
		//定义对象的输出流
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:\\sqlbackuo\\Test\\bb\\abc.txt"));
		Person p = new Person();
		p.name="xshngsan";
		p.age=11;
		
		out.writeObject(p);
		out.flush();
		out.close();
	}
	/**
	 * 反序列化
	 */
	public static void testDeserialize() throws Exception{
		//创建对象输入流对象,将序列化的流读取出来
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\sqlbackuo\\Test\\bb\\abc.txt"));
		Object obj = in.readObject();
		Person p = (Person) obj;
		
		System.out.println(p.name+"-----"+p.age);
		in.close();
	}

}
