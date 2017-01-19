package pl.kriss3.homelab;
import java.util.Calendar;

public class Person 
{
	private String firstName;
	private String lastName;
	private int year;
	
	double x;
	
	public Person(String firstName, String lastName, int year)
	{
		setFirstName(firstName);
		setLastName(lastName);
		setYear(year);
	}

	public String getFirstName() 
	{
		return firstName;
	}

	private void setFirstName(String firstName) 
	{
		this.firstName = validateName(firstName);
	}

	public String getLastName() 
	{
		return lastName;
	}

	private void setLastName(String lastName) 
	{
		this.lastName = validateName(lastName);
	}

	public int getYear() 
	{
		return year;
	}

	private void setYear(int year) 
	{
		this.year = (year <= 0 || year > Calendar.getInstance().get(Calendar.YEAR)) ? 2016 : year; 
	}
	
	private String validateName(String value)
	{
		return (value.isEmpty() || value == null) ? "Incorrect Name !" : value;
	}
}
