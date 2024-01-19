/*on the developer side create following interface:
	create necessary jar file and documentation

interface Vehicle { 
      
    // all are the abstract methods. 
    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a); 
} 


on the client side define following classes:

class FourWheeler implements Vehicle
{
	public void changeGear(int a)
	{
		// how to change gear in FourWheeler
	}
	public void speedUp(int a)
	{
		// how to speed up FourWheeler
	}
	public void applyBrakes(int a)
	{
		// how to apply brakes of FourWheeler
	}
}


class TwoWheeler implements Vehicle
{
	public void changeGear(int a)
	{
		// how to change gear in TwoWheeler
	}
	public void speedUp(int a)
	{
		// how to speed up TwoWheeler
	}
	public void applyBrakes(int a)
	{
		// how to apply brakes of TwoWheeler
	}
}

create one more class "Demo" with
	main and static perform method
while calling perform pass any implementation of "Vehicle" and invoke the methods polymorphically.*/

package DAY_6;
interface Vehicle { 
    
    // all are the abstract methods. 
    void changeGear(int a); 
    void speedUp(int a); 
    void applyBrakes(int a); 
} 
class FourWheeler implements Vehicle
{
	public void changeGear(int a)
	{
		System.out.println("change gear of fourewheeler to "+a);
	}
	public void speedUp(int a)
	{
		System.out.println("Speed up Fourwheleer to "+a);
	}
	public void applyBrakes(int a)
	{
		System.out.println("Apply brakes to fourwheeler on"+a);
	}
}
class TwoWheeler implements Vehicle
{
	public void changeGear(int a)
	{
		System.out.println("change gear of twoewheeler to "+a);
	}
	public void speedUp(int a)
	{
		System.out.println("Speed up twowheleer to "+a);
	}
	public void applyBrakes(int a)
	{
		System.out.println("Apply brakes to twowheeler on"+a);
	}
}

public class AssignQ3 {
	
	public static void perform (Vehicle v)
	{
		if(v instanceof FourWheeler)
		{
			v.changeGear(5);
			v.speedUp(60);
			v.applyBrakes(1);
		}
		else
		{
			v.changeGear(4);
			v.speedUp(45);
			v.applyBrakes(2);
		}
	}
	public static void main(String[] args) {
		
		perform(new FourWheeler());
		perform(new TwoWheeler());
		
	
	}

}
