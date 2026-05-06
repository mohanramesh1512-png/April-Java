package Day_10;

public class persons {
	private int age;
	
	public persons(int age) throws ageException {
		// TODO Auto-generated constructor stub
		validate(age);
		this.age=age;
	}
	public void validate(int age) throws ageException
	{
		if(age<=15)
		{
			throw new ageException("Age must be above 15");
		}
	}
	public int getAge() {
		return age;
	}

}
