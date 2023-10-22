/*
	5) Define 3 classes A , B and C
	in all these classes create static and nonstatic variables as well as methods.
		Now Define a class "Demo" ,in which define "main" function. From this main function
		try to access all the members of A ,B  and C.
	*/

package DAY_2;




	class A {
	    private static int A=13;
	    private int AA=23;
	    public static int getA()
	    {
	        return A;
	    }

	    public int getaa()
	    {
	        return AA;
	    }


	}
	class B {
	    private static int B=12;
	    private int BB=22;
	    public static int getB()
	    {
	        return B;
	    }

	    public int getBB()
	    {
	        return BB;
	    }

	}
	class C {
	    private static int C=11;
	    private int CC=21;
	    public static int getC()
	    {
	        return C;
	    }

	    public int getCC()
	    {
	        return CC;
	    }

	}
	public class AssignQ5 {
		
	    public static void main(String[] args) {
	               System.out.println(A.getA());
	               System.out.println(B.getB());
	               System.out.println(C.getC() +"\n");

	               A a=new A();
	                B b=new B();
	                C c=new C();
	                System.out.println(a.getaa());
	                System.out.println(b.getBB());
	                System.out.println(c.getCC());

	    }
	}