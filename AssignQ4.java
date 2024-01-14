/*4) on the developer side create following checked exception:
	InvalidLengthException
create necessary jar file and documentation.

on client side

public class Authenticator
	with
a parameterized constructor which takes String as a password.
this class also will have "done()" method with "successful authentication" message.
Parameterized constructor should check the length of the password passed if it is less than 5 or more that 9 , 
it should raise "InvalidLengthException" 
	[ constructor shouldn't handle the exception]

create a class "Demo" with main
	inside main function create the object of "Authenticator" class and invoke "done()" method.*/

package DAY_8;

import java.util.Scanner;

class InvalidLengthException extends Exception
{
	InvalidLengthException(String s)
	{
		super(s);
	}
}
class Authenticator 
{
	Authenticator(String s) throws InvalidLengthException
	{
		String pass;
		if(5>s.length() || s.length()>9)
		{
			throw new InvalidLengthException("Invalid Passwod enter bet 5 -9");
		}
		pass=s;
	}
	void done()
	{
		System.out.println("Sucessfully Done");
	}
}

public class AssignQ4 {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String pass=sc.next();
		
		try
		{
			Authenticator a = new Authenticator(pass);
			a.done();
		}
		catch(InvalidLengthException ie)
		{
			System.out.println(ie);
		}
	}
	

	
}
