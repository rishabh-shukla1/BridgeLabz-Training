package reflection;

import java.lang.reflect.*;

class Calculators {

	 public void add() {
	     for (int i = 0; i < 1_000_000; i++); 
	 }
	
	 public void multiply() {
	     for (int i = 0; i < 2_000_000; i++); 
	 }
}


class TimeProfiler {

	 public static void measure(Object obj, String methodName) throws Exception {
	
	     Class<?> cls = obj.getClass();
	     Method method = cls.getMethod(methodName);
	
	     long start = System.nanoTime();   
	     method.invoke(obj);               
	     long end = System.nanoTime();    
	
	     System.out.println(methodName + " executed in " + (end - start) + " ns");
	 }
}

//Main
public class MethodExecutionTiming {
 public static void main(String[] args) throws Exception {

     Calculators c = new Calculators();

     TimeProfiler.measure(c, "add");
     TimeProfiler.measure(c, "multiply");
 }
}

