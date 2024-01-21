

/*
8)	Define a parent class with one function. Define child class with the function having 
same name as of parent class function, but having different argument.
Create an instance of child class and call the functions. 
Make sure u have followed the concept of “function overloading “ in inheritance.

*/package DAY_4;

class Vehicle
{
	private int tyre;
	Vehicle ()
	{
		System.out.println("Inside parent const");
	}
	
	public void average(int k)
	{
		this.tyre=k;
		System.out.println("vehicle average"+tyre);
	}
}
class Wagonr extends Vehicle
{
	int price;
	Wagonr()
	{
		System.out.println("Inside Wagonr Const");
	}
	public void average(int j) //overlodding method
	{
		this.price=j;
		System.out.println("wagonr price "+price);
	}
}
public class AssignQ8 {
	
	public static void main(String[] args) {
		
		Wagonr car = new Wagonr();
		car.average(10);
	}
	

}
