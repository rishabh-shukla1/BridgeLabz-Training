package collectors;

import java.util.*;
import java.util.stream.Collectors;

class Employee {

    private String department;
    private double salary;

    public Employee(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}


public class EmployeeSalaryCategorization {
	
	public static void main(String args[]) {
		
		List<Employee> employees = List.of(
			    new Employee("IT", 60000),
			    new Employee("IT", 80000),
			    new Employee("HR", 40000),
			    new Employee("HR", 50000)
			);
		
		Map<String,Double> ans=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
		
		System.out.println(ans);

	}
    

}
