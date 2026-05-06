package Day_13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class EmployeeService {

	public static final String filename="employee.txt";
	
	public void validateEmployee(Employee e) throws EmployeeException
	{
		if(e.salary<3000)
		{
			throw new EmployeeException("Salary should be >=3000");
		}
	}
	public void writeEmployee(List<Employee> list) throws IOException
	{
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename));
		oos.writeObject(list);
		oos.close();
	}
	
	public void readEmployee() throws Exception
	{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filename));
		List<Employee> list=(List<Employee>) ois.readObject();
		for(Employee e:list)
		{
			System.out.println(e);
		}
		ois.close();
	}

}
