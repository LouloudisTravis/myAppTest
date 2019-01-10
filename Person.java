public class Person{
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName){
		this.setFirstName(firstName);
		this.setLastName(lastName);
}
	public void setFirstName(String firstName) throws IllegalArgumentException {
		if (firstName.isEmpty())
			throw new IllegalArgumentException("cant pass empty first name")'
			
		this.firstName = firstName;
	}
	
	public void setLastName(String LastName) throws IllegalArgumentException {
                if (lastName.isEmpty())
                        throw new IllegalArgumentException("cant pass empty last name")'

                this.lastName = lastName;
}
