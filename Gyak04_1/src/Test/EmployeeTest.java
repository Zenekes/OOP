package Test;

import MyClasses.Employee;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("John");
		emp.setSalary(10000);
		System.out.println(emp.displayInfo());
		emp.increaseSalay(1000);
		System.out.println(emp.displayInfo());
		
	}

}
