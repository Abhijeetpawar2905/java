package DAY_2;

 class Shape {
	
	private int width;
	private int height;
		 
	
		public int getWidth() {
		return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		
		
}

public class Shape1
{
	
	public static void main(String[]args)
	{
		Shape s1= new Shape();
		
		s1.setWidth(100);
		
		s1.setHeight(200);
		
		
		System.out.println(s1.getWidth());
		System.out.println(s1.getHeight());
		
	}
}
		
		
	




















