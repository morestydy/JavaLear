package day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test1 {
	public static void main(String[] args) {
		String a="E:\\sqlbackuo\\Test\\bb\\abc.txt";
//		String b = "E:\\sqlbackuo\\Test\\bb\\a.txt";
		String c = "E:\\sqlbackuo\\Test\\bb\\cc\\abc.txt";
//		TestStream(a);
//		TestFileOutStream(b);
//		TestStream(b);
		
		Test1.copyFile(a, c);
		TestStream(c);
	}
	
	public static void TestStream(String f) {
		try {
			FileInputStream in = new FileInputStream(f);
			
			byte[] b = new byte[120];//����һ��������ն�ȡ���ļ�����
			int len=0;
			
//			len=in.read(b);//��ȡ����,����ȡ�����һ������ʱ,��������һ��,��ʱ����-1
			//������ֵΪ-1,��ȡ���
			
			while ((len=in.read(b)) != -1) {
				System.out.println(new String(b,0,len));
				//new String(b,0,len),������������,�����鿪ʼ��ʼλ��,ת�����ֽ���
			}
			
			in.close();//��ʹ�ú���ر�
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
//	�����
	public static void TestFileOutStream(String f) {
		try {
			FileOutputStream out = new FileOutputStream(f);
			
			String  str = "5SCFAlosibnv45s875�ȷ�1";
			out.write(str.getBytes());//����д���ڴ�
			out.flush();//�ڴ��е�����ˢд��Ӳ��
			out.close();//�ر���
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace(); 
		}
	}
	public static void copyFile(String f1,String f2) {
		try {
			
			FileInputStream in = new FileInputStream(f1);

			FileOutputStream out = new FileOutputStream(f2);
			byte[] b = new byte[100];
			int len = 0;
			while((len=in.read())!= -1) {
				out.write(b, 0, len);
			}
			out.flush();
			out.close();
			in.close();
			
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
}
