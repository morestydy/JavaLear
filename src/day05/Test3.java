package day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class Test3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
//		Test3.testFileInput();
//		Test3.testFileOutputStream();
		String inpath = "E:\\sqlbackuo\\Test\\bb\\bb.png";
		String outpath = "E:\\sqlbackuo\\Test\\bb\\b1.png";
		
		Test3.copyFile(inpath,outpath);
	}

	public static void testFileInput() {
		try {
			FileInputStream in = new FileInputStream("E:\\sqlbackuo\\Test\\bb\\a.txt");
			byte[] b = new byte[10];//设置一个数组接收读取文件的内容
			
			int len = 0;//读取数据的长度
//			in.read(b);
			
			while((len=in.read(b)) != -1) {
				System.out.println(new String(b, 0, len));
			}
			
			in.close();//关闭
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	/**
	 * 输出
	 * @param inpath
	 * @param ls
	 */

	public static void testFileOutputStream(String inpath,String ls) {//输出
		try {
			FileOutputStream out = new FileOutputStream(inpath);
			out.write(ls.getBytes());//写入内存
			out.flush();//写入硬盘
			out.close();
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} 
	}
	

/**	
 * 复制文件
 * @param inPath:源文件
 * @param outPath:目标文件
 */
	public static void copyFile(String inPath,String outPath) {
		try {
			FileInputStream in = new FileInputStream(inPath);//读取的源文件
			FileOutputStream out = new FileOutputStream(outPath);//目标文件

			byte[] b = new byte[100];
			int len = 0;
			
			while((len=in.read(b)) != -1) {
				out.write(b, 0, len);
			}
			out.flush();
			out.close();
			in.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
