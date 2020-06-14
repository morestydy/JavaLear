package day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class Test3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
//		Test3.testFileInput();
//		Test3.testFileOutputStream();
		String inpath = "E:\\sqlbackuo\\Test\\bb\\bb.png";
		String outpath = "E:\\sqlbackuo\\Test\\bb\\b1.png";
		
		Test3.copyFile(inpath,outpath);
	}

	public static void testFileInput() {
		try {
			FileInputStream in = new FileInputStream("E:\\sqlbackuo\\Test\\bb\\a.txt");
			byte[] b = new byte[10];//����һ��������ն�ȡ�ļ�������
			
			int len = 0;//��ȡ���ݵĳ���
//			in.read(b);
			
			while((len=in.read(b)) != -1) {
				System.out.println(new String(b, 0, len));
			}
			
			in.close();//�ر�
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	/**
	 * ���
	 * @param inpath
	 * @param ls
	 */

	public static void testFileOutputStream(String inpath,String ls) {//���
		try {
			FileOutputStream out = new FileOutputStream(inpath);
			out.write(ls.getBytes());//д���ڴ�
			out.flush();//д��Ӳ��
			out.close();
			
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} 
	}
	

/**	
 * �����ļ�
 * @param inPath:Դ�ļ�
 * @param outPath:Ŀ���ļ�
 */
	public static void copyFile(String inPath,String outPath) {
		try {
			FileInputStream in = new FileInputStream(inPath);//��ȡ��Դ�ļ�
			FileOutputStream out = new FileOutputStream(outPath);//Ŀ���ļ�

			byte[] b = new byte[100];
			int len = 0;
			
			while((len=in.read(b)) != -1) {
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
