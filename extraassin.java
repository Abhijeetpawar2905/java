/*
Revision_5) 
	it's a Developer- Client example
on a Developer side:

create a checked exception "VotingNotAllowedException".

define a class "Person" with a instance member "private String name" and "private int age"
define parameterized constructor and toString() method also.
In the parameterized constructor check the age passed while instantiating the class. if the age is less than 18 , constructor should raise "VotingNotAllowedException"
	[ it should not handle the exception]

	create jar file and documentation 


on Client side:

Define a class "Demo" with main function.
From main function create an object of "Person" and display that object.
*/

package DAY_8;

import java.util.Scanner;

class VotingNotAllowedException extends Exception
{
	VotingNotAllowedException(String s)
	{
		super(s);
	}
}

class Person
{
	private String name;
	private int age;
	
	Person(int age, String name ) throws VotingNotAllowedException
	{
		
		
		if(age<18)
		{
			throw new VotingNotAllowedException("age less than 18 ");
			
		}
		
		System.out.println("You are alowed for voting");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
	
}
public class extraassin {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age :");
		int age=sc.nextInt();
		
		System.out.println("Enter name :");
		String name = sc.next();
		
		try 
		{
			Person p = new Person(age, name);
			System.out.println(p.toString());
		} catch (VotingNotAllowedException e) {
			
			System.out.println(e);
		}
		
		
	}

}
