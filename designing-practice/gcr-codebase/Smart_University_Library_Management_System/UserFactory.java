package Smart_University_Library_Management_System;

interface User  extends Observer{
    void showRole();
}

interface Observer{
	
	void update(String info);
	
}

class Student implements User {
	
	@Override
    public void showRole() {
        System.out.println("Student user");
    }

	@Override
	public void update(String info) {
	
		 System.out.println("Student notified: " + info);
	}
}

class Faculty implements User {
	@Override
    public void showRole() {
        System.out.println("Faculty user");
    }

	@Override
	public void update(String info) {
		// TODO Auto-generated method stub
		System.out.println("Faculty notified: " + info);
		
	}
}

class Librarian implements User {
	@Override
    public void showRole() {
        System.out.println("Librarian user");
    }

	@Override
	public void update(String info) {
		// TODO Auto-generated method stub
		System.out.println("Librarian notified: " + info);
	}
}

public class UserFactory {
	
	public static User createUser(String role) {
		
		switch(role.toLowerCase()) {
		
		 case "student": return new Student();
		 case "faculty": return new Faculty();
         case "librarian": return new Librarian();
         default : throw new IllegalArgumentException("Invalid role");
		
		}
	}
	

}
