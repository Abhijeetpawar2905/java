/*5)Show the example of multi-level inheritance with constructor invocation.
*/

package DAY_4;

class Base1
{
//	int num1;
//	public int num2;
//	private int num3;
//	protected int num4;
	
	Base1()
	{
		System.out.println("Inside Base construct");
	}
	
	public void disp() {
		System.out.println("in side base disp");
		//System.out.println(num1+","+num2+","+num3+","+num4);
	}
}
class Child1 extends Base1
{
	Child1()
	{
		System.out.println("in side child1 constructor");
	}
	void disp1()
	{
		System.out.println("inside child1 disp");
	}
}
class Child2 extends Child1
{
	Child2()
	{
		System.out.println("in side child2 constructor");
	}
	
	 void disp3()
	{
		//super.disp1();
		System.out.println("in child2 disp");
	
	}
}
public class AssignQ5 {
	
	
	public static void main(String[] args) {
		 Child2 c= new Child2();
		 c.disp();
		 c.disp1();
		 c.disp3();
	}

}
