package Test;

public class Single {
	private Single() {
		
	}
	
	private static Single single=new Single();
	private static Single instance=null;
	public static Single getInStance() {
		return single;
	}
	public static Single getInstance() {
		if(instance ==null) {
			instance=new Single();
		}
		return instance;
	}
	
}
