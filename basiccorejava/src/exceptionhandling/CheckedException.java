package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException 
{

	public static void main(String[] args) throws InterruptedException, FileNotFoundException 
	{
		System.out.println("name");
		
		Thread.sleep(600);//compiler checks the exception is called checkedException
		UncheckedExceptions.test();
		System.out.println("surname");
		FileInputStream obj=new FileInputStream("");

	}

} 
