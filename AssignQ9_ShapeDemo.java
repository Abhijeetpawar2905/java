/*
9)	Define a class “Shape” with “draw()” function . Now derive  classes like “Circle”,
 “Polygon”,”Rectangle” etc. from “Shape” and override “draw()” function. 
 Define a class “ShapeDemo” in which  write  main()  function. 
 In the main function create a reference to Shape class referring to any of
  the sub class. Using this reference, call “draw()”  and check the result.
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
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("rrectangle draw");
	}
}

public class AssignQ9_ShapeDemo {
	
	
	static void perform(Shape s) {
		 
		 s.draw();
	 }
 public static void main(String[] args) {
	 
	 
	 
//	 Shape s = new Circle();
//	 s.draw();

	 perform(new Circle());
	 perform(new Polygon());
	 perform(new Rectangle());
	 }
}
