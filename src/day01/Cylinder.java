package day01;

public class Cylinder extends Circle{
	public double length;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public double findVliume() {
		return 2*3.14*radius*length;
	}
	public double findAr() {
		return super.findArea();
	}
	
}
