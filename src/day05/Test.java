package day05;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) {
//		File f = new File("E:\\sqlbackuo\\test.txt");//对象是.txt文件
//		File f1 = new File("E:\\sqlbackuo\\test.txt");//对象是.txt文件
////		File f1 = new File("E:\\sqlbackuo", "test.txt");
//		
//		System.out.println(f.getName());
//		System.out.println(f.getPath());
//		f.renameTo(new File("E:\\sqlbackuo\\abb.txt"));
//		System.out.println(f.getPath());
//		
//		System.out.println(f1.exists());
//		
//		File f = new File("E:\\sqlbackuo\\test.txt");//对象是.txt文件
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
//		File f1 = new File("E:\\sqlbackuo\\Test");//对象是.txt文件
//		
//		f1.mkdir();

//		File f2 = new File("E:\\sqlbackuo\\Test\\bb\\cc\\aa");//对象是.txt文件
//		f2.mkdirs();//多层目录
//		File f3 = new File("E:\\sqlbackuo");//对象是.txt文件
//		for (String i:f3.list()) {
//			System.out.println(i);
//		}
		
//		File f4 = new File("E:\\sqlbackuo\\Test.txt");
////		if (!f4.exists()) {
////			try {
////				f4.createNewFile();
////			} catch (IOException e) {
////				// TODO 自动生成的 catch 块
////				e.printStackTrace();
////			}
////		}
//		if (f4.exists()) {
//			f4.delete();
//		}
		
		
		//遍历E:\\sqlbackuo,所有的目录与文件全部遍历
		
		//递归
		File f5 = new File("E:\\sqlbackuo");
		new Test().getFil(f5);
	}
	
	public void getFil(File f) {
		if(f.isFile()) {
			System.out.println(f.getPath()+" 是文件");
		} else {
			System.out.println(f.getAbsolutePath()+" 目录");
			
			File[] file = f.listFiles();
			if (file != null && file.length > 0) {
				for (File ff : file) {
					getFil(ff);
				}
			}

		}
	}
}
