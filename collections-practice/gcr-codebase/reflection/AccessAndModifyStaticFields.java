package reflection;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class AccessAndModifyStaticFields {
	
	public static void main(String[] args) throws Exception {
		
		Class<?> c=Class.forName("reflection.Configuration");
		
		Field f=c.getDeclaredField("API_KEY");
		
		f.setAccessible(true);
		
		String old=(String) f.get(c);
		
		System.out.println("Old-:"+old);
		
		f.set(c,"new_key");
		
		String n=(String)f.get(c);
		
		System.out.println("new-:"+n);
		
		
		
		
		
		
		
	}

}
