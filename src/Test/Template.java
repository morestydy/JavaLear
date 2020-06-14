package Test;

public abstract class Template {
	public abstract void code();
	
	public final void getTime() {
		long start=System.currentTimeMillis();
		code();
		long end=System.currentTimeMillis();
		
		System.out.println("执行时间:"+(end-start));
	}
}

class TestTemplate extends Template{	
	@Override
	public void code() {
		// TODO 自动生成的方法存根
		for ( int i=0;i<5000;i++ );
	}
}

