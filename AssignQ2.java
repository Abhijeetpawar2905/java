/*
2) Define a class "MyClass" and make sure clients can instantiate it ,
a) without any argument
b) with one int argument
c) with two int arguments */



class MyClass {
	 MyClass()
 {
	     System.out.println("in default constructor");
	 }
	    MyClass(int a)
	    {
	        System.out.println("inside one parameter Constructor");
	    }

	    MyClass(int a, int b)
	    {
	        System.out.println("inside two parameter Constructor");
	    }

	        }

	public class AssignQ2 {
		
	    public static void main(String[] args) {
	        MyClass s1=new MyClass();
	        MyClass s2=new MyClass(10);
	        MyClass s3=new MyClass(10,20);
	        }
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
