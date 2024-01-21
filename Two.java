//1)	Define 2 classes “First” and “Second” with member variables , member functions and constructors of  your choice. 
//Now define a class “Two” in which define main function .In main function create various instances of First and Second 
//and call their individual member functions.

package DAY_4;

class First
{
	int num1;
	private int num2;
	
	First()
	{
		num1=200;
		num2=100;
	}
	
	void setnum(int k)
	{
		this.num1=k;
	}
	public void disp()
	{
		System.out.println(num1+" "+num2);
	}
	First(int k)
	{
		this.num1=k;
		System.out.println("inside parameterized constructor");
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
}
class Second extends First
{
	int num1;
	private int num2;
	
	Second()
	{
		super(20);
		num1=500;
		num2=400;
	}
	public void disp2()
	{
		
		System.out.println(num1+" "+num2);
	}
	public void sub(int c, int d)
	{
		System.out.println(c-d);
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	
}
public class Two {


	public static void main(String [] args)
	{
		First f= new First();
		Second s = new Second();
		f.disp();
		f.add();
		f.sub(10, 20);
		f.setnum(20);
		
		s.disp2();
		s.add();
		s.sub(500,200);
	}

}
