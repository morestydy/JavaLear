package day06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

/**
 * ��̬������
 * @author Tom
 *
 */
public class ProxyDemo implements InvocationHandler{
	Object obj;//������Ķ���


	public ProxyDemo(Object obj) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO �Զ����ɵķ������
		
		System.out.println(method.getName()+" ������ʼִ��");
		Object res=method.invoke(this.obj, args);//ִ�е���ָ����������ָ���ķ���
		System.out.println(method.getName()+" ����ִ�н���");
		return res;
	}

	
}
