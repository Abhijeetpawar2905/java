//display all prime numbers between 3 to 30

package DAY_1;

public class AssignQ6 {
	
	public static void main(String [] args)
	
	{
		
		for(int i=3; i<=30;i++)
		{
			if(isprime(i))
			{
				System.out.print(i+" ");
			}
		}
	}

	static boolean isprime(int num)
	{
	//	int cnt=0;
		
		
			for(int j=2; j<num; j++)
			{
				if(num%j==0)
				
					return false;
				}
				
				return true;
				
			}
	}


