package Test;

public abstract class Template {
	public abstract void code();
	
	public final void getTime() {
		long start=System.currentTimeMillis();
		code();
		long end=System.currentTimeMillis();
		
		System.out.println("ִ��ʱ��:"+(end-start));
	}
}

class TestTemplate extends Template{	
	@Override
	public void code() {
		// TODO �Զ����ɵķ������
		for ( int i=0;i<5000;i++ );
	}
}

