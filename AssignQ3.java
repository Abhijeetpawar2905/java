/*3) define "MyException" as a checked exception.

define a class "Demo" with 
	public void show1(), public void show2() , public void show3() and main functions.

inside "show3()" accept a number and if it is greater than 10 raise "MyException" else display the number.
	[ this method shouldn't handle the exception]

main() function should call "show1()" , 
show1() function should call "show2()",
show2() function should call "show3()"*/

package DAY_8;

import java.util.*;

class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}

}
public class AssignQ3 {
	
	public static void main(String[] args) throws MyException {
		
		new AssignQ3().show1();
		System.out.println("Done");
	}
	public void show1() 
	{
		try {
		show2();
		}
		catch(MyException ie)
		{
			System.out.println(ie);
		}
	}
	public void show2() throws MyException
	{
		show3();
	}
	public void show3()throws MyException
	{
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num>10)
		{
			throw new MyException("number greater than 10");
		}
		
		System.out.println(num);
	}
	
}
