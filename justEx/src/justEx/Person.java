package justEx;

public class Person {

	
	private String firtName;
	private String lastName;
	public String getFirtName() {
		return firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String firtName, String lastName) {
		super();
		this.firtName = firtName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Person [firtName=" + firtName + ", lastName=" + lastName + "]";
	}
	
	
}
