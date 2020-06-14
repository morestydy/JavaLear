package day05;

import java.io.RandomAccessFile;

public class Test6 {

	/**
	 * 文件随机
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Test6.testRandomAcessFileRead();
//			Test6.testRandomAcessFileWrite();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	public static void testRandomAcessFileRead() throws Exception{
		//文件路径,访问模式(最常用r,rw)
		RandomAccessFile ra = new RandomAccessFile("D:\\eclipse\\java\\demo\\src\\day05\\a.txt", "r");
		
		ra.seek(10);//读取文件起始点
		byte[] b = new byte[1024];
		int len = 0;
		
		while( (len=ra.read(b))!=-1 ) {
			System.out.println(new String(b, 0, len));
		}
		ra.close();
	}
	
	public static void testRandomAcessFileWrite() throws Exception{
		RandomAccessFile ra = new RandomAccessFile("D:\\\\eclipse\\\\java\\\\demo\\\\src\\\\day05\\\\a2.txt", "rw");
		
		ra.seek(ra.length());//设置写的起始点,0代表从开头,ra.length从文件最后写
		
		ra.write("HelloWorld".getBytes());
		
		ra.close();
		
	}
}
