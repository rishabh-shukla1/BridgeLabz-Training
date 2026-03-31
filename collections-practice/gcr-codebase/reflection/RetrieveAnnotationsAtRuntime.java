
package reflection;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author{
	
	String name() ;
}

@Author(name="Rishabh Shukla")
class Book{
	
}

public class RetrieveAnnotationsAtRuntime {
	
	public static void main(String args[]) {
		
		Class<Book> b=Book.class;
		
		Author annotation=b.getAnnotation(Author.class);
		
		System.out.print("AnnotationAuthor:-"+ annotation.name());
		
		
	}

}
