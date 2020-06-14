package day05;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class Test8 {
	public static void main(String[] args) {
		try {
//			Test8.testRandomAcessFileWrite();
			Test8.testRandomAcessFileRead();
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
	public static void testRandomAcessFileWrite() throws Exception{
		RandomAccessFile ra = new RandomAccessFile("D:\\\\eclipse\\\\java\\\\demo\\\\src\\\\day05\\\\a.txt", "rw");
		
		ra.seek(ra.length());
		
		ra.write("���".getBytes());
		ra.close();
	}
	
	public static void testRandomAcessFileRead() throws Exception {
		RandomAccessFile rd = new RandomAccessFile("D:\\\\eclipse\\\\java\\\\demo\\\\src\\\\day05\\\\a.txt","r");
		int len=0;
		byte[] b = new byte[100];
		
		while ((len=rd.read(b)) != -1) {
			System.out.println(new String(b));
		}
		rd.close();
	}
}
