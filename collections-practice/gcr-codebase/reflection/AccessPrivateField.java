package reflection;
import java.lang.reflect.*;

class Person {
    private int age = 20;

    public void show() {
        System.out.println("Age: " + age);
    }
}

public class AccessPrivateField {
	
	public static void main(String args[]) throws Exception {
		
		
		Person p=new Person();
		
		Class<?> c=p.getClass();
		
		Field f=c.getDeclaredField("age");
		
		f.setAccessible(true);
		
		int value=(int)f.get(p);
		
		 System.out.println("Old Age: " + value);
		
		f.set(p, 25);
		
		int newvalue=(int)f.get(p);
		
		 System.out.println("New Age: " + newvalue);
	}

}
