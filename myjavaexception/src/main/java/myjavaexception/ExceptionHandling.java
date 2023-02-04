package myjavaexception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try
		{
			int a = 10/0;
			System.out.println(a);
		}
		catch(ArithmeticException b)
		{
			System.out.println(b);
		}
		

	}

}
