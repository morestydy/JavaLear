package day05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���л������л�
 * @author Tom
 *
 */
public class Test5 {
	public static void main(String[] args) {
		try {
//			Test5.testSerialize();
			Test5.testDeserialize();
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
	public static void testSerialize() throws Exception{
		//�������������
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:\\sqlbackuo\\Test\\bb\\abc.txt"));
		Person p = new Person();
		p.name="xshngsan";
		p.age=11;
		
		out.writeObject(p);
		out.flush();
		out.close();
	}
	/**
	 * �����л�
	 */
	public static void testDeserialize() throws Exception{
		//������������������,�����л�������ȡ����
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:\\sqlbackuo\\Test\\bb\\abc.txt"));
		Object obj = in.readObject();
		Person p = (Person) obj;
		
		System.out.println(p.name+"-----"+p.age);
		in.close();
	}

}
