package day04;

public class Test2 {
	public static void main(String[] args) {
		Salary s1=new Salary("andr", "Chengu", 3, 6000);
		s1.computePay();
		s1.mailCheck();
	}
}

abstract class Employee {
	private String name;
	private String address;
	private int number;

	public Employee(String name, String address, int number) {
		System.out.println("This is an Employeer");
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getNumber() {
		return number;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double computePay() {
		System.out.println("Inside Employee computePay");
		return 0.0;
	}

	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " " + this.address);
	}

	public String toString() {
		return name + " " + address + " " + number;
	}

}

class Salary extends Employee {
	private double salary;

	public Salary(String name, String address, int number, double salary) {
		super(name, address, number);
		setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void mailCheck() {
		// TODO 自动生成的方法存根
		System.out.println("Within mailCheck of Salary class ");
		System.out.println("Mailing check to " + getName()+"\n with salary "+getSalary());
	}

}