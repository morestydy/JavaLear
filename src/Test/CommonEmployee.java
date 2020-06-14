package Test;

import java.util.Scanner;

public class CommonEmployee extends Employee{
	Scanner in = new Scanner(System.in);
	int id=in.nextInt();
	String name=in.next();
	int salary=in.nextInt();
	
	public void setCommonEmployeeInfo(int id,String name,int salary) {
		super.id=id;
		super.name=name;
		super.salary=salary;
	}
	public void getCommonEmployeeInfo(int id,String name,int salary) {
		System.out.println(super.id);
		System.out.println(super.name);
		System.out.println(super.salary);
	}
	@Override
	public void work() {
		// TODO 自动生成的方法存根
		System.out.println("Common");
	}
	
}
