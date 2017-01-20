package pl.kriss3.homelab;

/**
 * Class Test as a runner class;
 * @author krzysztof szczurowski
 * @since 2017-01-13
 * @see https://github.com/kriss3/BCIT_JavaSemester02-Class01_Lab02.git
 */
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
		
		
		String format = "%-15s %10s\n";
		
		System.out.format(format,"First Name:", p1.getFirstName());
		System.out.format(format,"Last Name:", p1.getLastName());
		System.out.format(format,"Year:", p1.getYear());
		System.out.format(format,"Number:", p1.x);
		
		System.out.println("\nFinished !");
	}
}

