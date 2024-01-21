/*6)Show the example of hierarchical inheritance with constructor invocation.
*/
package DAY_4;


class Base1
{
	Base1()
	{
		System.out.println("In side Base  constructor");
	}
	void disp()
	{
		System.out.println("In side base disp");
	}
}
class sub1 extends Base1
{
	sub1()
	{
		System.out.println("In side Sub1 Contructor");
	}
	void disp1()
	{
		System.out.println("In side sub1 disp");
	}
}
class sub22 extends Base1
{
	sub22()
	{
		System.out.println("In side sub2 constructor ");
	}
	
	void disp2()
	{
		System.out.println("Inside sub2 disp");
	}
}
public class AssignQ6 {

	public static void main(String[] args) {
		
		sub22 s =new sub22();
		s.disp();
		//s.disp1(); can not access 
		s.disp2();
		
		sub1 s1= new sub1();
		s1.disp();
		s1.disp1();
	}
}
