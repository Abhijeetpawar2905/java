package pattern;

	 public class pattern3{

		public static void main(String[] args) {
			
			char ch='A';
			for(int i=1; i<7; i++)
			{
				for(int s=1; s<i; s++)
				
				{
					System.out.print(" ");
				}
					
				for(int j=7; j>i; j--)
				{
					System.out.print(" "+ch);
					ch++;
				}	
				ch='A';
				System.out.println();
			}
			
		}

	}

