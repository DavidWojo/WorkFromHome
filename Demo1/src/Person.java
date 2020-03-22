
public class Person 
{
	private String firstName;
	private String lastName;
	
	Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (o == this)
		{
			return true;
		}
		
		if (!(o instanceof Person))
		{
			return false;
		}
		
		Person p = (Person)o;
		return p.firstName.equals(getFirstName()) && p.lastName.equals(getLastName());
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
