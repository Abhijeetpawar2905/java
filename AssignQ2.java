/*2) on the developer side create an exception:
	NumberNotDivisibleBySevenException
	as a checked exception

create necessary jar and documentation.

on client side
	public class MyMath class with 
		public void disp(int num)
this disp() method will check if the number passed is not divisible by 7 , it will raise "NumberNotDivisibleBySevenException"
 or else it will simply display the number passed.
	[ this method shouldn't handle the exception]

	public class Demo
		main function 
		invoke "disp()" of "MyMath" class.*/

package DAY_8;
import java.util.*;

class NumberNotDivisibleBySevenException extends Exception
{
	NumberNotDivisibleBySevenException(String s)
	{
		super(s);
	}
}
class MyMath 
{
	public static void disp(int num)throws NumberNotDivisibleBySevenException
	{
		
			if(num%7!=0)
			{
				throw new NumberNotDivisibleBySevenException("No not divi by 7");
		    }
			System.out.println(num);
	}
}
public class AssignQ2 {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	int num=sc.nextInt();
	
	try
	{
		MyMath.disp(num);
	}
	catch(NumberNotDivisibleBySevenException ie)
	{
		System.out.println(ie);
	}
	
}
}
