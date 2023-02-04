package myjavaexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
	public static void example()throws FileNotFoundException
	{
		FileInputStream t = new FileInputStream("D:\\KEERTHI-MBA\\final\\ruby.doc");
	}

	public static void main(String[] args) {
		try {
		ThrowsExample.example();
		}
		catch(FileNotFoundException f) {
			System.out.println("File not found");
		}
	}

}
