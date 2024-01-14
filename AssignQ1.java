
/*1) define your exception class by name "MyArithException"
(MyArithException.java)
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will raise the  exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.
	[ this method shouldn't handle the exception]

Now define class "MyCalcApp" (MyCalcApp.java)
In this class you accept a number from user and pass that no. to
caldouble() method which is mentioned above.*/

package DAY_8;

import java.util.*;

class MyArithException extends Exception
{
	MyArithException(String s) 
	{
		super(s);
	}
}
class Calculator 
{
	static int Caldouble(int number)throws MyArithException
	{
		if(number<0)
		{
			throw new MyArithException("Negative no not alowed");
		}
		else if(number==0)
		{
			throw new MyArithException(" zero not alowed");
		}
		return 2*number;
	}
	
}
public class AssignQ1 {
	
	public static void main(String[] args) {

	System.out.println("Enter No :");
	Scanner sc= new Scanner(System.in);
	int number =sc.nextInt();
	
	try
	{
		Calculator.Caldouble(number);
	}
	catch(MyArithException ie)
	{
		System.out.println(ie);
	}
	System.out.println("succefully done");
	}
}
