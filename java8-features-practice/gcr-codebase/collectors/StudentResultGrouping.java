package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    String getName() { return name; }
    String getGrade() { return grade; }
}


public class StudentResultGrouping {
	
	public static void main(String args[]) {
		
		List<Student> students = List.of(
			    new Student("Ravi", "A"),
			    new Student("Amit", "B"),
			    new Student("Neha", "A"),
			    new Student("Priya", "B")
			);
		
		
	Map<String,List<String>> r=students.stream().collect(Collectors.groupingBy(c->c.grade,Collectors.mapping(c->c.name, Collectors.toList())));
		
		System.out.println(r);
	}

}
