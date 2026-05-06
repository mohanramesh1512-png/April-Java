package Day_13;

import java.util.ArrayList;

public class EmployeeMain {
	public static void main(String[] args)
	{
		EmployeeService service=new EmployeeService();
		ArrayList<Employee> list=new ArrayList<>();
		try
		{
			Employee e1=new Employee(1,"Mohan",4000,"Senior Developer");
			Employee e2=new Employee(2,"Roshan",6000,"Manager");
			Employee e3=new Employee(3,"ajay",1000,"Junior Developer");
			
			service.validateEmployee(e1);
			list.add(e1);
			service.validateEmployee(e2);
			list.add(e2);
			service.validateEmployee(e3);
			list.add(e3);
		}
		catch(EmployeeException ee)
		{
			System.out.println("Validation error: "+ee.getMessage());
		}
		try
		{
			service.writeEmployee(list);
			System.out.println("\nReading from File:");
			service.readEmployee();
		}
		catch(Exception e)
		{
			System.out.println("File Error: "+e);
		}
	}
}
