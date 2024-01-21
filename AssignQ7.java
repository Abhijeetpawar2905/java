/*7)Define a parent and a child class . Now explain function overriding with Example.
*/
package DAY_4;


class Animal
{
	Animal()
	{
		System.out.println("In side Animal constructor");
	}
	
	public void eat()
	{
		System.out.println("Animal eat");
	}
	
}

class dog extends Animal
{
	dog()
	{
		System.out.println("In side dog constructor");
	}
	public void eat()
	{
	System.out.println("dog eat");	
	}
}
public class AssignQ7 {

	public static void main(String[] args) {
		
	
//	dog d = new dog();
//	d.eat();
//	
	Animal a= new Animal();
	a.eat();
	
	Animal a1=new dog();
	a1.eat();
	
	//dog d = new Animal();
}
}
