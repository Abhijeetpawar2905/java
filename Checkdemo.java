/*3)	Define a class “Check” in which declare member variables using  different 
 * accessibility modifiers i.e.  <default>, private ,public and protected.   
 * Define a function “disp”  which should be public.  Define a class “CheckDemo” in 
 * which you will write “main()” function. Create an instance of  the class “Check” and  
 * show how many  variables can be accessed directly and how many indirectly.
*/

package DAY_4;
 class Check {
	
	 int num1;
	 public int num2;
	 private int num3;
	 protected int num4;
	 
	Check()
	{
		num1=10;
		num2=20;
		num3=30;
		num4=40;
	}

	public void disp()
	{
		System.out.println(num1+","+num2+","+num3+","+num4);
	}
}
public class Checkdemo
{
	public static void main(String[] args) {
	
		Check k =new Check();
		k.disp();
		
		int one =k.num1;
		int two =k.num2;
		//int three =k.num3;
		int four =k.num4;
		
		System.out.println(one+","+two+","+four);
		
}	
}
