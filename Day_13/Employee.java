package Day_13;

import java.io.Serializable;

public class Employee implements Serializable{

	int id;
	String name;
	double salary;
	String designation;
	
	public Employee(int id, String name, double salary, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	
	@Override
	public String toString()
	{
		return id+" "+name+" "+salary+" "+designation;
	}
}
