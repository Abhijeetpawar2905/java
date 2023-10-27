
/*Q.1) Create interface "Course" , have an abstract method "start()". from this class inherit "Dac" ,
"PgDbda" and "MSCIT".
Now Define one more class
public class CourseDemo
inside "main" function create array of "Course" with 3 elements. Store the objects of Dac,PgDbda
and MSCIT inside this array. Now traverse the array and invoke "start()" method polymorphically.*/

package javatest;
interface Course
{
	abstract void start();
	
}
class Dac implements Course
{
	public void start()
	{
		System.out.println("Dac course Start");
	}
}
class PgDbda implements Course
{
	public void start()
	{
	System.out.println("PgDbda course Start");	
	}
}
class MSCIT implements Course
{
	public void start()
	{
		System.out.println("MSCIT course Start");
	}
}
public class Q1 {
public static void main(String[] args) {
	
	Course c[] = new Course[3];
	c[0] = new  Dac();
	c[1] = new PgDbda();
	c[2]= new MSCIT();
	
	
	
	for(int i=0; i<c.length; i++)
	{
		c[i].start();		
		
	}
}	
}


