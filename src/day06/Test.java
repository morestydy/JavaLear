package day06;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
//		Class clazz=p.getClass();
		
//		Class c1 = Person.class;
		
		try {
			Class c2 = Class.forName("day06.Person");
			System.out.println(c2);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}
}
