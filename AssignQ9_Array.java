/*
9)	Define a class “Shape” with “draw()” function . Now derive  classes like “Circle”,
 “Polygon”,”Rectangle” etc. from “Shape” and override “draw()” function. 
 Define a class “ShapeDemo” in which  write  main()  function. 
 In the main function create a reference to Shape class referring to any of
  the sub class. Using array, call “draw()”  and check the result.
*/
package DAY_4;
class Shape
{
	void draw()
	{
		System.out.println("Shape Draw");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("circle draw");
	}
}
class Polygon extends Shape
{
	void draw()
	{
		System.out.println("polygon draw");
	}
}
class Square extends Shape
{
	void draw()
	{
		System.out.println("square draw");
	}
}


public class AssignQ9_Array {
	
	public static void main(String[] args) {
		
		Shape arr[]=new Shape[3];
		arr[0]=new Circle();
		arr[1]=new Polygon();
		arr[2]=new Square();
	
		for(int i =0; i<arr.length; i++)
		{
			arr[i].draw();
		}
	}

}
