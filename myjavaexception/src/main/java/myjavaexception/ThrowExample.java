package myjavaexception;

public class ThrowExample {
	
	public void eligibilityCheck(int age, int weight )
	{
		if(age<12 && weight<40)
		{
			throw new ArithmeticException ("Student is not eligble");
		}
		else
		{
			System.out.println("Student is eligible");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Registration process");
		try
		{
			ThrowExample t = new ThrowExample();
			t.eligibilityCheck(11, 35);
		}
		catch(ArithmeticException f)
		{	
			System.out.println(f);
		}
		finally
		{
			System.out.println("Have a nice day");
		}
		
		
		
	}

}
