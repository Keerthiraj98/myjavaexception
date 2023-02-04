package myjavaexception;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try { // outer try
			String s = null;
			s.length();
			//int a = 10 / 0;
			//System.out.println(a);
			}
			
		catch (NullPointerException n)//outer
		{
			// System.out.println(n);
			System.out.println("Your value is 'NULL'");
		} 
		catch (ArithmeticException d)//outer
		{

			System.out.println("Division by 0 is not allowed");
		}
		catch (Exception e)
		{
			System.out.println("call other exception");
		}
		
		 finally {
			System.out.println("This is my first exception handling pgm");
		}
	}

}
