package Test;


public class Test {
	public static void main(String[] args) {
		
//		String s="new";
//		Object o=s;
//		System.out.println(o);
//		
//		Object object="he";
//		Test t=(Test) object;
//		
//		Test t=new Test();
//		t.method(new Person());
////		t.method(new Student());
//		Integer i=new Integer(123);
//		
//		System.out.println(i);
		
//		int i=Integer.parseInt("123");
//		boolean b = Boolean.parseBoolean("false");
//		float f=Float.parseFloat("123");
//		String intStr=1234+"5";
//		System.out.println(intStr);
		
		
//		Chinese c=new Chinese();
//		Chinese c1=new Chinese();
//		Chinese c2=new Chinese();
//		c.country="China";
//		Chinese.country="China";
//		c.name="xx";
//		c.age=11;
//		
//		System.out.println(c.country);
//		System.out.println(c1.country);
//		System.out.println(c2.country);
		
//		Chinese.Chinese();
//		String s="";
//		System.out.println(Chinese.isEmpty(s));
//		
		
//		Single s=new Single();
//		Single single=Single.getInStance();
//		
//		Single instance=Single.getInstance();
		

//		Dog d=new Dog();
//		d.move();
//		
//		CommonEmployee c=new CommonEmployee();
//		c.work();
		
//		TestTemplate t = new TestTemplate();
//		t.getTime();
//		
//		Teacher t=new Teacher("xiaoming","teacher");
//		t.showInfo();
		
		int[] num= {3,2,3};
		int[] a;
		int target=6;
		solution s=new solution();
		a=s.twoSum(num, target);
		for(int i:a) {
			System.out.println(i);
		}
		
	}
	
	
	
	public void method(Person p) {
		if(p instanceof Student) {
			((Student) p).getSchool();
		}else {
			p.test();
		}
	}
}
