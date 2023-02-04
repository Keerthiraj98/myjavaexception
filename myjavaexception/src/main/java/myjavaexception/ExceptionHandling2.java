package myjavaexception;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		try // Outer try
		{
			
			try // inner try1
			{
				int a = 10/0;
				System.out.println(a);
			}
			catch(ArithmeticException s) // inner catch1
			{
				System.out.println("Division by 0 not allowed");
			}
			try // inner try2
			{
				String s = null;
				s.length();
			}
			catch(NullPointerException e)  // inner catch2
			{
				System.out.println("value is null");
			}
		}
		catch(Exception d) //Outer catch
		{
			System.out.println("call other exceptions");
		}
		finally
		{
			System.out.println("finally blocks");
		}
			

	}

}
