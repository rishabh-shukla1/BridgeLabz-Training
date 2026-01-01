package constructor;

public class Person 
{
	    private String name;
	    private int age;

	    //Parameterized constructor
	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    //Copy constructor
	    Person(Person p) {
	        this.name = p.name;
	        this.age = p.age;
	    }

	    public void display() 
	    {
	        System.out.println("Name:-" + name + " | Age:- " + age);
	    }

	    public static void main(String[] args) 
	    {
	    	//original object
	        Person p1 = new Person("Rishabh", 21); 
	        // cloned object
	        Person p2 = new Person(p1);             

	        System.out.println("Original Person:-");
	        p1.display();

	        System.out.println("Copied Person:-");
	        p2.display();
	    }

		   


}
