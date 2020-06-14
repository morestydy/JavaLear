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
			
			byte[] b = new byte[120];//设置一个数组接收读取的文件内容
			int len=0;
			
//			len=in.read(b);//读取长度,当读取到最后一个数据时,还会向后读一个,这时返回-1
			//当返回值为-1,读取完毕
			
			while ((len=in.read(b)) != -1) {
				System.out.println(new String(b,0,len));
				//new String(b,0,len),缓冲数据数组,从数组开始开始位置,转换的字节数
			}
			
			in.close();//流使用后须关闭
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
//	输出流
	public static void TestFileOutStream(String f) {
		try {
			FileOutputStream out = new FileOutputStream(f);
			
			String  str = "5SCFAlosibnv45s875等分1";
			out.write(str.getBytes());//数据写入内存
			out.flush();//内存中的数据刷写到硬盘
			out.close();//关闭流
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
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
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
