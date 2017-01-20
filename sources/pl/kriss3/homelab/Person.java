package pl.kriss3.homelab;
import java.util.Calendar;

/**
 * Person class to model a Peron
 * @author krzysztof szczurowski
 * @since 2017-01-13
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class01_Lab02.git
 */
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

	
	// Properties Getters and Setters for each private instance variable
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
