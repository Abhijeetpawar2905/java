//2)	Create a class with static and non-static member variables. Define static and non-static member functions. 
//Create instance of this class and call both static and non-static member functions.

package DAY_4;


class Sample
{
    int num1;
	
	static int num2;
	
	Sample()
	{
		num1=10;
		num2=30;
	}
	
	static void disp1()
	{
		System.out.println("Static variable num2 "+num2);
	}
	public void add()
	{
		System.out.println(num1+num2);
	}
	
	public void sub()
	{ 
		System.out.println(num1-num2);
	}
}

class Test
{
	int num3;
	static int  num4;
	
	Test()
	{
		num3=50;
		num4=60;
		
	}
	static void disp2()
	{
		System.out.println("static variable num4 :"+num4);
	}
	public void add()
	{
		System.out.println(num3+num4);
	}
	public void sub(int a, int b)
	{
		System.out.println(a-b);
	}
}
public class AssigQ2 {
	
	public static void main(String[] args) {
		
		Sample f = new Sample();
		Test s= new Test();
		
		Sample.disp1();
		f.add();
		f.sub();
		
		Test.disp2();
		s.add();
		s.sub(50, 20);
	}
}
	

