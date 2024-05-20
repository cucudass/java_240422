package qustion08;

public class Person {
	public String lastName;
	public String firstName;
	
	public String getLastName() { return lastName; }
	public String getFirstName() { return firstName; }
	
	public int getLength() {
		return (firstName + lastName).length();
	}
}
