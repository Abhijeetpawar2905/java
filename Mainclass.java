package DAY_1;

public class Mainclass {

	
	    
	    static int a = 5;
	    static
	    {
	        System.out.println("Executing static block");
	    }
	    
	    {
	        System.out.println("Executing non-static block");
	    }
	    
	    Mainclass()
	    {
	        System.out.println("Executing Constrcutor");
	    }
	    
	    
	    public static void main(String arg[])
	    {
	    	Mainclass m1 = new Mainclass();
	        System.out.println("Executing Main method");
	    }
	}


