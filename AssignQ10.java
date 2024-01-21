
/*
10)	Define an interface “Vehicle” with “start()” function . 
Now derive  classes like “TwoWheeler”, “ThreeWheeler”,”FourWheeler” etc. 
from “Vehicle” and override “start()” function. Define a class “VDemo” in which  
write  main()  function. In the main function create a reference to Vehicle  class 
referring to any of the sub class. Using array, call “start" method.
*
*/

package DAY_4;
interface Vehicle1
{
	void start();

	
}
class TwoWheeler implements Vehicle1
{
	public void start()
	{
		System.out.println("TwoWheeler Start");
	}
}

class  ThreeWheeler implements Vehicle1 
{
	public void start()
	{
		System.out.println("Three wheeler start");
	}
}
class FourWheeler implements Vehicle1
{
	public void start()
	{
		System.out.println("Fourwheeler Start");
	}
}

public class AssignQ10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle1 arr[]=new Vehicle1[3];
		arr[0]=new TwoWheeler();
		arr[1]=new ThreeWheeler();
		arr[2]=new FourWheeler();
		
		for (int i =0; i<arr.length; i++)
		{
			arr[i].start();
		}
		
	}

}
