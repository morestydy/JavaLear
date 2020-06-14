package day05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test7 {
	public static void main(String[] args) {
		Animal dog = new Animal();
		dog.legs=4;
		dog.name="dog";
		try {
//			Test7.testSerialize(dog);
			Test7.testDecSerialize();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	public static void testSerialize(Object obj) throws Exception{
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\\\eclipse\\\\java\\\\demo\\\\src\\\\day05\\\\a3.txt"));
		out.writeObject(obj);
		out.flush();
		out.close();
	}
	
	public static void testDecSerialize() throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\\\eclipse\\\\java\\\\demo\\\\src\\\\day05\\\\a3.txt"));
		Object obj = in.readObject();
		Animal dog = (Animal) obj;
		System.out.println(dog.name+"有"+dog.legs+"条腿");
		in.close();
	}
}

