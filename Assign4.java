/*5)Show the example of multi-level inheritance with constructor invocation.
*/
package DAY_4;

class Base
{
	int num1;
	public int num2;
	private int num3;
	protected int num4;
	
	Base()
	{
		System.out.println("in side base constructor");
	}
	public void disp1()
	{
		System.out.println("In side base disp");
		System.out.println(num1+","+num2+","+num3+","+num4);
	}
}

class Child extends Base
{
	Child()
	{
		System.out.println("in side child  constructor");
	}
	
	public  void disp2()
	{
		System.out.println("Inside child disp");
	}
}

public class Assign4 {
	
 public static void main(String[] args) {
	
	 Child c = new Child();
	 c.disp1();
	 c.disp2();
	 
	 
}
}
