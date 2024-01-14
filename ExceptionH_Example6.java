package DAY_8;

public class ExceptionH_Example6 {
	public static void main(String[] args) {
		
	
		int arr[]= new int [4];

		System.out.println("Array Created");

		try 
		{
			arr[4]=100;
		}
		catch(ArrayIndexOutOfBoundsException ae )
		{
			System.out.println("In catch "+ae);
		}
		finally
		{
			System.out.println("I am always Printed");
		}
		System.out.println("Array assigned");
		
		


}
}
