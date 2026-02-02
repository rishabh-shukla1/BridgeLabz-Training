package reflection;

import java.lang.reflect.*;


interface Greeting 
{
  void sayHello(String name);
}


class GreetingImpl implements Greeting
{
	 public void sayHello(String name) 
	 {
	     System.out.println("Hello " + name);
	 }
}


class LoggingHandler implements InvocationHandler {

 private Object target;

	 public LoggingHandler(Object target) 
	 {
	     this.target = target;
	 }

 public Object invoke(Object proxy, Method method, Object[] args) throws Throwable 
 {

     System.out.println("Calling method:-" + method.getName());
     return method.invoke(target, args);
 }
 
}

//Main class
public class ProxyReflection {
 public static void main(String[] args) {

     Greeting real = new GreetingImpl();

     Greeting proxy = (Greeting) Proxy.newProxyInstance(
             Greeting.class.getClassLoader(),
             new Class[]{Greeting.class},
             new LoggingHandler(real)
     );

     proxy.sayHello("Rishabh");
 }
}
