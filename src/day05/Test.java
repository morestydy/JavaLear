package day05;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
//		File f = new File("E:\\sqlbackuo\\test.txt");//������.txt�ļ�
//		File f1 = new File("E:\\sqlbackuo\\test.txt");//������.txt�ļ�
////		File f1 = new File("E:\\sqlbackuo", "test.txt");
//		
//		System.out.println(f.getName());
//		System.out.println(f.getPath());
//		f.renameTo(new File("E:\\sqlbackuo\\abb.txt"));
//		System.out.println(f.getPath());
//		
//		System.out.println(f1.exists());
//		
//		File f = new File("E:\\sqlbackuo\\test.txt");//������.txt�ļ�
//		if (!f.exists()) {
//			try {
//				f.createNewFile();
//			}catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//		}
		
//		f.delete();
//		System.out.println(f.exists());
		
//		
//		File f1 = new File("E:\\sqlbackuo\\Test");//������.txt�ļ�
//		
//		f1.mkdir();

//		File f2 = new File("E:\\sqlbackuo\\Test\\bb\\cc\\aa");//������.txt�ļ�
//		f2.mkdirs();//���Ŀ¼
//		File f3 = new File("E:\\sqlbackuo");//������.txt�ļ�
//		for (String i:f3.list()) {
//			System.out.println(i);
//		}
		
//		File f4 = new File("E:\\sqlbackuo\\Test.txt");
////		if (!f4.exists()) {
////			try {
////				f4.createNewFile();
////			} catch (IOException e) {
////				// TODO �Զ����ɵ� catch ��
////				e.printStackTrace();
////			}
////		}
//		if (f4.exists()) {
//			f4.delete();
//		}
		
		
		//����E:\\sqlbackuo,���е�Ŀ¼���ļ�ȫ������
		
		//�ݹ�
		File f5 = new File("E:\\sqlbackuo");
		new Test().getFil(f5);
	}
	
	public void getFil(File f) {
		if(f.isFile()) {
			System.out.println(f.getPath()+" ���ļ�");
		} else {
			System.out.println(f.getAbsolutePath()+" Ŀ¼");
			
			File[] file = f.listFiles();
			if (file != null && file.length > 0) {
				for (File ff : file) {
					getFil(ff);
				}
			}

		}
	}
}
