package day;

public class TestPoint {
	private int x,y,z;

	public TestPoint(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int remXPoint(int i) {
		return this.x+i;
	}
	public int remYPoint(int i) {
		return this.y+i;
	}
	public int remZPoint(int i) {
		return this.z+i;
	}

}
