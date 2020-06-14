package day01;

public class Kids extends ManKind{
	public int yearsOld;
	public void printAge() {
		System.out.println(yearsOld);
	}
	
	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public static void main(String[] args) {
		Kids kids = new Kids();
		kids.setSalary(100);
		kids.employeed();
	}
	@Override
	public void employeed() {
		System.out.println("job");
	}
	
}
