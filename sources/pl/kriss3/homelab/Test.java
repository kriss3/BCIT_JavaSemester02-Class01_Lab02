package pl.kriss3.homelab;

public class Test 
{
	public static final int PARAM_LENGTH_ALLOWED = 4;
	public static void main(String[] args)
	{
		System.out.println("Lets begin: ... testing Person class \n");
		int paramCount = args.length;
		if(paramCount == PARAM_LENGTH_ALLOWED)
		{
			Run(args);
		}
		else 
		{
			System.out.println("Wrong number of arugments");
		}
	}
	
	private static void Run(String[] params)
	{
		Person p1 = new Person(params[0], params[1], Integer.parseInt(params[2]));
		p1.x = Double.parseDouble(params[3]);
		
		System.out.printf("First Name:\t%s\nLast Name:\t%s\nYear:\t%4d\nNumber:\t%.0f", 
				p1.getFirstName(), p1.getLastName(), p1.getYear(), p1.x);
		
		System.out.println("\nFinished !");
	}
}

