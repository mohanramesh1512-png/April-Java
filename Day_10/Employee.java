package Day_10;

public class Employee {
	private String firstName;
	private String lastName;
	
	public Employee( String firstName, String lastName) throws NamedException
	{
		if(firstName==null||firstName.trim().isEmpty()||lastName==null||lastName.trim().isEmpty())
		{
			throw new NamedException("FirstName and Lastname cannot be blank!!");
		}
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public String getFullName()
	{
		return firstName+" "+lastName;
	}
}
