package Day_5;

public class Person_15B {
	private String first_name;
	private String last_name;
	private String gender;
	private int age;
	private double weight;
	
	public Person_15B(String first_name, String last_name, String gender, int age, double weight) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}
	public String getFullName() {
		return first_name+" "+ last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person Details\n"
				+ "--------------------------\n"
				+ "Full Name : " + getFullName() + "\n"
				+ "Gender : " + gender + "\n"
				+ "Age : " + age+"\n"
				+ "Weight :" + weight;
	}
	

}
