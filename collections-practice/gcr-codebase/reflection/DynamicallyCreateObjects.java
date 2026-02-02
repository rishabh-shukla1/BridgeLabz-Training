package reflection;

import java.lang.reflect.*;

class Student {

    int id;
    String name;

    public Student() {
        id = 101;
        name = "Rishabh";
    }

    public void display() {
        System.out.println(id + " " + name);
    }
}

public class DynamicallyCreateObjects {
	
	public static void main(String[] args) throws Exception {

        
        Class<?> cls = Class.forName("reflection.Student");
        
        Object o=cls.getDeclaredConstructor().newInstance();
        
        Student s=(Student)o;
        
        s.display();
        
	}


}
