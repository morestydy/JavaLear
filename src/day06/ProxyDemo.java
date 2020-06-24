package day06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

/**
 * 动态代理类
 * @author Tom
 *
 */
public class ProxyDemo implements InvocationHandler{
	Object obj;//被代理的对象


	public ProxyDemo(Object obj) {
		this.obj=obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO 自动生成的方法存根
		
		System.out.println(method.getName()+" 方法开始执行");
		Object res=method.invoke(this.obj, args);//执行的是指定代理对象的指定的方法
		System.out.println(method.getName()+" 方法执行结束");
		return res;
	}

	
}
