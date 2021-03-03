package MyClasses;

public class Employee {
	private String name;
	private int salary;
	
	public void increaseSalay(int value) {
		salary +=value;
	}
	
	
	public String displayInfo() {
		//increaseSalary(100);
		return "Név:" + name + ", fizetés: " + salary + ", adó " + getTax();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary>0)
			this.salary = salary;
	}
	
	public boolean isInRange(int lower, int upper) {
		if(salary <= upper && salary >= lower)
			return true;
		return false;
	}
	
	private double getTax() {
		return Math.round(this.salary*0.16);
	}
	
	public boolean hasHigherSalary(Employee e) {
		if (this.salary > e.salary)
			return true;
		return false;
	}
	
	public Employee compareSalary(Employee e) {
		if (this.salary > e.salary)
			return this;
		return e;
	}
	
	
	
	
	
}
