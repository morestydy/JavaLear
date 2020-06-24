package csdn;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		System.out.println("+++++++++++++++++++++");
		System.out.println(a);
		int b=0;
		System.out.println(b=a==10?5:3);
		in.close();
	}
	 
}
