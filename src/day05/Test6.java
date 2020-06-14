package day05;

import java.io.RandomAccessFile;

public class Test6 {

	/**
	 * �ļ����
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Test6.testRandomAcessFileRead();
//			Test6.testRandomAcessFileWrite();
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
	public static void testRandomAcessFileRead() throws Exception{
		//�ļ�·��,����ģʽ(���r,rw)
		RandomAccessFile ra = new RandomAccessFile("D:\\eclipse\\java\\demo\\src\\day05\\a.txt", "r");
		
		ra.seek(10);//��ȡ�ļ���ʼ��
		byte[] b = new byte[1024];
		int len = 0;
		
		while( (len=ra.read(b))!=-1 ) {
			System.out.println(new String(b, 0, len));
		}
		ra.close();
	}
	
	public static void testRandomAcessFileWrite() throws Exception{
		RandomAccessFile ra = new RandomAccessFile("D:\\\\eclipse\\\\java\\\\demo\\\\src\\\\day05\\\\a2.txt", "rw");
		
		ra.seek(ra.length());//����д����ʼ��,0����ӿ�ͷ,ra.length���ļ����д
		
		ra.write("HelloWorld".getBytes());
		
		ra.close();
		
	}
}
