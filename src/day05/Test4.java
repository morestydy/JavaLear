package day05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Tom
 *
 *缓冲字符流
 */
public class Test4 {
	public static void main(String[] args) {
//		Test4.testBufferedReader();
//		Test4.testBufferedWriter();
		
		Test4.copyFile("E:\\sqlbackuo\\Test\\bb\\a2.txt", "E:\\sqlbackuo\\Test\\bb\\a3.txt");
	}
	
	/**
	 * 
	 * 缓冲字符输入流
	 */
	public static void testBufferedReader() {
		try {
			FileReader r = new FileReader("E:\\sqlbackuo\\Test\\bb\\a.txt");
			
			BufferedReader br = new BufferedReader(r);
			
			char[] c = new char[100];
			
			int len = 0;
			
			while((len=br.read(c)) != -1) {
				System.out.println(new String(c, 0, len));
			}
			br.close();
			r.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	public static void testBufferedWriter() {
		
		try {
			FileWriter w = new FileWriter("E:\\sqlbackuo\\Test\\bb\\a2.txt");
			BufferedWriter bw = new BufferedWriter(w);
			String str = "aiusbckj";
			
			bw.write(str);
			bw.flush();
			bw.close();
			w.close();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	/**	
	 * 复制文件
	 * @param inPath:源文件
	 * @param outPath:目标文件
	 */
	public static void copyFile(String inpath,String outpath) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(inpath));
			BufferedWriter bw = new BufferedWriter(new FileWriter(outpath));
			
			char[] c = new char[100];
			
			int len = 0;
			while((len=br.read(c)) != -1) {
				bw.flush();
				bw.write(c);
			}
			bw.close();
			br.close();
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
		
	}
}
