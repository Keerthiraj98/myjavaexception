package myjavaexception;

public class UserDefined1 {

	public static void main(String[] args) {
		try
		{
			throw new KeerthiDefinedException("This exception is created by keerthi");
		}
		catch(KeerthiDefinedException e)
		{
			System.out.println("this is my first exception");
			System.out.println(e);
			
		}
		finally
		{
			System.out.println("Thank you");
		}

	}

}
