
//display a table of a particular number     
package DAY_1;
import java.util.*;

public class Assign_1
{
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no :");
		int num=sc.nextInt();
		
		System.out.println("table of "+num);
		
		for(int i=1; i<=10;i++)
		{
			int r= num * i;
			
			System.out.println(num+" * "+ i+"="+r);
		}
	}

}
