/*
6) define static initializers in the above A,B and C classes and check the order of their execution
*/

package DAY_2;

class A {
    private static int A=13;
    private int AA=23;

    static
    {
        System.out.println("inside Static Initializer of A");
    }

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

    static
    {
        System.out.println("inside Static Initializer of B");
    }

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
    

    static
    {
        System.out.println("inside Static Initializer of C");
    }

    public static int getC()
    {
        return C;
    }

    public int getCC()
    {
        return CC;
    }

}
public class AssignQ6 {
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
