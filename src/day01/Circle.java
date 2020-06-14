package day01;

public class Circle {
	public double radius;

	public Circle() {
		super();
		this.radius = 1;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double findArea() {
		return 2*3.14*radius;
	}
	
	

}
